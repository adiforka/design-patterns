package design_patterns.factory;

/*Factory pattern is one of the most used design patterns in Java. This type of design pattern comes under
creational pattern as this pattern provides one of the best ways to create an object.

In Factory pattern, we create object without exposing the creation logic to the client and refer to newly
created object using a common interface.*/
public class FactoryPatternShapes {
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("circle");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("square");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("rectangle");
        shape3.draw();
    }
}

interface Shape {
    void draw();
}

class Circle implements Shape {

    public void draw() {
        System.out.println("Inside Circle::draw() method");
    }
}

class Rectangle implements Shape {

    public void draw() {
        System.out.println("Inside Rectangle::draw() method");
    }
}

class Square implements Shape {

    public void draw() {
        System.out.println("Inside Square::draw() method");
    }
}

class ShapeFactory {

    public Shape getShape(String type) {
        if (type.equalsIgnoreCase("square")) return new Square();
        else if (type.equalsIgnoreCase("circle")) return new Circle();
        else if (type.equalsIgnoreCase("rectangle")) return new Rectangle();
        return null;
    }

}
