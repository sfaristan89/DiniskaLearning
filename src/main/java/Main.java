import java.util.Scanner;


public class Main {

    public static void main(String[] args) {


        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter phone number");
        String inputPhoneNumber = reader.nextLine();

        while (!inputPhoneNumber.matches("^(?:(?:\\+|0{0,2})((38)|8?))(0(39|50|6[3678]|73|9[1-9])\\d{7})$")) {
            System.out.println("Phone number is incorrect.\nPlease enter the phone number:");
            inputPhoneNumber = reader.nextLine();
        }

        System.out.println("Phone number is correct");
        long phoneNumber = Long.parseLong(inputPhoneNumber);
        long sum = getDigitsSum(phoneNumber);
        System.out.println("1 round of calculation...\nSum is: " + sum);

        int timesCalculation = 1;
        while (sum >= 10) {
            timesCalculation++;
            sum = getDigitsSum(sum);
            System.out.println(timesCalculation + " round of calculation...\nSum is: " + sum);
        }

        switch((int) sum) {
            case 0:
                System.out.println("Final result is: Zero");
                break;
            case 1:
                System.out.println("Final result is: One");
                break;
            case 2:
                System.out.println("Final result is: Two");
                break;
            case 3:
                System.out.println("Final result is: Three");
                break;
            case 4:
                System.out.println("Final result is: Four");
                break;
            case 5:
                System.out.println("Final result is: Five");
                break;
            case 6:
                System.out.println("Final result is: Six");
                break;
            case 7:
                System.out.println("Final result is: Seven");
                break;
            case 8:
                System.out.println("Final result is: Eight");
                break;
            case 9:
                System.out.println("Final result is: Nine");
                break;

            default:
                System.out.println("Invalid number");
        }

    }

    private static long getDigitsSum(long number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

}
