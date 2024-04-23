package variables.calculator_program_5;

public class NoReturnWithNoParameters {
    // No Return    with No no params
    public static void main(String[] args) {
        addition();
        substraction();
        multiply();
        devide();
        NoReturnWithNoParameters obj = new NoReturnWithNoParameters();
        obj.addition2();
        obj.substraction2();
        obj.multiply2();
        obj.devide2();
    }

    public static void addition() {
        int a = 10;
        int b = 20;
        int ans = a + b;
        System.out.println("addition of two numbers " + a + " and " + b + " is " + ans);
    }

    public static void substraction() {
        int a = 30;
        int b = 15;
        int ans = a - b;
        System.out.println("substraction of two numbers " + a + " and " + b + " is " + ans);

    }

    public static void multiply() {
        int a = 10;
        int b = 10;
        int ans = a * b;
        System.out.println("multiplication of two numbers " + a + " and " + b + " is " + ans);
    }

    public static void devide() {
        int a = 100;
        int b = 5;
        int ans = a / b;
        System.out.println("devision of two numbers " + a + " and " + b + " is " + ans);
    }


    public void addition2() {
        int a = 50;
        int b = 60;
        int ans = a + b;
        System.out.println("addition of two numbers " + a + " and " + b + " is " + ans);

    }

    public void substraction2() {
        int a = 70;
        int b = 50;
        int ans = a - b;
        System.out.println("substraction of two numbers " + a + " and " + b + " is " + ans);

    }
    public void multiply2() {
        int a = 70;
        int b = 50;
        int ans = a * b;
        System.out.println("multiplication of two numbers " + a + " and " + b + " is " + ans);
    }
        public void devide2() {
            int a = 70;
            int b = 2;
            int ans = a/b;
            System.out.println("devision of two numbers " + a + " and " + b + " is " + ans);}
}
