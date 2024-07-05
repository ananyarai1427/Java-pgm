import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class QueensGame extends JFrame {
    private int n;
    private JButton[][] buttons;
    private JLabel messageLabel;
    private ArrayList<Point> queens;
    private ImageIcon queenIcon;
    private JButton quitButton;

    public QueensGame() {
        // GUI setup
        setTitle("Queens Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize the window
        setLayout(new BorderLayout());

        showInputDialog();
    }

    private void showInputDialog() {
        // Create background panel
        BackgroundPanel background = new BackgroundPanel(new ImageIcon("Back.png").getImage());
        background.setLayout(new BorderLayout());

        // Input dialog for board size
        JPanel inputPanel = new JPanel();
        inputPanel.setOpaque(false);
        inputPanel.setLayout(new FlowLayout());
        inputPanel.add(new JLabel("Enter board size (n):"));
        JTextField inputField = new JTextField(5);
        inputPanel.add(inputField);

        background.add(inputPanel, BorderLayout.CENTER);
        add(background, BorderLayout.CENTER);

        setVisible(true);

        // Request focus for the input field after a short delay
        SwingUtilities.invokeLater(() -> inputField.requestFocusInWindow());

        // Show the input dialog
        int result = JOptionPane.showConfirmDialog(
            this, inputPanel, "Board Size",
            JOptionPane.OK_CANCEL_OPTION,
            JOptionPane.PLAIN_MESSAGE
        );

        if (result == JOptionPane.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(this, "Game canceled.");
            System.exit(0);
        }

        try {
            n = Integer.parseInt(inputField.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input. Exiting game.");
            System.exit(0);
        }

        while (n <= 3) {
            inputField.setText("");
            SwingUtilities.invokeLater(() -> inputField.requestFocusInWindow()); // Ensure the cursor blinks
            result = JOptionPane.showConfirmDialog(
                this, inputPanel, "Board Size",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE
            );
            if (result == JOptionPane.CANCEL_OPTION) {
                JOptionPane.showMessageDialog(this, "Game canceled.");
                System.exit(0);
            }

            try {
                n = Integer.parseInt(inputField.getText().trim());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid input. Exiting game.");
                System.exit(0);
            }
        }

        getContentPane().removeAll();
        setupChessBoard();
    }

    private void setupChessBoard() {
        buttons = new JButton[n][n];
        queens = new ArrayList<>();
        JPanel boardPanel = new JPanel(new GridLayout(n, n));
        boardPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 4)); // Thicker boundary lines

        // Initialize buttons
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                JButton button = new JButton();
                button.setPreferredSize(new Dimension(80, 80)); // Adjust button size
                button.setOpaque(true);
                button.setBorderPainted(false);
                button.setBackground((i + j) % 2 == 0 ? new Color(222, 184, 135) : new Color(139, 69, 19)); // Alternating brown and cream colors
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        placeQueen(button);
                    }
                });
                boardPanel.add(button);
                buttons[i][j] = button;
            }
        }

        add(boardPanel, BorderLayout.CENTER);

        // Quit button
        quitButton = new JButton("Quit");
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object[] options = {"Retry", "Quit"};
                int confirm = JOptionPane.showOptionDialog(
                    null, "Are you sure you want to quit?", "Quit Game",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, options, options[0]
                );
                if (confirm == JOptionPane.NO_OPTION) {
                    System.exit(0);
                } else if (confirm == JOptionPane.YES_OPTION) {
                    retryGame();
                }
            }
        });
        add(quitButton, BorderLayout.SOUTH);

        // Message label
        messageLabel = new JLabel("Place queens on the board.");
        add(messageLabel, BorderLayout.NORTH);

        pack();
        setVisible(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH); // Ensure the frame is maximized

        // Resize queen icon to fit the button size
        resizeQueenIcon();
    }

    private void resizeQueenIcon() {
        // Check if there are any buttons and get their dimensions
        if (buttons != null && buttons.length > 0 && buttons[0].length > 0) {
            int buttonWidth = buttons[0][0].getWidth();
            int buttonHeight = buttons[0][0].getHeight();

            // Load and resize queen icon
            ImageIcon originalIcon = new ImageIcon("queen.png");
            Image originalImage = originalIcon.getImage();
            Image resizedImage = originalImage.getScaledInstance(buttonWidth, buttonHeight, Image.SCALE_SMOOTH);
            queenIcon = new ImageIcon(resizedImage);
        }
    }

    private void placeQueen(JButton button) {
        Point position = findButtonPosition(button);
        if (position == null) {
            JOptionPane.showMessageDialog(this, "Button position not found. Please check your code.");
            return;
        }

        if (!isThreatened(position)) {
            queens.add(position);
            button.setIcon(queenIcon);
            button.setText(""); // No need for text
        } else {
            JOptionPane.showMessageDialog(this, "Queen cannot be placed here. It's threatened by another queen.");
        }

        if (queens.size() == n) {
            if (isSolution()) {
                JOptionPane.showMessageDialog(this, "Congratulations! You won!");
            } else {
                JOptionPane.showMessageDialog(this, "Queens are not correctly placed. Please try again.");
            }
        }
    }

    private boolean isThreatened(Point position) {
        for (Point queen : queens) {
            if (queen.x == position.x || queen.y == position.y || Math.abs(queen.x - position.x) == Math.abs(queen.y - position.y)) {
                return true;
            }
        }
        return false;
    }

    private boolean isSolution() {
        // Check if no two queens threaten each other
        for (int i = 0; i < queens.size(); i++) {
            for (int j = i + 1; j < queens.size(); j++) {
                Point queen1 = queens.get(i);
                Point queen2 = queens.get(j);
                if (queen1.x == queen2.x || queen1.y == queen2.y || Math.abs(queen1.x - queen2.x) == Math.abs(queen1.y - queen2.y)) {
                    return false;
                }
            }
        }
        return true;
    }

    private Point findButtonPosition(JButton button) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (buttons[i][j] == button) {
                    return new Point(i, j);
                }
            }
        }
        return null;
    }

    private void retryGame() {
        queens.clear();
        getContentPane().removeAll(); // Remove all components from the frame

        // Create background panel
        BackgroundPanel background = new BackgroundPanel(new ImageIcon("Back.png").getImage());
        background.setLayout(new BorderLayout());

        // Input dialog for board size
        JPanel inputPanel = new JPanel();
        inputPanel.setOpaque(false);
        inputPanel.setLayout(new FlowLayout());
        inputPanel.add(new JLabel("Enter board size (n):"));
        JTextField inputField = new JTextField(5);
        inputPanel.add(inputField);
        background.add(inputPanel, BorderLayout.CENTER);

        add(background, BorderLayout.CENTER);

        revalidate(); // Refresh the frame
        repaint();

        // Request focus for the input field after a short delay
        SwingUtilities.invokeLater(() -> inputField.requestFocusInWindow());

        // Show the input dialog
        int result = JOptionPane.showConfirmDialog(
            this, inputPanel, "Board Size",
            JOptionPane.OK_CANCEL_OPTION,
            JOptionPane.PLAIN_MESSAGE
        );

        if (result == JOptionPane.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(this, "Game canceled.");
            System.exit(0);
        }

        try {
            n = Integer.parseInt(inputField.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input. Exiting game.");
            System.exit(0);
        }

        while (n <= 3) {
            inputField.setText("");
            SwingUtilities.invokeLater(() -> inputField.requestFocusInWindow()); // Ensure the cursor blinks
            result = JOptionPane.showConfirmDialog(
                this, inputPanel, "Board Size",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE
            );
            if (result == JOptionPane.CANCEL_OPTION) {
                JOptionPane.showMessageDialog(this, "Game canceled.");
                System.exit(0);
            }

            try {
                n = Integer.parseInt(inputField.getText().trim());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid input. Exiting game.");
                System.exit(0);
            }
        }

        getContentPane().removeAll();
        setupChessBoard();
    }

    public static void main(String[] args) {
        QueensGame game = new QueensGame();
        game.setExtendedState(JFrame.MAXIMIZED_BOTH); // Set the frame to full screen
    }

    // Custom panel to scale background image
    class BackgroundPanel extends JPanel {
        private Image backgroundImage;

        public BackgroundPanel(Image backgroundImage) {
            this.backgroundImage = backgroundImage;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }
}
//ananya is good