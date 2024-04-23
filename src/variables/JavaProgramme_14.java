package variables;

public class JavaProgramme_14 {
    public  static void main(String[] args) {
        // Given data
        double width = 5.6;
        double height = 8.5;

        // Calculate area and perimeter
        double area = width * height;
        double perimeter = 2 * (width + height);

        // Print the results
        System.out.printf("Area is %.1f * %.1f = %.2f%n", width, height, area);
        System.out.printf("Perimeter is 2 * (%.1f + %.1f) = %.2f%n", width, height, perimeter);
    }
}
