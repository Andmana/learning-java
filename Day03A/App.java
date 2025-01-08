package Day03A;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("1. Square \n2. Circle \n3. Triangle \n4. Rectangle \n5. Rhombus");

        int choiceShape;
        String choiceAction;
        boolean isCalculate = true;
        
        while (isCalculate) {
            System.out.print("Choose Shape = ");
            choiceShape = scan.nextInt();
            scan.nextLine();

            if (choiceShape == 1){
                System.out.print("Input Square's line = ");
                Square square = new Square(scan.nextInt());
                scan.nextLine();
                square.printCalculation();
            }

            System.out.print("Still Want to calculate? (y/n) ");
            choiceAction = scan.nextLine();
            isCalculate = choiceAction.toLowerCase().equals( "y") ? true : false;
        }
        
    }
}
