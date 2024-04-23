package variables;

public class JavaProgramme_3 {
   //Declare one instance and one static variable
    String name = "Chetan";
    static int number = 300;
    //Declare one instance method.
    //Declare the Main method.
    public static void main(String[] args) {
        System.out.println();
        m3();
        m2();
    }
    public static void m3(){
      //Call both instance and static variables into both instance and static methods inside the print statement
        JavaProgramme_3 t = new JavaProgramme_3();
        System.out.println(t.name);
        System.out.println(number);
//Declare one static method.
    }
    public static void m2(){
        //Call both instance and static variables into both instance and static methods inside the print statement
        JavaProgramme_3 obj = new JavaProgramme_3();
        System.out.println(number);
        System.out.println(obj.name);
    }
}
