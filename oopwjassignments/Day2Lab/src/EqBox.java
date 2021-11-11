class EqBox {
    private double width, depth, height;

    EqBox(double width, double depth, double height) {
        this.width = width;
        this.depth = depth;
        this.height = height;
    }

    boolean isEqual(EqBox b2) {
        if (this.width == b2.width && this.depth == b2.depth && this.height == b2.height) {
            return true;
        }
        return false;
    }
}
