package Java_Class_Triangle;

public class Main {
    public static void main(String[] args) {
        Shape shape=new Shape();
        System.out.println(shape.toString());

        Triangle triangle = new Triangle(10,10,10);
        System.out.println(triangle.toString());
    }
}
