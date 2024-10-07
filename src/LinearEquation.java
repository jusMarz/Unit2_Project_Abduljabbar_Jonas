public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private double slope;
    private double yIntercept;
    private double distanceBetweenPoints;

    public LinearEquation(int x1, int y1, int x2, int y2)
    {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        slope = (((double) y2 - y1) /+ ((double) x2 - x1));
        yIntercept = (y1 - (slope) * x1);
        distanceBetweenPoints = ((Math.sqrt(((x2 - x1)*(x2 - x1)) + ((y2 - y1)*(y2 - y1)))) + .005);
        distanceBetweenPoints -= distanceBetweenPoints % .01;
    }
    public String toString()
    {

        return "First Pair: (" + x1 + "," + y1 + ") \n Second Pair: (" + x2 + "," + y2 + ") \n Slope of Line: " + slope + "\n Y intercept: " + yIntercept + "\n Slope intercept form: " + (y2 -y1)+"/"+ (x2-x1)+ "x + "+ yIntercept + "\n Distance between points: " + distanceBetweenPoints;
    }
    public String calculatePoint(double x3)
    {
        return (("(" + x3 + "," + ((x3 * slope) + yIntercept)) + ")");
    }
}
