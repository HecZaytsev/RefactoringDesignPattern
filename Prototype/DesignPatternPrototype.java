package Prototype;

import java.util.ArrayList;
import java.util.List;

public class DesignPatternPrototype {

    public DesignPatternPrototype(){

    }
    public void exemplo(){
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "azul";
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "azul";
        shapes.add(rectangle);

        cloneAndCompare(shapes, shapesCopy);

}

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": As formas, são objetos diferentes!");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": E eles são identicos!");
                } else {
                    System.out.println(i + ": Mas eles não são identicos");
                }
            } else {
                System.out.println(i + ": As formas dos objetos são identicas!");
            }
        }
    }
}