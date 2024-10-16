public class LoopsAsCounters {
    public static void run(){
        StringBuilder result = new StringBuilder();
        //count to 30
        for(int i = 0; i<=30; i++){
            result.append(i).append(" "); //appends current num and a space to the result
        }
        System.out.println(result);

        result = new StringBuilder(); //clears stringbuilder

        //count down from 30
        for(int i = 30; i>=0; i--){
            result.append(i).append(" "); //appends current num and a space to the result
        }
        System.out.println(result);
        result = new StringBuilder(); //clears stringbuilder


        //count to 18 by 3
        for(int i = 0; i<=18; i+=3){
            result.append(i).append(" "); //appends current num and a space to the result
        }
        System.out.println(result);
        result = new StringBuilder(); //clears stringbuilder

        //count down from 10
        for(int i = 10; i>=0; i-=2){
            result.append(i).append(" "); //appends current num and a space to the result
        }
        System.out.println(result);

    }
}
