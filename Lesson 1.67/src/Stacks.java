import java.util.ArrayList;

public class Stacks {
    private int maxHeight;
    private int index;
    private int stackIndex;
    public Stacks(int maxHeight){
        this.maxHeight=maxHeight;
        index=0;
        stackIndex = 0;
    }
    private ArrayList<Stack> stacks = new ArrayList<>();
    public void push(int value){
        if(index==0){
            Stack stack = new Stack();
            stack.push(value);
            index++;
            stacks.add(stack);
        }
        else if(index>0 && index<maxHeight){
            stacks.get(stackIndex).push(value);
            index++;
        } else if (index==maxHeight) {
            index = 0;
            stackIndex++;
            push(value);
        }
    }
    public Integer pop(){
        if (stacks==null) return null;
        if (index==0) {
            stackIndex--;
            index=maxHeight;
        }
        index--;
        return stacks.get(stackIndex).pop();
    }
}
