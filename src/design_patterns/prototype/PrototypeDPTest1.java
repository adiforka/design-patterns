package design_patterns.prototype;

import java.util.HashMap;
import java.util.Map;

/*cloning an object from a "prototype" to create a new instance when direct instantiation is costly, e.g. requires a
costly database operation. We can cache the object, return its clone on next request, and update the database as and when
needed, thus reducing no. of database calls*/

public class PrototypeDPTest1 {
    public static void main(String[] args) {

        ShapeCache.loadCache();

        Shape shape1 = ShapeCache.getShape("1");
        shape1.draw();

        Shape shape2 = ShapeCache.getShape("2");
        shape2.draw();
    }
}





