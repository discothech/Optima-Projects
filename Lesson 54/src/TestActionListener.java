import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestActionListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        JButton button = new JButton("Test button");
        ActionListener actionListener = new TestActionListener();
        button.addActionListener(actionListener);
    }
}
