package epam.com.HW3;
import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of picture -> ");
        int number = sc.nextInt();
        switch (number) {

            case 1:
                System.out.println("*");
                System.out.println("**");
                System.out.println("* *");
                System.out.println("*  *");
                System.out.println("*****");
                System.out.println("*  *");
                System.out.println("* *");
                System.out.println("**");
                System.out.println("*");
                break;
            case 2:
                System.out.println("*****");
                System.out.println(" *  *");
                System.out.println("  * *");
                System.out.println("   **");
                System.out.println("    *");
                break;
            case 3:
                System.out.println("    *");
                System.out.println("   **");
                System.out.println("  * *");
                System.out.println(" *  *");
                System.out.println("*****");
                break;
            case 4:
                System.out.println("    *");
                System.out.println("   **");
                System.out.println("  * *");
                System.out.println(" *  *");
                System.out.println("*****");
                System.out.println(" *  *");
                System.out.println("  * *");
                System.out.println("   **");
                System.out.println("    *");
                break;
            case 5:
                System.out.println("    *    ");
                System.out.println("   ***   ");
                System.out.println("  * * *  ");
                System.out.println(" *  *  *");
                System.out.println("*********");
                System.out.println("    *    ");
                System.out.println("   ***   ");
                System.out.println("  * * *  ");
                System.out.println(" *  *  *");
                System.out.println("*********");
                break;

            default:
                System.out.println("Invalid number!");
                break;
        }
    }
}
