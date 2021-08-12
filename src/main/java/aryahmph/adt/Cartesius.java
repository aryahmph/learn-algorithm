package aryahmph.adt;

public class Cartesius {
    private int x;
    private int y;

    public Cartesius(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Display :
     * x : 0
     * y : 2
     */
    public void displayCoordinate() {
        System.out.printf("x : %d\ny : %d\n", this.x, this.y);
    }

    /**
     * Quadrant 1, x +, y -
     * Quadrant 2 x -, y +
     * Quadrant 3, x -, y -
     * Quadrant 4, x +, y -
     *
     * @return string
     */
    public String getQuadrant() {
        if (x > 0) return y > 0 ? "Quadrant I" : "Quadrant 4";
        else return y > 0 ? "Quadrant II" : "Quadrant 3";
    }
}
