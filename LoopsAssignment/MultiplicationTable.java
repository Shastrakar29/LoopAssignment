package LoopsAssignment;
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :- ");
        int x = sc.nextInt();
        for (int i = x; i <= 10 * x; i += x) {
            System.out.println(i);

        }
    }
}
