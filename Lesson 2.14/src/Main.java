public class Main {
    public static void main(String[] args) {
        /*
        for (int i = 1; i<=100; i++) {
            if (i==10){
                break;
            }
            System.out.println(i);
        }
         */


        /*
        for(int j=0; j<3; j++){
            System.out.print("Row "+j+":");
            for (int i = 1; i<=100; i++){
                if(i==10){
                    break;
                }
                System.out.print(i+" ");
            }
            System.out.println();
        }
        */


        /*
        first:
        {
            second:
            {
                third:
                {
                    System.out.println("???????? ????? break . ");
                    if(true) break second;
                    System.out.println("??? ????? ?? ???? ????????");
                }
                System.out.println("???? ????? ????? ?? ???? ????????");
            }
            System.out.println("??? ????? ???? ???????? ????? second");
        }
         */

        /*
         String[] words = {"Tom", "Sam", "Tim", "Harry", "Tibor"};
        int wordsCount = 0;
        for (int i = 0; i<words.length; i++) {
            if (!words[i].startsWith("T")){
                continue;
            }
            wordsCount++;
        }
        System.out.println("????????? ????, ?? ??????????? ? ?????? ? = " + wordsCount);
         */

        /*
                outer:
        for (int i=0; i<10; i++){
            for (int j=0; j<10; j++){
                if (j>1){
                    System.out.println();
                    continue outer;
                }
                System.out.print(" " + (i*j));
            }
            System.out.println();
        }
         */

    }
}