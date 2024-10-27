import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task1 {
    JFrame frame; // Фрейм
    JPanel panel; // Панель
    GridBagLayout gbl; //Менеджер компановки
    GridBagConstraints gbc; //Обмеження на розташування компонентів
    JList <String> countries; // Список країн
    JList<ImageIcon> flags; // Список прапорів
    JButton button; // Кнопка

    public void create(){
        frame = new JFrame("Task 1");
        frame.setBounds(100,100,600, 600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
// Створюємо панель.
        panel = new JPanel();
// Додаємо менеджер компановки GridBagLayout для того, щоб ми могли правильно розташувати елементи на панелі.
        gbl = new GridBagLayout();
        gbc = new GridBagConstraints();
//Вказуємо, що між компонентами повинна бути певна відстань: верхня, нижня та ліва відстані рівні 10, права відстань рівна 20.
        gbc.insets = new Insets(10,10,10,20);
//Початкове розташування компонента встановлюємо в положенні х=0, y=0.
        gbc.gridx = 0;
        gbc.gridy = 0;
        createListCountries();
        createListFlags();
        createButton();
//Додаємо менеджер компановки на панель.
        panel.setLayout(gbl);
//Додаємо панель до фрейму.
        frame.add(panel);
        frame.setVisible(true);
    }
    private void createButton(){
        button = new JButton("OK");
        gbc.gridy = 2;
        button.addActionListener(new PressButton());
        panel.add(button, gbc);
    }
    private void createListCountries(){
        String [] country = {"Ukraine", "Romania", "Germany", "USA", "Spain"};
        countries = new JList<>(country);
        panel.add(countries, gbc);
    }
    private void createListFlags(){
        ImageIcon USA = new ImageIcon("USA.JPG");
        ImageIcon France = new ImageIcon("France.JPG");
        ImageIcon Ukraine = new ImageIcon("Ukraine.JPG");
        ImageIcon Romania = new ImageIcon("Romania.JPG");
        ImageIcon Spain = new ImageIcon("Spain.JPG");
        ImageIcon[] flag = {USA, France, Ukraine, Romania, Spain};
        flags = new JList<>(flag);
        gbc.gridx = 2;
        panel.add(flags, gbc);
    }
    class PressButton implements ActionListener{
        JFrame newFrame;//Новий фрейм
        JPanel newPanel;//Нова панель для фрейму
        GridBagLayout newGBL;//Створюємо новий менеджер компановки
        GridBagConstraints newGBC;//Створюємо обмеження
        void creatFrame(){
            newFrame = new JFrame("Check");
            newFrame.setBounds(200,200,300,300); //Встановлюємо операцію при закритті вікна.
            newFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE); //Додаємо нову панель.
            newPanel = new JPanel();
            newFrame.add(newPanel); //Встановлюємо менеджер компановки.
            newGBL = new GridBagLayout();
            newGBC = new GridBagConstraints();
            newPanel.setLayout(newGBL);
        }
        @Override
        public void actionPerformed(ActionEvent e){
            //Запам’ятовуємо назву обраної країни.
            String chooseCountry = countries.getSelectedValue(); //Запам’ятовуємо обраний прапор.
            ImageIcon chooseFlag = flags.getSelectedValue(); //Створюємо новий фрейм.
            creatFrame(); //Створюємо лейбл, який виводитиме результат перевірки.
            JLabel label = new JLabel(); //Якщо прапор відповідає назві країни, то виводимо повідомлення «Correct!».
            if(check(chooseCountry, chooseFlag.getDescription())){
                label.setText("Correct!");
                label.setForeground(Color.GREEN);//Встановлюємо колір повідомлення зелений.
            }
// Якщо прапор не відповідає назві країни, то виводимо повідомлення «Wrong!».
            else {
                label.setText("Wrong!");
                label.setForeground(Color.RED); //Встановлюємо колір повідомлення червоний.
            }
            label.setFont(new Font("Verdana", Font.BOLD, 20));//Задаємо шрифт тексту.
            newPanel.add(label,newGBC);
            newFrame.setVisible(true);
        }

        boolean check(String country, String flag){
            switch (country){
                case "Ukraine":
                    if(flag.compareTo("Ukraine.JPG")==0) return true;
                    else return false;
                case "France":
                    if(flag.compareTo("France.JPG")==0) return true;
                    else return false;
                case "Romania":
                    if(flag.compareTo("Romania.JPG")==0) return true;
                    else return false;
                case "Spain":
                    if(flag.compareTo("Spain.JPG")==0) return true;
                    else return false;
                case "USA":
                    if(flag.compareTo("USA.JPG")==0) return true;
                    else return false;
//Якщо жодна країна не буде вибрана , то повертаємо значення false.
                default: return false;
            }
        }
    }
    Task1(){
        create();
    }
}