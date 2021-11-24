package abstraction;

class Rectangle extends Figure {
    private int height;
    private int weight;
    int result;
    Rectangle (int x, int y, int height, int weight){
        super (x,y);
        this.height=height;
        this.weight=weight;
    }
    @Override
    public int getPerimeter(){
        result = (height+weight)*2;
        System.out.println(result);
        return result;
    }

    @Override
    public int getArea() {
        return height*weight;
    }
}
