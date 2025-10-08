import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class HistoryPage extends JFrame {
    private static ArrayList<String> history = new ArrayList<>();
    private JTextArea area;

    public static void addRecord(String record) {
        history.add(record);
    }

    public HistoryPage() {
        setTitle("Calculation History");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        area = new JTextArea();
        area.setEditable(false);
        history.forEach(r -> area.append(r + "\n"));

        JButton backBtn = new JButton("Back");
        backBtn.addActionListener(e -> { dispose(); new HomePage(); });

        add(new JScrollPane(area), BorderLayout.CENTER);
        add(backBtn, BorderLayout.SOUTH);

        setVisible(true);
    }
}
