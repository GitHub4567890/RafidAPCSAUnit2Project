import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Welcome
        System.out.println("Welcome");
        System.out.print("Enter coordinate 1: ");
        String coord1 = scan.nextLine();
        System.out.print("Enter coordinate 2: ");
        String coord2 = scan.nextLine();
        System.out.println();

        //Debug
        System.out.println(coord1 + " " + coord2);

        //Coordinate to int
        int x1, y1;
        int x2, y2;
        int commaPos1 = coord1.indexOf(",");
        int commaPos2 = coord2.indexOf(",");

        String strNumX1 = coord1.substring(1,commaPos1);
        String strNumY1 = coord1.substring(commaPos1 + 2, coord1.length() - 1);
        x1 = Integer.parseInt(strNumX1);
        y1 = Integer.parseInt(strNumY1);

        String strNumX2 = coord2.substring(1,commaPos2);
        String strNumY2 = coord2.substring(commaPos2 + 2, coord2.length() - 1);
        x2 = Integer.parseInt(strNumX2);
        y2 = Integer.parseInt(strNumY2);

        //Debug
        System.out.println(x1);
        System.out.println(y1);
        System.out.println(x2);
        System.out.println(y2);

        //Object creation
        LinearEquation lnE1 = new LinearEquation(x1,y1,x2,y2);
        System.out.println(lnE1.lineInfo());
        System.out.println();
        System.out.print("Enter a value for x: ");
        double xValue = scan.nextDouble();
        System.out.println("The point on the line is " + lnE1.coordinateForX(xValue));






    }
}