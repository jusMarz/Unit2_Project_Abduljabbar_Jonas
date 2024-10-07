import java.util.Scanner;
public class EquationRunner {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);


        System.out.println("Enter your first Coordinate point: ");
        String firstCoordinate = userInput.nextLine();
        System.out.println("Enter your second Coordinate point: ");
        String secondCoordinate = userInput.nextLine();
        //(Double.parseDouble(firstCoordinate.substring(firstCoordinate.indexOf("(") + 1,firstCoordinate.indexOf(",")))) <- template
        LinearEquation s = new LinearEquation(
                (Integer.parseInt(firstCoordinate.substring(firstCoordinate.indexOf("(") + 1,firstCoordinate.indexOf(",")))),
                (Integer.parseInt(firstCoordinate.substring(firstCoordinate.indexOf(",") + 1,firstCoordinate.indexOf(")")))),
                (Integer.parseInt(secondCoordinate.substring(secondCoordinate.indexOf("(") + 1,secondCoordinate.indexOf(",")))),
                (Integer.parseInt(secondCoordinate.substring(secondCoordinate.indexOf(",") + 1,secondCoordinate.indexOf(")"))))
        );
        System.out.println(s);
        System.out.println("Enter in a third x value: ");
        double x = Double.parseDouble(userInput.nextLine());
        System.out.println("Solved coordinate point is: " + s.calculatePoint(x));
    }
}
