public class Point3d extends Point2d {
    private double z;

    public Point3d() {
        this(0, 0, 0);
    }

    public Point3d(double x, double y, double z) {
        super(x, y);
        setZ(z);
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public boolean equals(Point3d point) {
        return this.getX() == point.getX() && this.getY() == point.getY() && this.getZ() == point.getZ();
    }

    public double distanceTo(Point3d point) {
        double squaredDifferenceX = Math.pow(point.getX() - this.getX(), 2);
        double squaredDifferenceY = Math.pow(point.getY() - this.getY(), 2);
        double squaredDifferenceZ = Math.pow(point.getZ() - this.getZ(), 2);
        double sumSquaresDifference = squaredDifferenceX + squaredDifferenceY + squaredDifferenceZ;
        return Math.sqrt(sumSquaresDifference);
    }
}