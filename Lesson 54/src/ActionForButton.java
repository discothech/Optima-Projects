import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Створюємо клас ActionForButton, який реалізує інтерфейс ActionListener

class ActionForButton implements ActionListener{
    private TextField textField;

    //Перевизначаємо метод actionPerformed, який задаватиме в текстовому полі значення «Hello!»
    @Override
    public void actionPerformed(ActionEvent e) {
        textField.setText("Hello!");
    }

}
