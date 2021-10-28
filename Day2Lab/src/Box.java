class Box {
    private double width, depth, height;

    Box(double width, double d, double height) {
        this.width = width;
        depth = d;
        this.height = height;
    }

    String getBoxDimensions() {
        return "Box Dims " + this.width + " " + depth + " " + this.height;
    }

    double getBoxVolume() {
        return width * depth * height;
    }
}
