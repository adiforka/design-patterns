package design_patterns.factory.abstractFactory.demo4;

public class AbstractFactoryTest4 {
    public static void main(String[] args) {

        FactoryProducer.getFactory(true).getShape("furrybear").draw();
        FactoryProducer.getFactory(false).getShape("triangle").draw();
        FactoryProducer.getFactory(true).getShape("furrybee").draw();
        FactoryProducer.getFactory(false).getShape("circle").draw();
    }
}

interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Triangle implements Shape {
    public void draw() {
        System.out.println("Drawing Triangle");
    }
}

class FurryBear implements Shape {
    public void draw() {
        System.out.println("Drawing Furry Bear");
    }
}

class FurryBee implements Shape {
    public void draw() {
        System.out.println("Drawing Furry Bee");
    }
}

abstract class FactoryProducer {

    public abstract Shape getShape(String type);

    public static FactoryProducer getFactory(boolean furry) {
        if (furry) return new FurryShapeFactory();
        else return new NormalShapeFactory();
    }
}

class FurryShapeFactory extends FactoryProducer {

    public Shape getShape(String type) {
        if (type.equalsIgnoreCase("furrybear")) return new FurryBear();
        else if (type.equalsIgnoreCase("furrybee")) return new FurryBee();
        else return null;
    }
}

class NormalShapeFactory extends FactoryProducer {

    public Shape getShape(String type) {
        if (type.equalsIgnoreCase("triangle")) return new Triangle();
        else if (type.equalsIgnoreCase("circle")) return new Circle();
        else return null;
    }

}
