import java.util.Scanner;

class Circle {
double radius;

public void input() {
Scanner s = new Scanner(System.in);
System.out.print("Enter the radius of the circle: ");
radius = s.nextDouble();
}

public void area() {
double circleArea = Math.PI * radius * radius;
System.out.println("Area of the circle: " + circleArea);
}
public static void main(String[] args) {
Circle c = new Circle();
c.input();
c.area();
}
}
