/**
 * ����� � ��������� ������������
 **/
public class Point2d {
    /**
     * ���������� X � Y �����
     **/
    private double x, y;

    /**
     * ����������� ���������������� ��������� �������� ��������� ����� (x, y).
     **/
    public Point2d(double x, double y) {
        setX(x);
        setY(y);
    }

    /**
     * ����������� ��� ����������: �� ��������� ����� �������� � ���. ���������.
     **/
    public Point2d() {
        this(0, 0);
    }

    /**
     * ������ - ���������� ���������� X �����.
     **/
    public double getX() {
        return x;
    }

    /**
     * ������ - ���������� ���������� Y �����.
     **/
    public double getY() {
        return y;
    }

    /**
     * ������ - �������� ���������� X �����.
     **/
    public void setX(double val) {
        this.x = val;
    }

    /**
     * ������ - �������� ���������� Y �����.
     **/
    public void setY(double val) {
        this.y = val;
    }
}
