public class Triangle implements Figurable{

    @Override
    public void infofigure() {
        if (masOfSides.length == 3)
        {
            System.out.println("Its Triangle");
            System.out.println("Border Color " + borderColor);
            System.out.println("Flood Color " + floodColor);
        }
    }
}
