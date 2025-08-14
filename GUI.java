package LoginSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * This is shows the graphics of the login system 
 * Includes the logic that detects offensive username
 * Linked to Login class.
 * 
 * @author Nigel Goes 
 * @version 1.0
 */
public class GUI {
    /**
     * This is the main entry for the graphics to be displayed.
     * This method sets up and displays the main application window (JFrame)
     * @param args
     */
    public static void main(String[] args) {
        // Creating the window
        JFrame frame1 = new JFrame("Welcome to the Login Page:");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(500, 300);

        // Creating a panel to hold elements
        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(7, 2, 10, 10)); // grid with spacing
        frame1.add(panel1);
        placeComponents(panel1);

        frame1.setVisible(true);
    }

    /**
     * Adds all the UI panels 
     * It includes all sorts of labels, text field, register button and user input
     * It has registration logic 
     * Input validation
     * @param panel1
     */

    private static void placeComponents(JPanel panel1) {
        // Labels and input fields
        JLabel nameLabel = new JLabel("Full Name:");
        JTextField nameField = new JTextField();

        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField();

        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField();

        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();

        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
        JPasswordField confirmPasswordField = new JPasswordField();

        JButton registerButton = new JButton("Register");
        JLabel messageLabel = new JLabel(""); // Display feedback

        // Add components to panel
        panel1.add(nameLabel);
        panel1.add(nameField);

        panel1.add(emailLabel);
        panel1.add(emailField);

        panel1.add(usernameLabel);
        panel1.add(usernameField);

        panel1.add(passwordLabel);
        panel1.add(passwordField);

        panel1.add(confirmPasswordLabel);
        panel1.add(confirmPasswordField);

        panel1.add(registerButton);
        panel1.add(messageLabel);

        // Register button action
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText().trim();
                String email = emailField.getText().trim();
                String username = usernameField.getText().trim();
                String password = new String(passwordField.getPassword());
                String confirmPassword = new String(confirmPasswordField.getPassword());

                // Validations using Login.java methods
                if (name.isEmpty() || email.isEmpty() || username.isEmpty() || password.isEmpty()) {
                    messageLabel.setText("Please fill in all fields.");
                } else if (!Login.isValidEmail(email)) {
                    messageLabel.setText("Invalid email. Must end with @gmail.com");
                } else if (Login.isOffensiveUsername(username)) {
                    messageLabel.setText("Username contains prohibited words.");
                } else if (!password.equals(confirmPassword)) {
                    messageLabel.setText("Passwords do not match.");
                } else if (Login.isStrongPassword(password)) {
                    messageLabel.setText("Weak password. Use upper, lower, number & symbol.");
                } else {
                    messageLabel.setText("Thank You for completing the registration!!");
                }
            }
        });
    }
}
