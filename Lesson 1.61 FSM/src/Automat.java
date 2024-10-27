public class Automat extends FSM{
    private Event event; //Визначає поточну подію.
//Конструктор, який отримує на вході слово та передає його в батьківський клас.
    public Automat(String text) {
        super(text);
    }
    @Override
    public boolean scanner(){
        int count = 0;
        do {
            if (count < this.text.length())
                event = recognizeEvent(text.charAt(count));
            else
                event = Event.EOS;
            handleEvent(event);
            count++;
        }
        while (state != State.Success && state != State.Error);
        if (state == State.Success)
        {
            return true;
        }
        else
            return false;
    }
    @Override
    public Event recognizeEvent(char ch) {
        /*
        Event temp;
        switch (ch) {
//Розпізнаємо подію «велика літера».
            case'A':
            case'B':
            case'C':
            case'D':
            case'E':
            case'F':
            case'G':
            case'H':
            case'I':
            case'J':
            case'K':
            case'L':
            case'M':
            case'N':
            case'O':
            case'P':
            case'Q':
            case'R':
            case'S':
            case'T':
            case'U':
            case'V':
            case'W':
            case'X':
            case'Y':
            case'Z':
                temp = Event.UpperLetter;
                break;
//Розпізнаємо подію «цифра».
            case '0': case '1': case'2': case'3': case'4': case'5': case'6': case'7': case'8': case'9':
                temp = Event.Digit;
                break;
//Розпізнаємо подію «решітка».
            case '#':
                temp = Event.Sharp;
                break;
//Розпізнаємо подію «відсоток».
            case '%':
                temp = Event.Percent;
                break;
//Розпізнаємо подію «амперсанд».
            case '&':
                temp = Event.Ampersent;
                break;
//Розпізнаємо подію «нижнє підкреслення».
            case '_':
                temp = Event.Dash;
                break;
//Розпізнаємо подію «сторонній символ».
            default:
                temp = Event.ANY;
        }
                 */
        Event temp;
        switch(ch){
            case '-':
                temp=Event.Minus;
                break;
            case '0':
                temp=Event.Zero;
                break;
            case '1': case'2': case '3': case '4' : case '5' : case '6' : case '7':
                    case '8' : case '9' :
                        temp = Event.Digit1_9;
                        break;
            case '.':
                temp=Event.Point;
                break;
            default:
                temp=Event.ANY;
                break;
        }
        return temp;
    }
    @Override
    public void handleEvent(Event event) {
        switch (state)
        {//Розглядаємо початковий стан скінченного автомату.
            case Q0: {//В даному стані очікується лише подія «нижнє підкреслення». Решта подій будуть розпізнавати слово як неправильне.
                switch (event) {
                    case Minus: //При нижньому підкресленні ми перейдемо в стан Q1.
                        state = State.Q1;
                        break;
                    case Zero:
                        state = State.Q2;
                        break;
                    case Digit1_9:
                        state=State.Q3;
                        break;
                    case EOS:
                        state = State.Error;
                        break;
                    default:
                        state = State.Error;
                        break;
                }
                break;
            }
            case Q1:  //В стані Q1 ми очікуємо отримати на вхід цифру. В інших випадках буде повертатись значення false.
            {
                switch (event) { //Цифра переводить скінченний автомат в стан Q2.
                    case Zero:
                        state=State.Q2;
                        break;
                    case Digit1_9:
                        state = State.Q3;
                        break;
                    case EOS:
                        state = State.Error;
                        break;
                    default:
                        state = State.Error;
                        break;
                }
                break;
            }
            case Q2: {//В стані Q2 ми очікуємо отримати на вхід цифру або решітку.
                switch (event) { //Якщо ми зустрічаємо цифру, то скінченний автомат переходить в стан Q2.
                    case Point:
                        state = State.Q5;
                        break; // Якщо ми зустрічаємо решітку, то скінченний автомат переходить в стан Q3.
                    case EOS:
                        state = State.Error;
                        break;
                    default:
                        state = State.Error;
                        break;
                }
                break;
            }
            case Q3: //В стані Q3 ми очікуємо отримати на вхід решітку або амперсанд.
            {
                switch (event)
                { // Якщо ми зустрічаємо решітку або амперсанд, то скінченний автомат переходить в стан Q4.
                    case Point:
                        state = State.Q5;
                        break;
                    case Zero:
                        state = State.Q4;
                        break;
                    case Digit1_9:
                        state = State.Q4;
                        break;
                    case EOS:
                        state = State.Error;
                        break;
                    default:
                        state = State.Error;
                        break;
                }
                break;
            }
            case Q4: //В стані Q4 ми очікуємо отримати на вхід велику літеру, або одразу символ відсотка.
            { // Якщо ми зустрічаємо велику літеру, то скінченний автомат переходить в стан Q5.
                switch (event)
                { // Якщо ми зустрічаємо велику літеру, то скінченний автомат переходить в стан Q5.
                    case Point:
                        state = State.Q5;
                        break;  // Якщо ми зустрічаємо відсоток, то скінченний автомат переходить в стан Q6.
                    case Zero:
                        state = State.Q4;
                        break;
                    case Digit1_9:
                        state = State.Q4;
                        break;
                    case EOS:
                        state = State.Error;
                        break;
                    default:
                        state = State.Error;
                        break;
                }
                break;
            }

            case Q5: //В стані Q5 ми маємо послідовність великих літер, поки не отримаємо символ відсотка.
            {
                switch (event)
                {// Якщо ми зустрічаємо велику літеру, то скінченний автомат залишається в стані Q5.
                    case Digit1_9:
                        state = State.Q6;
                        break; //Якщо ми зустрічаємо відсоток, то скінченний автомат переходить в стан Q6.
                    case Zero:
                        state = State.Q6;
                        break;
                    case EOS:
                        state = State.Error;
                        break;
                    default:
                        state = State.Error;
                        break;
                }
                break;
            }
            case Q6: //Стан Q6 є заключним і очікує лише завершення рядка.
            {
                switch (event) {
                    case Digit1_9:
                        state = State.Q6;
                        break;
                    case Zero:
                        state = State.Q6;
                        break;
                    case EOS:
                        state = State.Success;
                        break;
                    default:
                        state = State.Error;
                        break;
                }
                break;
            }
        }
    }
}