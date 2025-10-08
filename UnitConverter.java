import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UnitConverter extends JFrame {
    private JComboBox<String> typeBox;
    private JTextField inputField;
    private JTextArea outputArea;

    public UnitConverter() {
        setTitle("Unit Converter");
        setSize(450, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new GridLayout(5, 1, 10, 10));

        typeBox = new JComboBox<>(new String[]{"Length (m ↔ km)", "Weight (kg ↔ g)", "Temperature (°C ↔ °F)"});
        inputField = new JTextField();
        outputArea = new JTextArea();
        outputArea.setEditable(false);

        JButton convertBtn = new JButton("Convert");
        JButton backBtn = new JButton("Back");

        add(new JLabel("Select Conversion Type:"));
        add(typeBox);
        add(inputField);
        add(convertBtn);
        add(outputArea);
        add(backBtn);

        convertBtn.addActionListener(e -> convert());
        backBtn.addActionListener(e -> {
            dispose();
            new HomePage();
        });

        setVisible(true);
    }

    private void convert() {
        try {
            double value = Double.parseDouble(inputField.getText());
            String type = (String) typeBox.getSelectedItem();
            double result;

            switch (type) {
                case "Length (m ↔ km)" -> outputArea.setText(value + " m = " + (value / 1000) + " km");
                case "Weight (kg ↔ g)" -> outputArea.setText(value + " kg = " + (value * 1000) + " g");
                case "Temperature (°C ↔ °F)" -> outputArea.setText(value + " °C = " + ((value * 9 / 5) + 32) + " °F");
                default -> outputArea.setText("Invalid conversion!");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid Input!");
        }
    }
}
