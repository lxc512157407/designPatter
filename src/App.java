import lesson1.*;
import lesson2.*;
public class App{
    public static void main(String[] args) {
        System.out.println("hello world");
        Lesson1 lesson1 = new Lesson1();
        lesson1.say();
        Lesson2 lesson2 =new Lesson2();
        lesson2.say();
        lesson2.getShape(ShapeType.CIRCLE).draw();
        lesson2.getShape(ShapeType.RECTANGLE).draw();
        lesson2.getShape(ShapeType.SQUARE).draw();
    }
}