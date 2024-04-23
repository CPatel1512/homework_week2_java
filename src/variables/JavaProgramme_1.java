package variables;

//Declare two instance variables
public class JavaProgramme_1 {
    String name = "Chetan";
    int a = 20;

    // declare the main method
    public static void main(String[] args) {
        JavaProgramme_1 t = new JavaProgramme_1();
        System.out.println();
        t.m1();

    }

    //Declare one instance method
    public void m1()
    {
        //Call both instance variables into the instance method inside the print statement
        JavaProgramme_1 obj = new JavaProgramme_1();
        System.out.println(obj.name);
        System.out.println(obj.a);


    }

}
