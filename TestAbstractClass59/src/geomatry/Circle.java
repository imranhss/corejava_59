package geomatry;

public class Circle extends GeoMatryObject {
    
    private int radius;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(int radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    
    

    @Override
    public double getArea() {
        
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI*2*radius;
    }

    

}
