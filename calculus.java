package area;

public class calculus {
    public double width;
    public double height;
    public double perimeter() {
         return (width + height) * 2;
    }
    public double area() {
        return width * height;
    }
    public double diagonal() {
        return Math.sqrt((width*width) + (height*height));
    }
}