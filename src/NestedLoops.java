public class NestedLoops {
    public static void run(){
        //init var
        final int BOUNDS = 5;
        final String RESULT = "*****";
        String resultSubstring;

        //asterisks ascending
        for(int i = 0; i <BOUNDS; i++){
            resultSubstring = RESULT.substring((BOUNDS-i)-1);
            System.out.println(resultSubstring);
        }

        System.out.println(); //Buffer to space out new lines

        //asterisks descending
        for(int i = 0; i <BOUNDS; i++){
            resultSubstring = RESULT.substring(i);
            System.out.println(resultSubstring);
        }

        System.out.println(); //Buffer to space out new lines

        //box of asterisks
        for(int i = 0; i<BOUNDS; i++){
            System.out.println(RESULT);
        }
    }
}
