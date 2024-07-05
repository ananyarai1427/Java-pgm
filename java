import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class NumGameGUI extends JFrame implements ActionListener {
    private final Random random;
    private final JTextArea outputArea;
    private final JTextField lowerLimitField;
    private final JTextField upperLimitField;
    private int attempts;

    private final String PANDA_START = "           __\n" +
            "          / _)\n" +
            "    .-^^^-/ /\n" +
            " __/       /\n" +
            "<__.|_|-|_|\n";
    private final String PANDA_END = "       __\n" +
            "     .'. \\\n" +
            "    /   \\ \\\n" +
            "    |o o| |\n" +
            "    \\_^_/ |\n" +
            "   .' |   |\n" +
            "  /_/ \\  |\n" +
            "       |U |\n" +
            "       |  |\n" +
            "       |__|\n";

    public NumGameGUI() {
        random = new Random();
        outputArea = new JTextArea();
        lowerLimitField = new JTextField();
        upperLimitField = new JTextField();

        setTitle("Number Game");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lowerLabel = new JLabel("Lower Limit:");
        lowerLabel.setBounds(20, 20, 100, 30);
        add(lowerLabel);

        lowerLimitField.setBounds(120, 20, 100, 30);
        add(lowerLimitField);

        JLabel upperLabel = new JLabel("Upper Limit:");
        upperLabel.setBounds(20, 60, 100, 30);
        add(upperLabel);

        upperLimitField.setBounds(120, 60, 100, 30);
        add(upperLimitField);

        JButton startButton = new JButton("Start Game");
        startButton.setBounds(20, 100, 200, 30);
        startButton.addActionListener(this);
        add(startButton);

        outputArea.setBounds(20, 140, 340, 100);
        outputArea.setEditable(false);
        add(outputArea);

        attempts = 0;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Start Game")) {
            int lowerLimit = Integer.parseInt(lowerLimitField.getText());
            int upperLimit = Integer.parseInt(upperLimitField.getText());

            if (lowerLimit >= upperLimit) {
                outputArea.setText("Incorrect Sequence of limits");
                return;
            }

            int targetNumber = random.nextInt(upperLimit - lowerLimit + 1) + lowerLimit;

            attempts = 0;
            outputArea.setText(PANDA_START + "\n");
            playGame(lowerLimit, upperLimit, targetNumber);
        }
    }

    private void playGame(int lowerLimit, int upperLimit, int targetNumber) {
        while (attempts < 10) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Guess a number:"));

            if (num < lowerLimit || num > upperLimit) {
                outputArea.append("\nNumber out of limit. Retry");
            } else if (num > targetNumber) {
                outputArea.append("\nToo high! Retry");
            } else if (num < targetNumber) {
                outputArea.append("\nToo low! Retry");
            } else {
                outputArea.append("\nCongratulations! You guessed the number in " + (attempts + 1) + " attempts.");
                outputArea.append("\nThe correct number was: " + targetNumber);
                outputArea.append("\n" + PANDA_END);
                break;
            }

            attempts++;
        }

        if (attempts == 10) {
            outputArea.append("\nYour all attempts are over. You failed to guess the correct number.");
            outputArea.append("\nThe correct number was: " + targetNumber);
            outputArea.append("\n" + PANDA_END);
        }

        int choice = JOptionPane.showConfirmDialog(null, "Do you want to play this game again?", "Play Again?", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            lowerLimitField.setText("");
            upperLimitField.setText("");
            outputArea.setText("");
            attempts = 0;
        }
    }

    public static void main(String[] args) {
        NumGameGUI game = new NumGameGUI();
        game.setVisible(true);
    }
}
