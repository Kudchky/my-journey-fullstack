package exercises.week02;

import java.util.Scanner;

public class MultiplicationTable {
    void main() {
        Scanner sc = new Scanner(System.in);

        IO.println("Enter a number for generate multiplication table: ");
        int num = sc.nextInt();
        sc.close();

        IO.println("Tabla Multiplicar de " + num);
        IO.println("*----------------------*");
        for (int i = 1; i <= 10 ; i++) {
            System.out.printf("| %d x %d = %d |\n", i, num, i * num);
        }
    }
}
