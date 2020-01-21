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
        /*for ( int i=0; i<result.length; i++) {
        }*/
        System.out.println(result);

        char[] ch = new char[result.length()];

        for (int i = 0; i < result.length(); i++) {
            ch[i] = result.charAt(i);
        }

        for (char c : ch) {
            System.out.print(c);
        }
        System.out.println(ch.length);

        int summa = 0;

        for (int i = 0; i < ch.length; i++){
            summa += ch[i];
        }


        /*System.out.println();
        int size = result.length();
        int[] results = new int[size];
        for ( int x=0; x<size; x++) {
            results[x] = Integer.parseInt(result);
        }
        System.out.println(result.length());*/

        /*int intSum = sumOfAll(Integer.parseInt(result));
        System.out.println(intSum);*/

        /*long sum = sumOfAll(867767667);
        System.out.println(sum);
        System.out.println();*/


        /*long num = 380674739224;
        long sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println(sum);*/
    }

    /*static long sumDigits(long i) {
        for (long k = i; k > 10; k++ ) {

        }
        return i == 0 ? 0 : i % 10 + sumDigits(i / 10);
    }*/

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
