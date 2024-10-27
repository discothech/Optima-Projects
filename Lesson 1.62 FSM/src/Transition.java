public class Transition {
    State startState;
    State endState;
    Event trigger;
    public Transition(State start, State end, Event trig)
    {
        startState=start;
        endState=end;
        trigger=trig;
    }
}
