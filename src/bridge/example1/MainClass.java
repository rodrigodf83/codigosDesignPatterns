package bridge.example1;

public class MainClass {

    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCicle());
        Shape greenCircle = new Circle(50, 50, 5, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
