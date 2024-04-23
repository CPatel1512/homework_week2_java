package variables;

public class JavaProgramme_2 {
    //Declare two static variables
    static int a = 100;
    static String name = "Chetan";
//Declare the Main method
    public static void main(String[] args) {
        System.out.println();
        //Call the static method into the Main method and Run the programme.
        m1();
    }

    //Declare one static method
    public static void m1() {
        //Call both static variables into the static method inside the print statement
        System.out.println(a);
        System.out.println(name);
    }
}


