package Tasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int N = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number N: ");
        if (input.hasNextInt()){
            N = input.nextInt();
            System.out.println(triangle(N));
        }
        else {
            System.out.println("Enter only whole numbers");
        }
        input.close();
    }

    static int triangle(int N) {
        int sum = 0;
        while (N>0) {
            sum+=N;
            N--;
        }
        return sum;
    }
}