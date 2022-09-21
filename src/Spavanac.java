import java.util.Scanner;
public class Spavanac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int H = input.nextInt();
        int M = input.nextInt();

        M -=45;
        if (M<0)
            {
            M +=60;
            H--;
            }
        if (H<0)
            {
            H = 23;
            }

        System.out.println(H + " " + M);
        input.close();
    }

}

