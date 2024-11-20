import java.util.Scanner;

public class IT24104092Lab5Q2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of new members introduced: ");
        int numMembers = scanner.nextInt();

        if (numMembers >= 0) {
            switch (numMembers) {
                case 0:
                    System.out.println("No Prize");
                    break;
                case 1:
                    System.out.println("Pen");
                    break;
                case 2:
                    System.out.println("Umbrella");
                    break;
                case 3:
                    System.out.println("Bag");
                    break;
                case 4:
                    System.out.println("Travelling Chair");
                    break;
                default:
                    System.out.println("Headphone");
            }
        } else {
            System.out.println("Input must be a number 0 or greater");
        }
    }
}
