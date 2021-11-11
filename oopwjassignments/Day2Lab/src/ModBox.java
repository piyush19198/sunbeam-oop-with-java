class ModBox {
    private double width, depth, height;

    ModBox(double width, double depth, double height) {
        this.width = width;
        this.depth = depth;
        this.height = height;
    }

    String getNewBox(double newwidth, double newdepth, double newheight) {
        this.width = newwidth + width;
        this.depth = newwidth + depth;
        this.height = newwidth + height;
        return "Updated Box: " + this.width + " " + this.depth + " " + this.height;
    }
}
