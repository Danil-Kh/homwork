import java.util.Scanner;

public class FigureInput {
   private int  radius;
   private static double[] masofSides;
   private final String borderColor;
   private final String floodColor;
   Scanner scanner = new Scanner(System.in);

    FigureInput(){
        int sides;
        System.out.println("Pleas enter a number of sides  to your figure");
        System.out.println("if the figure has no sides, enter 0 first and then the radius");
        sides = scanner.nextInt();
        masofSides = new double[sides];
        if (sides == 0)
        {
            System.out.println("Enter the radius");
            radius = scanner.nextInt();
        }
        else {
            for (int i = 0; i < sides; i++) {
                System.out.println("Pleas enter param to your figure side " + (i + 1) +" = ");
                masofSides[i] = scanner.nextDouble();
            }
        }
        System.out.println("Pleas enter figure borderColor");
        borderColor = scanner.next();

        System.out.println("Pleas enter figure floodColor");
        floodColor = scanner.next();

    }
    public String getBorderColor() {
        return borderColor;
    }

    public String getFloodColor() {
        return floodColor;
    }

    public int getRadius() {
        return radius;
    }
    public static double[] getMasofSides() {
        return masofSides;
    }


}

