import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {


        loop();
        System.out.println();
        System.out.println(adding(2,3));
        System.out.println();
        System.out.println(subtracting(5,3));
        System.out.println();
        System.out.println(multiplying(2,3));
        System.out.println();
        dividing(19,2);
        System.out.println();
        divByModule(867767661,10);
        System.out.println();

        String phone1 = "3454543";
        String phone2 = "mama mia";
        String phone3 = "+380671234567";
        String[] phoneNumbers= {phone1,phone2,phone3};

        for (int i = 0; i < phoneNumbers.length; i++) {
            String phoneNumber = phoneNumbers[i];
            System.out.println("Please enter Phone number:");
            if (isValidE123(phoneNumber)) {
                System.out.println(phoneNumber);
                System.out.println("This is valid Phone number");
            } else {
                System.out.println(phoneNumber);
                System.out.println("This is invalid Phone number");
            }
            System.out.println();
        }

        String result = phone3.replaceAll("\\+","");

        /*char[] ch1 = new char[result.length()];

        for (int i = 0; i < result.length(); i++) {
            ch1[i] = result.charAt(i);
        }*/

        char[] ch1 = result.toCharArray();
        int summa1 = 0;
        for (int i = 0; i < ch1.length; i++){
            summa1 += Character.getNumericValue(ch1[i]);
        }
        System.out.println("1st round of calculation: " + summa1);

        /*int summa1 = 0;
        for (int i = 0; i < ch1.length; i++){
            summa1 += Character.getNumericValue(ch1[i]);
        }
        System.out.println(summa1);*/

        char[] ch2 = String.valueOf(summa1).toCharArray();

        int summa2 = 0;
        for (int i = 0; i < ch2.length; i++){
            summa2 += Character.getNumericValue(ch2[i]);
        }
        System.out.println("2nd round of calculation: " + summa2);

        char[] ch3 = String.valueOf(summa2).toCharArray();

        int summa3 = 0;
        for (int i = 0; i < ch3.length; i++){
            summa3 += Character.getNumericValue(ch3[i]);
        }
        System.out.println("3rd round of calculation: " + summa3);

        switch(summa3) {
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

    private static int sumOfAll(int num) {
        int sum = 0;
        if(num > 10) {
            sum += num % 10;
            while((num = num / 10) >= 1) {
                sum += (num > 10) ? num % 10 : num;
            }
        }
        return sum;
    }

    static void loop() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }

    static int adding(int a, int b){
        int c = a + b;
        return c;
    }

    static int multiplying(int a, int b){
        int c = a * b;
        return c;
    }

    static int subtracting(int a, int b){
        int c = a - b;
        return c;
    }

    /*static int dividing(int a, int b){
        if (b == 0){
            throw new ArithmeticException("Division by zero");
        } else {
            int c = a / b;
            return c;
        }

    }*/

    static void divByModule(int a, int b){
        try {
            int c = a % b;
            System.out.println(c);
        } catch (ArithmeticException e){
            System.out.println("Division by zero");
        }
    }

    static void dividing(int a, int b){
        try {
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e){
            System.out.println("Division by zero");
        }
    }

    public static boolean isValidE123(String s)
    {
        Pattern p = Pattern.compile("^(?:(?:\\+|0{0,2})((38)|8?))(0(39|50|6[3678]|73|9[1-9])\\d{7})$");

        Matcher m = p.matcher(s);
        return (m.find() && m.group().equals(s));
    }
}
