public class List {
    int arr[];
    int last = -1;
    private int MAX_SIZE = 30;
    List (int size){
        try {
            if(size>MAX_SIZE){
                throw new Exception("List size can not be more than 30");
            }
            arr = new int[size];
            last = -1;
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public void add(int index, int value){
        try{
            if (index<0 || index>last+1 || index> arr.length) throw new Exception("You chose void index!");
            for (int i = last; i>index; i++){
                arr[i+1]=arr[i];
            }
            arr[index]=value;
            last++;
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }


    private void delete(int index){
        try{
            if (index<0 || index>last) throw new Exception("You put void index!");
            for (int i = index; i<=last; i++){
                arr[i]=arr[i+1];
            }
            last--;
        }
        catch (Exception ex){
            ex.getMessage();
        }
    }

    public Integer search(int index){
        try {
            if(index<0 || index>last) throw new Exception("You put void index!");
            return arr[index];
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
}
