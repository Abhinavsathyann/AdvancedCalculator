import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AboutPage extends JFrame {
    public AboutPage() {
        setTitle("About This App");
        setSize(400, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JTextArea text = new JTextArea("""
                Advanced Java Calculator
                ------------------------
                Created by: Abhinav K
                Technologies: Java Swing, OOP
                Features: Basic + Scientific Calculations
                Version: 2.0
                """);
        text.setEditable(false);
        text.setFont(new Font("Monospaced", Font.PLAIN, 14));
        add(text, BorderLayout.CENTER);

        JButton back = new JButton("Back");
        back.addActionListener(e -> {
            dispose();
            new HomePage();
        });
        add(back, BorderLayout.SOUTH);

        setVisible(true);
    }
}
