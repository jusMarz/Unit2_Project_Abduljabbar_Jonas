public class LinearEquation {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private String slope;
    private double yIntercept;
    private double distanceBetweenPoints;

    public LinearEquation(double x1, double y1, double x2, double y2)
    {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        slope = ((y2 - y1) + "/" + (x2 - x1));
        yIntercept = (y1 - (Double.parseDouble(slope) * x1));
        distanceBetweenPoints = Math.sqrt(((x2 - x1)*(x2 - x1)) + ((y2 - y1)*(y2 - y1)));

    }
    public String toString()
    {

        return "First Pair: (" + x1 + "," + y1 + ") \n Second Pair: (" + x2 + "," + y2 + ") \n Slope of Line: " + slope + "\n Y intercept: " + yIntercept + "\n Distance between points: " + distanceBetweenPoints;
    }

}
