import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputStr;

        System.out.println("Enter a word");
        inputStr = scan.nextLine();

        System.out.println("-----------------------");
        for(int i = 1; i <= inputStr.length(); i++) {
            System.out.println(inputStr);
        }

        scan.close();
    }
}
