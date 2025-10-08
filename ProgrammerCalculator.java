import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ProgrammerCalculator extends JFrame {
    private JTextField inputField;
    private JTextArea resultArea;

    public ProgrammerCalculator() {
        setTitle("Programmer Calculator");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        inputField = new JTextField();
        resultArea = new JTextArea();
        resultArea.setEditable(false);

        JButton convertBtn = new JButton("Convert");
        JButton backBtn = new JButton("Back");

        JPanel panel = new JPanel(new GridLayout(1, 2));
        panel.add(convertBtn);
        panel.add(backBtn);

        add(new JLabel("Enter Decimal Number:"), BorderLayout.NORTH);
        add(inputField, BorderLayout.CENTER);
        add(resultArea, BorderLayout.SOUTH);
        add(panel, BorderLayout.PAGE_END);

        convertBtn.addActionListener(e -> {
            try {
                int num = Integer.parseInt(inputField.getText());
                resultArea.setText(
                    "Binary: " + Integer.toBinaryString(num) + "\n" +
                    "Octal: " + Integer.toOctalString(num) + "\n" +
                    "Hex: " + Integer.toHexString(num).toUpperCase()
                );
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Invalid input!");
            }
        });

        backBtn.addActionListener(e -> {
            dispose();
            new HomePage();
        });

        setVisible(true);
    }
}
