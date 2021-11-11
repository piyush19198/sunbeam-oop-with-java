class Point2D {
    private int xco, yco;

    Point2D(int x, int y) {
        this.xco = x;
        this.yco = y;
    }

    String getDetails() {
        return "Co-ordinates are " + xco + " & " + yco;
    }

    boolean isEqual(Point2D p2) {
        return this.xco == p2.xco && this.yco == p2.yco;
    }

    double calcDistance(Point2D p2) {
        return Math.sqrt(Math.pow(this.xco - p2.xco, 2) + Math.pow(this.yco - p2.yco, 2));
    }
}