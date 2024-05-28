public class Circle extends Shape implements Figurable  {

    @Override
    public void infofigure() {

            if (radius != 0)
            {
                System.out.println("Its Circle");
                System.out.println("Border Color " + borderColor);
                System.out.println("Flood Color " + floodColor);
            }


    }


}
