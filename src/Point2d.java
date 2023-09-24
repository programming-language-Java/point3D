/**
 * Точка в двумерном пространстве
 **/
public class Point2d {
    /**
     * Координаты X и Y точки
     **/
    private double x, y;

    /**
     * Конструктор инициализирующий начальное значение координат точки (x, y).
     **/
    public Point2d(double x, double y) {
        setX(x);
        setY(y);
    }

    /**
     * конструктор без параметров: по умолчанию точка ставится в нач. координат.
     **/
    public Point2d() {
        this(0, 0);
    }

    /**
     * Геттер - возвращает координату X точки.
     **/
    public double getX() {
        return x;
    }

    /**
     * Геттер - возвращает координату Y точки.
     **/
    public double getY() {
        return y;
    }

    /**
     * Сеттер - изменяет координату X точки.
     **/
    public void setX(double val) {
        this.x = val;
    }

    /**
     * Сеттер - изменяет координату Y точки.
     **/
    public void setY(double val) {
        this.y = val;
    }
}
