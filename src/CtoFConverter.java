import java.util.Scanner;

public class CtoFConverter {
    public static void run(){
        //init var
        Scanner scan = new Scanner(System.in);
        boolean valid = false;
        double celsius = 0;

        System.out.println("Input a number to convert to celsius. Input N to stop.");
        do{
            //find int
            if(scan.hasNextInt()){
                celsius = scan.nextInt();
                //conversion
                double fahrenheit = (celsius*1.8)+32;
                System.out.printf("Degrees F: %.2f\n"+"Degrees C: %.2f", fahrenheit, celsius);
                System.out.println(); //buffer
            }else{
                String input = scan.nextLine();
                if(input.equalsIgnoreCase("N")){
                    valid = true;
                }else{
                    System.out.println("Invalid input. Try again.");
                }
            }
        }while(!valid);
    }
}
