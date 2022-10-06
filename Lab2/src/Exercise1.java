import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input the start:");
        int start = scan.nextInt();
        System.out.println("Input the end:");
        int end = scan.nextInt();

        while (start <= end) {
            System.out.println(start++);
        }
        scan.close();
    }
}
