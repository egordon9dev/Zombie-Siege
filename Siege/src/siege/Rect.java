package siege;
public class Rect extends Point
{
    public double w, h;
    
    public Rect(double x, double y, double w, double h) {
        super(x, y);
        this.w = w;
        this.h = h;
    }
}
