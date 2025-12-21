/*
Name: Denis Kyalo Mutie
Admission Number: J77-10566-2024

Question 2:
Create a Swing application with a menu bar containing File > New, Open, Exit.
*/

import javax.swing.*;

public class Question2_MenuBar {
    public static void main(String[] args) {

        // Create frame
        JFrame frame = new JFrame("Menu Example");

        // Create menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create menu
        JMenu fileMenu = new JMenu("File");

        // Create menu items
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");

        // Add menu items to menu
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(exitItem);

        // Add menu to menu bar
        menuBar.add(fileMenu);

        // Set menu bar to frame
        frame.setJMenuBar(menuBar);

        // Frame settings
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
