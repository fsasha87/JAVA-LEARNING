package oop.exAbstraction1;

class Rectangle extends Figure {
    private int height;
    private int width;
    int result;
    Rectangle (int x, int y, int height, int width){
        super (x,y);
        this.height=height;
        this.width=width;
    }
    @Override
    public int getPerimeter(){
        result = (height+width)*2;
        System.out.println(result);
        return result;
    }

    @Override
    public int getArea() {
        return height*width;
    }
}
