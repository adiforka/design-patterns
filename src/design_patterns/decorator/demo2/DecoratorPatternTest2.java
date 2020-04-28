package design_patterns.decorator.demo2;


public class DecoratorPatternTest2 {
    public static void main(String[] args) {

        Shape shape = new RedBorderShapeDecorator(new Square());
        shape.draw();

        Shape shape2 = new GreenBorderShapeDecorator(new Triangle());
        shape2.draw();
    }
}

interface Shape {
    void draw();
}

class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawn Square");
    }
}

class Triangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawn Triangle");
    }
}

abstract class ShapeDecorator implements Shape {

     protected Shape decoratedShape;

     public ShapeDecorator(Shape decoratedShape) {
         this.decoratedShape = decoratedShape;
     }

     public abstract void draw();

}

class RedBorderShapeDecorator extends ShapeDecorator {

    public RedBorderShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setBorder();
    }

    private void setBorder() {
        System.out.println("Drawing Red Border");
    }
}

class GreenBorderShapeDecorator extends ShapeDecorator {

    public GreenBorderShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setBorder();
    }
    private void setBorder() {
        System.out.println("Drawing Green Border");
    }
}