public abstract class FSM {
    protected String text; //Слово, яке буде перевірятися скінченним автоматом.
    protected State state; //Поточний стан скінченного автомата.
    public FSM(String text) { //Конструктор, який приймає на вхід слово для аналізу та задає початковий стан скінченного автомата State.Initial
        this.text = text;
        state = State.Q0;
    }
    //Опис трьох абстрактних методів, які будуть реалізовані в автоматі.
    public abstract boolean scanner();
    public abstract Event recognizeEvent(char ev);
    public abstract void handleEvent(Event ev);
}
