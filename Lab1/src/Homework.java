import java.util.Scanner;

public class Homework {
    public static void main(String[] args) throws Exception {

        //==================================
        //1 — Find the Area of a Circle
        //==================================
        // Scanner scan = new Scanner(System.in);
        // int inputNum;
        
        // System.out.print("Enter a radius of a circle: ");
        // inputNum = scan.nextInt();
        // System.out.println("The radius is " +inputNum);
        // double answer = inputNum * inputNum * Math.PI;
        // System.out.println("The area of circle is " +answer);
        
        // scan.close();
        
        
        
        //==================================
        //2 — Convert Cents to Dollars
        //==================================
        // Scanner scan;
        // double inputNum;
        // scan = new Scanner(System.in);

        // System.out.println("Enter the number");

        // inputNum = scan.nextInt();
        // int dollors = (int) (inputNum / 100);
        // double cents = (inputNum / 100 - dollors) * 100;

    
        // System.out.printf("The value is %d and %.0f cents%n", dollors,cents);

        // scan.close();
        
        
        // Solution2
//        Scanner scan;
//        int inputNum;
//
//        scan = new Scanner(System.in);
//        System.out.println("Input numbers");
//        inputNum = scan.nextInt();
//        int dollers = inputNum / 100;
//        int cents = inputNum % 100;
//
//        System.out.println("The value is " +dollers +" and " +cents);
//        
//        scan.close();



        //==================================
        //3 - Multiplication Table
        //==================================
        Scanner scan;
        int inputNum;
        scan = new Scanner(System.in);
        
        System.out.println("Enter the number");
        
        inputNum = scan.nextInt();
        int answer;
        for(int i = 1; i <= 10; i++) {
            answer = inputNum * i;
            System.out.println(inputNum+ " x " +i+ " = " +answer);
        }
        
        scan.close();
        
        //==================================
        //4 - Print the Pattern
        //==================================
            System.out.printf("%n%4s%5s%4s%6s%3s%n","J","a","v","v","a");
            System.out.printf("%4s%4s%2s%4s%4s%3s%2s%n","J","a","a","v","v","a","a");
            System.out.printf("%1s%3s%7s%4s%2s%7s%n","J","J","aaaaa","v","v","aaaaa");
            System.out.printf("%3s%3s%6s%4s%3s%6s%n%n","JJ","a","a","v","a","a");

    }
}