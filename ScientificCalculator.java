import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Math;

public class ScientificCalculator extends JFrame implements ActionListener {
    private JTextField inputField;
    private JTextArea outputArea;

    public ScientificCalculator() {
        setTitle("Scientific Calculator");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        inputField = new JTextField();
        outputArea = new JTextArea();
        outputArea.setEditable(false);

        JPanel buttonPanel = new JPanel(new GridLayout(4, 4, 5, 5));
        String[] buttons = {"sin", "cos", "tan", "sqrt", "log", "pow", "exp", "π", "Clear", "Back"};

        for (String b : buttons) {
            JButton btn = new JButton(b);
            btn.addActionListener(this);
            buttonPanel.add(btn);
        }

        setLayout(new BorderLayout(10, 10));
        add(inputField, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        add(new JScrollPane(outputArea), BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        try {
            switch (cmd) {
                case "sin" -> outputArea.setText("sin = " + Math.sin(Math.toRadians(Double.parseDouble(inputField.getText()))));
                case "cos" -> outputArea.setText("cos = " + Math.cos(Math.toRadians(Double.parseDouble(inputField.getText()))));
                case "tan" -> outputArea.setText("tan = " + Math.tan(Math.toRadians(Double.parseDouble(inputField.getText()))));
                case "sqrt" -> outputArea.setText("√ = " + Math.sqrt(Double.parseDouble(inputField.getText())));
                case "log" -> outputArea.setText("log = " + Math.log(Double.parseDouble(inputField.getText())));
                case "exp" -> outputArea.setText("exp = " + Math.exp(Double.parseDouble(inputField.getText())));
                case "π" -> inputField.setText(String.valueOf(Math.PI));
                case "pow" -> {
                    String num = JOptionPane.showInputDialog("Enter power value:");
                    outputArea.setText("Power = " + Math.pow(Double.parseDouble(inputField.getText()), Double.parseDouble(num)));
                }
                case "Clear" -> inputField.setText("");
                case "Back" -> {
                    dispose();
                    new HomePage();
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Invalid Input!");
        }
    }
}
