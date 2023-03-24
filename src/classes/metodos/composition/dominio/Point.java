package classes.metodos.composition.dominio;

public class Point {
    private int x =0;
    private int y = 0;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance (int x, int y){
        int deltaX = this.x - x;
        int deltaY = this.y - y;
        return Math.sqrt((deltaX*deltaX +deltaY*deltaY));

    }
    public double distance( Point another){
        int deltaX = this.x - another.x;
        int deltaY = this.y - another.y;
        return Math.sqrt((deltaX*deltaX +deltaY*deltaY));
    }
    public double distance(){
        return Math.sqrt(this.x*this.x + this.y*this.y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int [] getXY(){
        int [] resultado = new int [2];
        resultado [0] = this.x;
        resultado [1] = this.y;
        return resultado;
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
