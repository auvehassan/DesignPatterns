package creational.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

class ShapeTest {


@Test
void testCreateShape() {
    String type = "Circle";
    String color = "Red";
    Shape shape = new Shape(type, color);
    
    assertEquals("Shape [type=" + type + ", color=" + color + "]", shape.toString());
}

@Test
void testCloneShape() {
    Shape originalShape = new Shape("Square", "Blue");
    Shape clonedShape = (Shape) originalShape.clone();
    
    assertNotSame(originalShape, clonedShape);
    assertEquals(originalShape.toString(), clonedShape.toString());
}
}
