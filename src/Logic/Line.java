package Logic;

public class Line {
    private Vertex endPoint1;
    private Vertex endPoint2;
    private Vertex midPoint;
    private double length;

    //constructor of line class
    public Line(Vertex p1, Vertex p2) {
        this.endPoint1 = p1;
        this.endPoint2 = p2;
        double x1 = p1.getX();
        double y1 = p1.getY();
        double x2 = p2.getX();
        double y2 = p2.getY();
        this.length = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)); //formula to calculate length bw two points
        this.midPoint = new Vertex(((int) x1 + (int) x2) / 2, ((int) y1 + (int) y2) / 2);
    }

    public Vertex getEndPoint1() {
        return endPoint1;
    }

    public Vertex getEndPoint2() {
        return endPoint2;
    }

    public double getLength() {
        return length;
    }

    public void setLength() {
        this.length = this.calculateLength();
    }

    public double calculateLength() {
        int x1 = this.getEndPoint1().getX();
        int y1 = this.getEndPoint1().getY();
        int x2 = this.getEndPoint2().getX();
        int y2 = this.getEndPoint2().getY();
        return Math.round(Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)) * 100.0) / 100.0;
    }
}
