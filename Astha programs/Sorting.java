import java.util.*;

class Sorting {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n = sc.nextInt();
        String s[] = new String[n];
        sc.nextLine(); // Consume the newline character
        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < n; i++) { // Change the condition to i < n
            s[i] = sc.next();
        }

        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length - i - 1; j++) {
                if (s[j].compareTo(s[j + 1]) > 0) {
                    String t = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = t;
                }
            }
        }

        System.out.println("Names after sorting");
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
