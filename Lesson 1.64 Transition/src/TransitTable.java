import java.util.ArrayList;

public class TransitTable extends FSM {
    ArrayList<Transition> transitions;
    public TransitTable(String _word)
    {
        super(_word);
        transitions = new ArrayList<Transition>();
    }

    @Override


    public boolean scanner()
    {
        Event event;
        buildTransitionTable();
        int count = 0;
        do
        {
            if(count < text.length())
                event = recognizeEvent(text.charAt(count));
            else
                event = Event.EOS;
            handleEvent(event);
            count++;
        }
        while ((state != State.Success) && (state != State.Error));
        if(state == State.Success)
            return Boolean.TRUE;
        else
            return Boolean.FALSE;
    }
    @Override


    public Event recognizeEvent(char ch) {
        Event temp;
        switch (ch) {

            case '-':temp=Event.Minus; break;
            case '0':temp=Event.Zero; break;
            case '1': case'2':case '3': case'4':case '5': case'6':case '7': case'8': case '9': temp=Event.Digit1_9; break;
            case '.': temp=Event.Point;break;
            default:
                temp = Event.ANY;
        }
        return temp;
    }
    @Override
    public void handleEvent(Event event)
    {
        int length = transitions.size();
//Перебираємо всі записи в таблиці переходів, поки не знайдемо потрібну нам комбінацію.
        for(int i = 0; i < length; i++)
        {
            Transition transition = transitions.get(i);
            if((state == transition.startState) && (event == transition.trigger))
            {
//Якщо правильна комбінація знайдена, то переводимо скінченний автомат в кінцевий стан.
                state = transition.endState;
                return;
            }
        }
    }
    private void buildTransitionTable() {
        Transition transit = new Transition(State.Q0, State.Q1, Event.Minus);
        transitions.add(transit);
        transit = new Transition(State.Q0, State.Q2, Event.Zero);
        transitions.add(transit);
        transit = new Transition(State.Q0, State.Q3, Event.Digit1_9);
        transitions.add(transit);
        transit = new Transition(State.Q0, State.Error, Event.Point);
        transitions.add(transit);
        transit = new Transition(State.Q0, State.Error, Event.EOS);
        transitions.add(transit);
        transit = new Transition(State.Q0, State.Error, Event.ANY);
        transitions.add(transit);


        transit = new Transition(State.Q1, State.Error, Event.Minus);
        transitions.add(transit);
        transit = new Transition(State.Q1, State.Q2, Event.Zero);
        transitions.add(transit);
        transit = new Transition(State.Q1, State.Q3, Event.Digit1_9);
        transitions.add(transit);
        transit = new Transition(State.Q1, State.Error, Event.Point);
        transitions.add(transit);
        transit = new Transition(State.Q1, State.Error, Event.EOS);
        transitions.add(transit);
        transit = new Transition(State.Q1, State.Error, Event.ANY);
        transitions.add(transit);

        transit = new Transition(State.Q2, State.Error, Event.Minus);
        transitions.add(transit);
        transit = new Transition(State.Q2, State.Error, Event.Zero);
        transitions.add(transit);
        transit = new Transition(State.Q2, State.Error, Event.Digit1_9);
        transitions.add(transit);
        transit = new Transition(State.Q2, State.Q5, Event.Point);
        transitions.add(transit);
        transit = new Transition(State.Q2, State.Error, Event.EOS);
        transitions.add(transit);
        transit = new Transition(State.Q2, State.Error, Event.ANY);
        transitions.add(transit);

        transit = new Transition(State.Q3, State.Error, Event.Minus);
        transitions.add(transit);
        transit = new Transition(State.Q3, State.Q4, Event.Zero);
        transitions.add(transit);
        transit = new Transition(State.Q3, State.Q4, Event.Digit1_9);
        transitions.add(transit);
        transit = new Transition(State.Q3, State.Q5, Event.Point);
        transitions.add(transit);
        transit = new Transition(State.Q3, State.Error, Event.EOS);
        transitions.add(transit);
        transit = new Transition(State.Q3, State.Error, Event.ANY);
        transitions.add(transit);

        transit = new Transition(State.Q4, State.Error, Event.Minus);
        transitions.add(transit);
        transit = new Transition(State.Q4, State.Q4, Event.Zero);
        transitions.add(transit);
        transit = new Transition(State.Q4, State.Q4, Event.Digit1_9);
        transitions.add(transit);
        transit = new Transition(State.Q4, State.Q5, Event.Point);
        transitions.add(transit);
        transit = new Transition(State.Q4, State.Error, Event.EOS);
        transitions.add(transit);
        transit = new Transition(State.Q4, State.Error, Event.ANY);
        transitions.add(transit);

        transit = new Transition(State.Q5, State.Error, Event.Minus);
        transitions.add(transit);
        transit = new Transition(State.Q5, State.Q6, Event.Zero);
        transitions.add(transit);
        transit = new Transition(State.Q5, State.Q6, Event.Digit1_9);
        transitions.add(transit);
        transit = new Transition(State.Q5, State.Error, Event.Point);
        transitions.add(transit);
        transit = new Transition(State.Q5, State.Error, Event.EOS);
        transitions.add(transit);
        transit = new Transition(State.Q5, State.Error, Event.ANY);
        transitions.add(transit);

        transit = new Transition(State.Q6, State.Error, Event.Minus);
        transitions.add(transit);
        transit = new Transition(State.Q6, State.Q6, Event.Zero);
        transitions.add(transit);
        transit = new Transition(State.Q6, State.Q6, Event.Digit1_9);
        transitions.add(transit);
        transit = new Transition(State.Q6, State.Error, Event.Point);
        transitions.add(transit);
        transit = new Transition(State.Q6, State.Success, Event.EOS);
        transitions.add(transit);
        transit = new Transition(State.Q6, State.Error, Event.ANY);
        transitions.add(transit);
    }
}
