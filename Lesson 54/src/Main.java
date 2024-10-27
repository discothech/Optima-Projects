import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    JFrame frame;
    JPanel panel;
    JButton btn;
    JLabel label;
    JComboBox<String> zaim;
    JComboBox<String> verb;
    JComboBox<String> noun;
    //JTextField text;
    GridBagLayout layout;
    GridBagConstraints gbc;

    public void run(){
        frame = new JFrame("Make the sentence");
        frame.setBounds(500, 200, 500, 300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        panel = new JPanel();
        frame.add(panel);
        // GridBag
        layout = new GridBagLayout();
        gbc = new GridBagConstraints();
        gbc.insets=new Insets(10,10,10,10);
        panel.setLayout(layout);
        gbc.anchor=GridBagConstraints.WEST;
        // Label
        label = new JLabel("Make the sentence: ");
        panel.add(label, gbc);
        // Vikna
        String[] zaimennyky = {"I", "You", "He", "She", "We", "They"};
        zaim = new JComboBox<String>(zaimennyky);
        panel.add(zaim);
        String[] verbs = {"have", "eat", "drink", "has", "eats", "drinks"};
        verb = new JComboBox<String>(verbs);
        panel.add(verb);
        String[] nouns = {"apple", "banana", "laptop", "book", "tea", "juice"};
        noun = new JComboBox<String>(nouns);
        panel.add(noun);
        // Button
        btn = new JButton("OK");
        ActionListener actionListener = new TestActionListener();
        btn.addActionListener(actionListener);
        gbc.gridy=2;
        gbc.anchor=GridBagConstraints.CENTER;
        panel.add(btn,gbc);
        frame.setVisible(true);
    }

    public void createFrame(){
        frame = new JFrame("Make the sentence");
        frame.setBounds(500, 200, 500, 300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        panel = new JPanel();
        frame.add(panel);
        layout=new GridBagLayout();
        gbc=new GridBagConstraints();
        gbc.insets=new Insets(10,10,10,10);
        panel.setLayout(layout);
    }

    public class TestActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            createFrame();
            JLabel labelWithName = new JLabel(zaim.getSelectedItem() + " "+verb.getSelectedItem()+" "+noun.getSelectedItem());
            panel.add(labelWithName);
            frame.setVisible(true);
        }
    }

    public static void main(String[] args) {
        Main task = new Main();
        task.run();
    }
}