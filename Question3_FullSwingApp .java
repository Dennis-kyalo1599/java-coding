/*
Name: Denis Kyalo Mutie
Admission Number: J77-10566-2024

Question 3:
Create a comprehensive Java Swing application that includes:
- A label and a text field to enter name, with a "Submit" button.
- Username label, text field, and a "Login" button.
- A checkbox labeled "Accept Terms" and a radio button labeled "Male".
- A combo box with options "Java", "Python", "C++".
- A grid layout resembling a calculator with buttons for digits 1–9, 0 and basic arithmetic options.
- A "Click Me" button that shows a message dialog "Button Clicked!".
- A menu bar with File > New, Open, Exit.
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Question3_FullSwingApp {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Java Swing Exercise");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // ===== MENU BAR =====
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        fileMenu.add(new JMenuItem("New"));
        fileMenu.add(new JMenuItem("Open"));
        fileMenu.add(new JMenuItem("Exit"));
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);

        // ===== TOP PANEL =====
        JPanel topPanel = new JPanel(new GridLayout(2, 3, 5, 5));

        topPanel.add(new JLabel("Name:"));
        JTextField nameField = new JTextField();
        JButton submitButton = new JButton("Submit");

        topPanel.add(nameField);
        topPanel.add(submitButton);

        topPanel.add(new JLabel("Username:"));
        JTextField userField = new JTextField();
        JButton loginButton = new JButton("Login");

        topPanel.add(userField);
        topPanel.add(loginButton);

        // ===== MIDDLE PANEL =====
        JPanel middlePanel = new JPanel();

        JCheckBox terms = new JCheckBox("Accept Terms");
        JRadioButton male = new JRadioButton("Male");

        String[] languages = {"Java", "Python", "C++"};
        JComboBox<String> comboBox = new JComboBox<>(languages);

        JButton clickMe = new JButton("Click Me");

        clickMe.addActionListener(e ->
            JOptionPane.showMessageDialog(frame, "Button Clicked!")
        );

        middlePanel.add(terms);
        middlePanel.add(male);
        middlePanel.add(comboBox);
        middlePanel.add(clickMe);

        // ===== CALCULATOR PANEL =====
        JPanel calcPanel = new JPanel(new GridLayout(4, 4, 5, 5));

        String[] buttons = {
            "7","8","9","+",
            "4","5","6","-",
            "1","2","3","*",
            "0","/","=","C"
        };

        for (String text : buttons) {
            calcPanel.add(new JButton(text));
        }

        // ===== ADD TO FRAME =====
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(middlePanel, BorderLayout.CENTER);
        frame.add(calcPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
