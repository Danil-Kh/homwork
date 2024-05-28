public class Polygon extends Shape implements Figurable  {
    @Override
    public void infofigure() {

        if (isCube())
        {
            System.out.println("Its polygon with" + masOfSides.length + "sides");
            System.out.println("Border Color " + borderColor);
            System.out.println("Flood Color " + floodColor);
        }


    }
}
