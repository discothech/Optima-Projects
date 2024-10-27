public abstract class FSM { //Слово, яке буде перевірятися скінченним автоматом.
    protected String text; //Поточний стан скінченного автомата.
    protected State state; //Конструктор, який приймає на вхід слово для аналізу та задає початковий стан скінченного автомата State.Initial
    public FSM(String text) {
        this.text = text;
        state = State.Q0;
    }
//Опис трьох абстрактних методів, які будуть реалізовані в автоматі.
    public abstract boolean scanner();
    public abstract Event recognizeEvent(char ev);
    public abstract void handleEvent(Event ev);
}