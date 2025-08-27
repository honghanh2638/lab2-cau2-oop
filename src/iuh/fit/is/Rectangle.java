/**
 * @description:  This class represents a rectangle with width and height,
 *                and provides methods to calculate area and perimeter.
 * @author:       Nguyen Van A
 * @version:      1.0
 * @created:      27-Aug-2025 8:42:00 PM
 */
package iuh.fit.is;
 
public class Rectangle {
	
	    private double length;
	    private double width;

	    // Constructor
	    public Rectangle(double length, double width) {
	        if (length < 0 || width < 0) {
	            throw new IllegalArgumentException("Length and width must be greater than 0");
	        }
	        this.length = length;
	        this.width = width;
	    }

	    // Getter & Setter
	    public double getLength() {
	        return length;
	    }

	    public void setLength(double newVal) {
	        if (newVal < 0) {
	            throw new IllegalArgumentException("Length must be greater than 0");
	        }
	        this.length = newVal;
	    }

	    public double getWidth() {
	        return width;
	    }

	    public void setWidth(double newVal) {
	        if (newVal < 0) {
	            throw new IllegalArgumentException("Width must be greater than 0");
	        }
	        this.width = newVal;
	    }

	    // Methods tính chu vi và diện tích
	    public double getPerimeter() {
	        return 2 * (length + width);
	    }

	    public double getArea() {
	        return length * width;
	    }

	    // Biểu diễn hình chữ nhật dưới dạng chuỗi
	    @Override
	    public String toString() {
	        return "Rectangle[length=" + length +
	               ", width=" + width +
	               ", perimeter=" + getPerimeter() +
	               ", area=" + getArea() + "]";
	    }
	}

