import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input the number:");
        int inputNum = scan.nextInt();
        int sum =0;
        for(int i = 1; i <= inputNum; i++) {
            sum += i;
        }
        System.out.println("The sum of 1 to " +inputNum+ " is " +sum);
        scan.close();
    }
}
