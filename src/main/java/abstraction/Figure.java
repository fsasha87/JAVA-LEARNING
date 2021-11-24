package abstraction;

abstract class Figure {
    int x;
    int y;
    Figure (int x, int y){
        this.x=x;
        this.y=y;
    }
    public abstract int getPerimeter();
    public abstract int getArea();
    public int getVolume (){
        return x*y;
    }
}
