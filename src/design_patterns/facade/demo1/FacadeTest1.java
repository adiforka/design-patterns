package design_patterns.facade.demo1;

/*Facade pattern provides an interface for the client through which to interface a simplified front of the system. Facade
* is a structural pattern, since it adds an interface of simplified methods in front of existing complexity*/
public class FacadeTest1 {
    public static void main(String[] args) {

        ShapeMakerFacade shapeMakerFacade = new ShapeMakerFacade();
        shapeMakerFacade.drawSquare();
        shapeMakerFacade.drawCircle();
        shapeMakerFacade.drawRectangle();

    }
}

interface Shape {
    void draw();

}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square implements Shape {
    public void draw() {
        System.out.println("Drawing a square");
    }
}

//implementing a facade class
class ShapeMakerFacade {

    private final Shape circle;
    private final Shape square;
    private final Shape rectangle;

    public ShapeMakerFacade() {
        circle = new Circle();
        square = new Square();
        rectangle = new Rectangle();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawSquare() {
        square.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }
}
