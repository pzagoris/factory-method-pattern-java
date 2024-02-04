// Instead of interface we can use also abstract classes.

// Shape interface
interface Shape {
    void draw();
}

// Circle class
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

// Rectangle class
class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

// ShapeFactory interface
interface ShapeFactory {
    Shape getShape();
}

// CircleFactory class
class CircleFactory implements ShapeFactory {
    @Override
    public Shape getShape() {
        return new Circle();
    }
}

// RectangleFactory class
class RectangleFactory implements ShapeFactory {
    @Override
    public Shape getShape() {
        return new Rectangle();
    }
}

// Main class
public class Pattern {
    public static void main(String[] args) {
        ShapeFactory circleFactory = new CircleFactory();
        ShapeFactory rectangleFactory = new RectangleFactory();
        
        Shape circle = circleFactory.getShape();
        Shape rectangle = rectangleFactory.getShape();
        
        circle.draw();
        rectangle.draw();
    }
}
