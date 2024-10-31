import java.util.Arrays;
import java.util.Scanner;

public class Root {
    public static void main(String[] args) {
        final String[] TASK_NAMES = new String[]{"Part 1: Loops as Counters", "Part 2: Nested Loops", "Part 3: Celsius to Fahrenheit Converter"};
        final int MIN_BOUND = 1;
        final int MAX_BOUND = Arrays.asList(TASK_NAMES).size();
        final String MESSAGE = "Select a task. [Enter an int from " + MIN_BOUND + "-" + MAX_BOUND + "]";

        //input/output selection
        for (String i : TASK_NAMES) {
            System.out.println(i);
        }
        int selection = validityCheck(MIN_BOUND,MAX_BOUND,MESSAGE);

        switch (selection) {
            case 1:
                LoopsAsCounters.run();
                break;
            case 2:
                NestedLoops.run();
                break;
            case 3:
                CtoFConverter.run();
                break;
        }
    }
    public static int validityCheck(int minBound, int maxBound, String message){
        Scanner scan = new Scanner(System.in);
        boolean check = false;
        int input = 0;

        do{
            System.out.println(message);
            if(scan.hasNextInt()){input = scan.nextInt();

                if(input>=minBound&&input<=maxBound){check = true;}
            }
        }while(!check);
        return input;
    }
}
