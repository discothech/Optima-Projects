import java.util.ArrayList;

public class TransitTable extends FSM {
    ArrayList<Transition>transitions;
    public TransitTable(String _word)
    {
        super(_word);
        transitions=new ArrayList<Transition>();
    }
    public boolean scanner() {
        Event event;
        buildTransitionTable();
        int count = 0;
        do {
//Розпізнаємо подію.
            if (count < text.length())
                event = recognizeEvent(text.charAt(count));
            else
                return true;
            handleEvent(event);
            if (state==null) return false;
            count++;
        }
        while (state!=State.Success || state!=State.Error);
        if (state==State.Success) return true;
        else return false;
    }
    public Event recognizeEvent(char ch) {
        Event temp;
        switch (ch) {
            case '0':
                temp=Event.Zero;
                break;
            case '1':
                temp=Event.One;
                break;
            case '.':
                temp=Event.Dot;
                break;
            default:
                temp=Event.ANY;
        }
        return temp;
    }
    @Override
    public void handleEvent(Event event)
    {
        int length = transitions.size();
        for (int i=0; i<length; i++)
        {
            Transition transition = transitions.get(i);
            if((state==transition.startState)&&(event==transition.trigger))
            {
                state=transition.endState;
                return;
            }
        }
        state=null;
    }
    private void buildTransitionTable()
    {
        Transition transit = new Transition(State.Q0, State.Q1, Event.Zero);
        transitions.add(transit);
        transit = new Transition(State.Q0, State.Q2, Event.One);
        transitions.add(transit);
        transit = new Transition(State.Q0, State.Q3, Event.Dot);
        transitions.add(transit);
        transit = new Transition(State.Q1, State.Q3, Event.Dot);
        transitions.add(transit);
        transit = new Transition(State.Q2, State.Q2, Event.Zero);
        transitions.add(transit);
        transit = new Transition(State.Q2, State.Q2, Event.One);
        transitions.add(transit);
        transit = new Transition(State.Q2, State.Q3, Event.Dot);
        transitions.add(transit);
        transit = new Transition(State.Q3, State.Q4, Event.Zero);
        transitions.add(transit);
        transit = new Transition(State.Q3,State.Q4,Event.One);
        transitions.add(transit);
        transit = new Transition(State.Q4,State.Q4,Event.Zero);
        transitions.add(transit);
        transit = new Transition(State.Q4,State.Q4,Event.One);
        transitions.add(transit);
    }

}
