class Cube {
    private double cubeside;

    Cube(double cubeside) {
        this.cubeside = cubeside;
    }

    String getCube() {
        return "Cube Dimensions:\n" + "width: " + this.cubeside + " depth: " + this.cubeside + " height: "
                + this.cubeside;
    }
}
