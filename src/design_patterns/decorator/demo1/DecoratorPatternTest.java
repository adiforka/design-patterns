package design_patterns.decorator.demo1;

//add functionality to object without changing the impl of its class
// and without using subclassing (inheritance)
public class DecoratorPatternTest {
    public static void main(String[] args) {

        //mind that the decorator IS an instance of the decorated object's type
        Shape shape = new RedShapeDecorator(new Circle());
        shape.draw();

        System.out.println("---------------------------------");

        Shape shape2 = new RedShapeDecorator(new Rectangle());
        shape2.draw();

    }
}

//to make sense, decorator objects need to wrap something that can exists in and of itself.
//that's why we should not have "just the decorators" decorating other decorators
//remember coffee example: you cannot just have caramel, it only makes sense when added to a coffee
interface Shape {

    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}

//it's interesting how a decorator object both has a decorated object (composition) and is
//an instance of the type of that object (hopefully an interface -- inheritance, but it does not inherit from
// the decorated object directly). We are using composition here, not inheritance, to share behavior
//(inheritance is not for code reuse, but for substitutability of types and runtime flexibility)
abstract class ShapeDecorator implements Shape {
    //setting abstract class fields to protected so that inheriting classes can access them easier
    protected Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    public void draw() {
        shape.draw();
    }
}

class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        shape.draw();
        drawRedBorder();
    }

    private void drawRedBorder() {
        System.out.println("Border color: Red");
    }
}



