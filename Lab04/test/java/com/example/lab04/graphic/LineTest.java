package test.java.com.example.lab04.graphic;

import main.java.com.example.lab04.graphic.Line;

public class LineTest {
    @Test
    public void testDraw() {
        Line line = new Line();
        assertDoesNotThrow(() -> line.draw());
    }
}
