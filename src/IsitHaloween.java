import java.util.Scanner;
public class IsitHaloween {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");
        String day = arr[0];
        String month = arr[1];


        if (day.equals("OCT")  && month.equals("31") ||day.equals("DEC") && month.equals("25"))
        {
            System.out.println("yup");

        } else
        {
            System.out.println("nope");
        }
}}
