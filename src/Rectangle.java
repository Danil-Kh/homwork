public class Rectangle extends Shape implements Figurable  {

    @Override
    public void infofigure() {
        if (!isCube() && masOfSides.length != 0)
        {
            System.out.println("Its Rectangle");
            System.out.println("Border Color " + borderColor);
            System.out.println("Flood Color " + floodColor);
        }


    }
}
