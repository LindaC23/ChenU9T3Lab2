import java.awt.Graphics;

public class Arc extends Shape{
    // instance variables
    private int startAngle;
    private int arcAngle;

    // constructor
    public Arc(){
        super();
        startAngle = 30;
        arcAngle = 70;
    }
    @Override
    public void draw(Graphics g){
        // set the color
        g.setColor(getColor());

        // draw the arc given the
        g.drawArc(getMinX(), getMinY(), getWidth(), getHeight(), startAngle, arcAngle);
    }
}
