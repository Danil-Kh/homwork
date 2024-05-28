public class Square extends Shape implements  Figurable{

    @Override
    public void infofigure() {

        if (isCube())
        {
            System.out.println("Its Square");
            System.out.println("Border Color " + borderColor);
            System.out.println("Flood Color " + floodColor);
        }


    }
}
