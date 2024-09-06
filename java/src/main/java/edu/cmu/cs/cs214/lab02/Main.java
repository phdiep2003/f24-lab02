package edu.cmu.cs.cs214.lab02;
import edu.cmu.cs.cs214.lab02.shapes.Shape;
import edu.cmu.cs.cs214.lab02.shapes.Circle;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(2);

        Renderer renderer = new Renderer(circle);

        renderer.draw();
    }
}
