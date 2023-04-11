import java.util.Scanner;

public class AgeOfTheOldest {
    public  static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] arrayOfStrings = input.split(",");
            int current = Integer.valueOf(arrayOfStrings[1]);

            if (current > oldest) {
                oldest = current;
            }
        }
        System.out.println(oldest);
    }
}