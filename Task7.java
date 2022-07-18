package Tasks;
import java.io.BufferedReader;
import java.io.FileReader;

// *+Задано уравнение вида q + w = e, q, w, e >= 0. 
// Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
// Требуется восстановить выражение до верного равенства. 
// Предложить хотя бы одно решение или сообщить, что его нет.
public class Task7 {
    public static void main(String[] args) throws Exception {
        String str = loadData("input7.txt");
        System.out.println(str);
        int first = findFirstIndex(str);
        int last = findLastIndex(str);
        printResult(first, last, str);

    }

    static String loadData(String path) throws Exception {
        BufferedReader read = new BufferedReader(new FileReader(path));
        String str = read.readLine();
        String result = str.replaceAll(" ", "");
        read.close();

        return result;
    }

    static int findFirstIndex(String str) {
        int first = str.indexOf("?");
        return first;
    }

    static int findLastIndex(String str) {
        int last = str.lastIndexOf("?");
        return last;
    }

    static void printResult(int first, int last, String str) {
        if (first == 1 && last == 4) {
            System.out.println("Нет решения!");
        } else if (first == 0 && last == 3) {
            System.out.println("Нет решения!");
        } else if (first == 1 && last == 3) {
            String chA = str.substring(0, 1);
            String chB = str.substring(4, 5);
            String chC = str.substring(6);
            int a = (Integer.parseInt(chA)) * 10;
            int b = Integer.parseInt(chB);
            int c = Integer.parseInt(chC);
            int result = c - (a + b);
            System.out.println(result);
            System.out.printf("%s%d + %d%s = %s", chA, result % 10, result / 10, chB, chC);
        } else if (first == 0 && last == 4) {
            String chA = str.substring(3, 4);
            String chB = str.substring(1, 2);
            String chC = str.substring(6);
            int a = (Integer.parseInt(chA)) * 10;
            int b = Integer.parseInt(chB);
            int c = Integer.parseInt(chC);
            int result = c - (a + b);
            System.out.println(result);
            System.out.printf("%d%s + %s%d = %s", result / 10, chB, chA, result % 10, chC);
        }
    }

}
