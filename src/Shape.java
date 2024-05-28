public class Shape {

    public static void main(String[] args) {

        new Circle().infofigure();
        new Linef().infofigure();
        new Triangle().infofigure();
        new Rectangle().infofigure();
        new Square().infofigure();

    }


    protected boolean isCube() {
        double[] masOfSides = FigureInput.getMasofSides();
        if (masOfSides.length == 4) {

            double firstelement = masOfSides[0];
            for (int i = 1; i < masOfSides.length; i++) {
                if (masOfSides[i] == firstelement) {
                    return true;
                }
            }

        }
        else if(masOfSides.length > 4) {
            return true;
        }
        return false;
    }
}

