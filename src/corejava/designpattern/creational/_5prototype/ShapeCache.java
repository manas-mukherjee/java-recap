package corejava.designpattern.creational._5prototype;

import java.util.HashMap;

public class ShapeCache {
    private static HashMap<String, Shape> SHAPE_CACHE = new HashMap<>();

    static {
        Circle circle = new Circle();
        circle.setId("1");
        SHAPE_CACHE.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        SHAPE_CACHE.put(square.getId(), square);
    }

    public static Shape getShape(String shapeId){
        Shape cachedShape = SHAPE_CACHE.get(shapeId);
        return (Shape) cachedShape.clone();
    }
}
