class ColVol {
    private double width, depth, height;
    private String color;

    ColVol(double width, double depth, double height, String color) {
        this.width = width;
        this.depth = depth;
        this.height = height;
        this.color = color;
    }

    double getBoxVolume() {
        return width * depth * height;
    }

    String getColor(ColVol b1, ColVol b2) {
        if (b1.getBoxVolume() > b2.getBoxVolume()) {
            return b1.color;
        } else if (b2.getBoxVolume() > b1.getBoxVolume()) {
            return "Color of Bigger box is " + b2.color;
        } else {
            return "Both are Equal in volume";
        }
    }
}
