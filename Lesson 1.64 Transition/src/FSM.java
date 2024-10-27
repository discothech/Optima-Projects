public abstract class FSM {
    protected String text;
    protected State state;
    public FSM(String text) {
        this.text = text;
        state = State.Q0;
    }
    public abstract boolean scanner();
    public abstract Event recognizeEvent(char ev);
    public abstract void handleEvent(Event ev);
}