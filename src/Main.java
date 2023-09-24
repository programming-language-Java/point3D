import java.util.Scanner;

public class Main {
    private static Point3d point1, point2, point3;

    public static void main(String[] args) {
        System.out.println("Введите координаты точки 1 (x, y, z):");
        Scanner scanner = new Scanner(System.in);
        double point1X = scanner.nextDouble();
        double point1Y = scanner.nextDouble();
        double point1Z = scanner.nextDouble();

        System.out.println("Введите координаты точки 2 (x, y, z):");
        double point2X = scanner.nextDouble();
        double point2Y = scanner.nextDouble();
        double point2Z = scanner.nextDouble();

        System.out.println("Введите координаты точки 3 (x, y, z):");
        double point3X = scanner.nextDouble();
        double point3Y = scanner.nextDouble();
        double point3Z = scanner.nextDouble();
        scanner.close();

        point1 = new Point3d(point1X, point1Y, point1Z);
        point2 = new Point3d(point2X, point2Y, point2Z);
        point3 = new Point3d(point3X, point3Y, point3Z);

        if (isPointsEqual()) {
            System.out.println("Ошибка! Вы ввели одинаковые точки.");
            return;
        }
        System.out.println("Площадь треугольника: " + computeArea(point1, point2, point3));
    }

    private static boolean isPointsEqual() {
        return point1.equals(point2) || point2.equals(point3) || point3.equals(point1);
    }

    public static double computeArea(Point3d point1, Point3d point2, Point3d point3) {
        double distanceA = point1.distanceTo(point2);
        double distanceB = point2.distanceTo(point3);
        double distanceC = point3.distanceTo(point1);
        double sumDistances = distanceA + distanceB + distanceC;
        double perimeter = sumDistances / 2;
        return Math.sqrt(perimeter * (perimeter - distanceA) * (perimeter - distanceB) * (perimeter - distanceC));
    }
}
