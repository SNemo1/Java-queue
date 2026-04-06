import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;

class  Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Your n");
        int n =  sc.nextInt();
        sc.nextLine();

        System.out.println("Your n");
        String text =  sc.nextLine();

        char[] lattars = text.toCharArray();


        String vowelsArray = "aeiouAEIOU";


        Deque<String> queue = new LinkedList<>();
        for( int i = 0; i < lattars.length; i++){
            if(Character.isLetter(lattars[i]) && vowelsArray.indexOf(lattars[i]) == -1){
                queue.add((n+2) +"");
            }else{
                queue.add(lattars[i] + "");
            }
            while (!queue.isEmpty()){
                System.out.print(queue.pollLast());
            }
        }
    }
}

