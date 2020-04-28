package design_patterns.decorator.demo4;

public class DecoratorPatternTest4 {
    public static void main(String[] args) {

        var shapeDecorator = new RedOutlineDecorator(new Circle());
        shapeDecorator.draw();

        var shapeDecorator1 = new RedOutlineDecorator(new Rectangle());
        shapeDecorator1.draw();

        var shapeDecorator2 = new BlueOutlineDecorator(new Circle());
        shapeDecorator2.draw();

        var shapeDecorator3 = new BlueOutlineDecorator(new Rectangle());
        shapeDecorator3.draw();

    }
}

interface Shape {
    void draw();
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawn a circle");
    }

    public String toString() {
        return "circle";
    }
}

class Rectangle implements Shape {

    public void draw() {
        System.out.println("Drawn a rectangle");
    }

    public String toString() {
        return "rectangle";
    }
}

abstract class ShapeDecorator {

    protected Shape shape;

    public ShapeDecorator(Shape shape) {
      this.shape = shape;
    }

    abstract void draw();
}

class RedOutlineDecorator extends ShapeDecorator {

    public RedOutlineDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        this.drawOutline();
    }

    //you probably need an instance of shape here with more logic to be implemented
    private void drawOutline() {
        System.out.println("Drawn red outline on " + shape.toString());
    }
}

class BlueOutlineDecorator extends ShapeDecorator {

    public BlueOutlineDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        drawOutline();
    }

    private void drawOutline() {
        System.out.println("Drawn blue outline on " + shape.toString());
    }
}




