import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Integer> arr = new ArrayList<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int count = in.nextInt();

        int k = count % 2 == 0 ? 2 : 3;
        for (int i = 0; i < count / 2; i++) {
            if (count % (i + 1) == 0) {
                arr.add(i + 1);
            }
        }

        for (int elem : arr) {
            System.out.print(elem + " ");
        }
        System.out.print(count);
    }
}
