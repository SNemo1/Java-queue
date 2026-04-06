import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;

public class Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter u number");
        int number = sc.nextInt();

        int[] arr = new int[number];

        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 || ((i == 0 || arr[i] != arr[i - 1]) && (i == arr.length - 1 || arr[i] != arr[i + 1]))) {
                list.add(arr[i]);
            }
        }

        System.out.println(list);

    }
}

