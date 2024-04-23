package variables.calculator_program_5;


public class NoReturnWithParameters {
    //No return with parameters
    public static void addition(int a, int b) {
        int ans = a + b;
        System.out.println(ans);
    }

    public static void devision(int a, int b) {
        int ans = a / b;
        System.out.println(ans);
    }

    public static void substraction(int a, int b) {
        int ans = a - b;
        System.out.println(ans);
    }

    public static void multiplicatioin(int a, int b) {
        int ans = a * b;
        System.out.println(ans);
    }

    public void add2(int a, int b) {
        int ans = a + b;
        System.out.println(ans);
    }

    public void substract(int a, int b) {
        int ans = a - b;
        System.out.println(ans);
    }

    public void multiply(int a, int b) {
        int ans = a * b;
        System.out.println(ans);
    }

    public void devide(int a, int b) {
        int ans = a / b;
        System.out.println(ans);
    }
public static void printName(String name){
    System.out.println("Name is "+name);
}
    public static void main(String[] args) {
        addition(10,20);
        substraction(30,20);
        multiplicatioin( 30,30);
        devision(30,5);
        printName("Chetan");
        NoReturnWithParameters t = new NoReturnWithParameters();
        t.add2(10 , 20);
        t.substract(40,20);
        t.devide(100,20);
        t.multiply(10,20);

    }
}
