import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HelpPage extends JFrame {
    public HelpPage() {
        setTitle("Help & Instructions");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JTextArea area = new JTextArea("""
                Welcome to Advanced Java Calculator!
                
                - Basic Calculator → +, -, ×, ÷
                - Scientific → sin, cos, tan, log, sqrt
                - Programmer → binary, hex, octal
                - Unit Converter → length, weight, temperature
                - History → view past calculations
                - Settings → change themes

                Created by: Abhinav K
                """);
        area.setEditable(false);
        add(new JScrollPane(area), BorderLayout.CENTER);

        JButton backBtn = new JButton("Back");
        backBtn.addActionListener(e -> { dispose(); new HomePage(); });
        add(backBtn, BorderLayout.SOUTH);

        setVisible(true);
    }
}
