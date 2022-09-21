import java.util.Scanner;

public class ahhh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String John = input.nextLine();
        String Doc = input.nextLine();

        int johnahh = John.length();
        int docahhh = Doc.length();

        if (johnahh>docahhh || johnahh==docahhh)
        {
            System.out.println("go");
        }
        else
        {
            System.out.println("no");
        }

    }

}
