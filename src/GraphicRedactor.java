public class GraphicRedactor {
    public static void main(String[] args) {
        Shape circle = new Circle("circle");
        System.out.println("circle.getName() = " + circle.getName());

        FigurePrinter figurePrinter = new FigurePrinter();
        System.out.println("figurePrinter.getFigure(circle) = " + figurePrinter.getFigure(circle));

    }
}

