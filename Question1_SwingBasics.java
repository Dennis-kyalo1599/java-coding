/*
Name: Denis Kyalo Mutie
Admission Number: J77-10566-2024

Question 1:
Create a Java Swing program that displays a window containing:
i. A label
ii. A text field
iii. A button
All components must be placed inside a panel, which is then added to a frame.
*/

import javax.swing.*;

public class Question1_SwingBasics {
    public static void main(String[] args) {

        // Create frame
        JFrame frame = new JFrame("Swing Structure");

        // Create panel
        JPanel panel = new JPanel();

        // Create components
        JLabel label = new JLabel("Name:");
        JTextField textField = new JTextField(15);
        JButton button = new JButton("Submit");

        // Add components to panel
        panel.add(label);
        panel.add(textField);
        panel.add(button);

        // Add panel to frame
        frame.add(panel);

        // Frame settings
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
