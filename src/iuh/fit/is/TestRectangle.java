package iuh.fit.is;

import java.util.Scanner;
/**
 * TestRectangle class is used to demonstrate the usage of the Rectangle class.
 * It creates Rectangle objects, allows input, and prints perimeter, area,
 * and string representation.
 * 
 * @author  Nguyen Thi Hong Hanh
 * @version 1.0
 * @since 27-Aug-2025 09:10:00 PM
 */
public class TestRectangle {
	/**
     * Default constructor for TestRectangle.
     * Initializes the test class without parameters.
     */
	 public TestRectangle() {
	        // no initialization required
	    }

	/**
     * The main method is the entry point of the program.
     * It allows the user to input rectangle dimensions
     * and prints the results.
     *
     * @param args command-line arguments (not used)
     */
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Nhập dữ liệu
            System.out.print("Enter length: ");
            double length = sc.nextDouble();

            System.out.print("Enter width: ");
            double width = sc.nextDouble();

            // Tạo đối tượng Rectangle
            Rectangle rect = new Rectangle(length, width);

            // Xuất kết quả
            System.out.println("Perimeter: " + rect.getPerimeter());
            System.out.println("Area: " + rect.getArea());
            System.out.println("Rectangle info: " + rect.toString());

        } catch (IllegalArgumentException e) {
        	System.out.println("Error: " + e.getMessage());
        }

        sc.close();
 }
}
