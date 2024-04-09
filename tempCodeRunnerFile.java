import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the character for the triangle
        System.out.println("Enter a character:");
        String triangleChar = scanner.nextLine();

        // Get the height of the triangle
        System.out.println("Enter triangle height:");
        int triangleHeight = scanner.nextInt();

        // Draw the triangle
        for (int i = 1; i <= triangleHeight; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(triangleChar + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
