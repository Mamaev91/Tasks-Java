/*+На вход некоторому исполнителю подаётся два числа (a, b). У исполнителя есть две команды
- команда 1 (к1): увеличить в с раза, а умножается на c
- команда 2 (к2): увеличить на d ( +2 ), к a прибавляется d
написать программу, которая выдаёт набор команд, позволяющий число a превратить в число b или сообщить, что это невозможно
Пример 1: а = 1, b = 7, c = 2, d = 1
ответ: к1, к1, к1, к1, к1, к1 или к1, к2, к1, к1, к1 или к1, к1, к2, к1. 
Пример 2: а = 11, b = 7, c = 2, d = 1
ответ: нет решения. 
*Подумать над тем, как сделать минимальное количество команд */
import java.util.Scanner;

public class Task3 {
    
    static int getScannerNumber() {

        Scanner in = new Scanner(System.in);
        System.out.print("Input int number : ");
        int num = in.nextInt();

        return num;
    }
    public static void main(String[] args){
        int a = getScannerNumber();
        int b = getScannerNumber();
        int c = 2;
        int d = 1;
        String answer = "Commands: ";
        if (a > b) {
            System.out.println("No solution");
        }
        while (a < b) {
            a = a * c;
            if (a <= b) {
                System.out.println(a);
                answer += "k1 ,";
            }
            if (a > b) {
                a = a / c;
                a = a + d;
                System.out.println(a);
                answer += "k2 ,";
            }
        }
        System.out.println(answer);
    }
}