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
        dividing(10,0);
        System.out.println();
        divByModule(10,0);

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
}
