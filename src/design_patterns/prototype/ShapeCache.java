package design_patterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {

    private static final Map<String, Shape> shapeMap = new HashMap<>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return cachedShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Triangle triangle = new Triangle();
        triangle.setId("2");
        shapeMap.put(triangle.getId(), triangle);

        Square square = new Square();
        square.setId("3");
        shapeMap.put(square.getId(), square);
    }
}