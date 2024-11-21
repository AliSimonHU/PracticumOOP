
// - width: double
// - length: double
// - depth: double
/////////////////////////////////////
// + Zwembad()
// + Zwembad(double, double, double)
// + getWidth(): double
// + setWidth(double): void
// + getLength(): double
// + setLength(double): void
// + getDepth(): double
// + setDepth(double): void
// + contents(): double
// + toString(): String

public class Zwembad {
    private double width;
    private double length;
    private double depth;

    public Zwembad() {
        this.width = 0.0;
        this.length = 0.0;
        this.depth = 0.0;
    }

    public Zwembad(double width, double length, double depth) {
        this.width = width;
        this.length = length;
        this.depth = depth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double contents() {
        return width * length * depth;
    }

    @Override
    public String toString() {
        return "Dit zwembad is " + width + " meter breed, " +
                length + " meter lang, en " + depth + " meter diep";
    }
}
