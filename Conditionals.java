import java.util.Scanner;
public class Conditionals {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
       
        System.out.print("Number: ");
        int num1 = scnr.nextInt();
        
        System.out.print("Number: ");
        int num2 = scnr.nextInt();
       
        if (num1 > num2) {
            System.out.println(num2 + ", " + num1);
        } else if (num2 > num1) {
            System.out.println(num1 + ", " + num2);
        } else {
            System.out.println("They are the same number : " + num1 + ", " + num2);
        }

    }
}
