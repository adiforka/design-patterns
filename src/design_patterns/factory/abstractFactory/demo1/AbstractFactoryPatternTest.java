package design_patterns.factory.abstractFactory.demo1;

/*first you produce the right kind of factory implementation based on a boolean value narrowing down the type of object
you want to create, then you use the factory to specify the type of object you want to create, and the factory creates the
object for you based on the type specified FactoryProducer and Factory both have their return values set to abstractions
whose concrete implementations are set at runtime by the JVM when the objects are actually created, and the draw methods'
implementations are only know then, and only thanks to the objects calling them having been created*/
public class AbstractFactoryPatternTest {
    public static void main(String[] args) {

        AbstractFactory abstractFactory = FactoryProducer.getFactory(true);

        Shape shape1 = abstractFactory.getShape("roundedSquare");
        shape1.draw();

        Shape shape2 = abstractFactory.getShape("roundedRectangle");
        shape2.draw();

        AbstractFactory abstractFactory1 = FactoryProducer.getFactory(false);

        Shape shape3 = abstractFactory1.getShape("square");
        shape3.draw();

        Shape shape4 = abstractFactory1.getShape("rectangle");
        shape4.draw();
    }
}

interface Shape {
    void draw();
}

class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method");
    }
}

class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method");
    }
}

class RoundedRectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside RoundedRectangle::draw() method");
    }
}

class RoundedSquare implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside RoundedSquare::draw() method");
    }
}

//this is the gist of the abstract factory pattern: create a factory of factories
abstract class AbstractFactory {
    abstract Shape getShape(String shapeType);
}

class ShapeFactory extends AbstractFactory implements Cloneable{

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("square")) return new Square();
        else if (shapeType.equalsIgnoreCase("rectangle")) return new Rectangle();
        return null;
    }
}

class RoundedShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("roundedRectangle")) return new RoundedRectangle();
        else if (shapeType.equalsIgnoreCase("roundedSquare")) return new RoundedSquare();
        return null;
    }
}

//factory producer decides which factory implementation's instance will be created depending on a condition
abstract class FactoryProducer {
    public static AbstractFactory getFactory(boolean rounded) {
        if (rounded) return new RoundedShapeFactory();
        else return new ShapeFactory();
    }
}