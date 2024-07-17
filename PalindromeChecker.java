import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PalindromeChecker {
    public static void main(String[] args) {
        // Create JFrame instance
        JFrame frame = new JFrame("Palindrome Checker");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create and add JLabel
        JLabel label = new JLabel("Enter a number:");
        label.setBounds(20, 20, 100, 30);
        frame.add(label);

        // Create and add JTextField
        JTextField textField = new JTextField();
        textField.setBounds(130, 20, 130, 30);
        frame.add(textField);

        // Create and add JButton
        JButton button = new JButton("Check");
        button.setBounds(100, 70, 100, 30);
        frame.add(button);

        // Create and add JLabel for result
        JLabel resultLabel = new JLabel("");
        resultLabel.setBounds(20, 120, 240, 30);
        frame.add(resultLabel);

        // Add action listener to button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = textField.getText();
                if (isNumericPalindrome(input)) {
                    resultLabel.setText(input + " is a numeric palindrome");
                } else {
                    resultLabel.setText(input + " is not a numeric palindrome");
                }
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }

    // Method to check if a string represents a numeric palindrome
    public static boolean isNumericPalindrome(String input) {
        int length = input.length();
        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
