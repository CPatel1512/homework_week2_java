package variables;

public class JavaProgramme_4 {
    //Declare two instance and two static variables

    String name = "Chetan";
    int a = 40;
    static int b = 50;
    static String surname = "Patel";

    //Call both instance and static methods into the Main method and run the programme

    public static void main(String[] args) {
        JavaProgramme_4 p = new JavaProgramme_4();
        System.out.println();

        p.m4();
        m2();
    }

    //Declare one instance method

    public void m4() {

        // Call all four instance and static variables into both instance and static methods inside the print statement.

        JavaProgramme_4 j = new JavaProgramme_4();
        System.out.println(j.a);
        System.out.println(j.name);
        System.out.println(b);
        System.out.println(surname);
    }

    //Declare one static method

    public static void m2() {

        //Call all four instance and static variables into both instance and static methods inside the print statement.

        JavaProgramme_4 k = new JavaProgramme_4();
        System.out.println(k.a);
        System.out.println(k.name);
        System.out.println(b);
        System.out.println(surname);
    }
}
