package patterns.adapter.ex2;

public class AdapterApp {
    public static void main(String[] args) {
        //1сп через наследование
        VectorGraphicsInterface g1 = new VectorAdapterFromGraphics();
        g1.drawLine();
        g1.drawSquare();
        //2сп через композицию
        VectorGraphicsInterface g2 = new VectorAdapterFromGraphics2();
        g2.drawLine();
        g2.drawSquare();
        //3сп через композицию (с конструктором)
        VectorGraphicsInterface g3 = new VectorAdapterFromGraphics3(new RasterGraphics());
        g3.drawLine();
        g3.drawSquare();
    }
}

interface VectorGraphicsInterface{
    void drawLine();
    void drawSquare();
}

class RasterGraphics{
    void drawRaterLine(){
        System.out.println("Рисуем линию");
    }
    void drawRasterSquare(){
        System.out.println("Рисуем квадрат");
    }
}

class VectorAdapterFromGraphics extends RasterGraphics implements VectorGraphicsInterface{
    public void drawLine() {
        drawRaterLine();
    }
    public void drawSquare() {
        drawRasterSquare();
    }
}

class VectorAdapterFromGraphics2 implements VectorGraphicsInterface{
    RasterGraphics rasterGraphics = new RasterGraphics();
    public void drawLine() {
        rasterGraphics.drawRaterLine();
    }
    public void drawSquare() {
        rasterGraphics.drawRasterSquare();
    }
}

class VectorAdapterFromGraphics3 implements VectorGraphicsInterface{
    RasterGraphics rasterGraphics;
    public VectorAdapterFromGraphics3(RasterGraphics rasterGraphics) {
        this.rasterGraphics = rasterGraphics;
    }
    public void drawLine() {
        rasterGraphics.drawRaterLine();
    }
    public void drawSquare() {
        rasterGraphics.drawRasterSquare();
    }
}
