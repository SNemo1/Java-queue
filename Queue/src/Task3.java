import java.util.Scanner;
import java.util.Deque;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;


public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        String input = scanner.nextLine();
        String[] parts = input.split("\\s+");

        for (String part : parts) {
                int num = Integer.parseInt(part);
                if (num <= 10 && num % 2 != 0) {
                    queue.add(num);
                }
        }

        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        System.out.println(queue);
    }
}
