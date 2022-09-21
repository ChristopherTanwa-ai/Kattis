import java.util.Scanner;

public class takeTwoStones {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lastStone = input.nextInt();

        if(lastStone%2 == 0){
            System.out.println("Bob");
        } else {
            System.out.println("Alice");
        }
    }

}
