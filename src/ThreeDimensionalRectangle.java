import java.awt.*;

public class ThreeDimensionalRectangle extends Shape{
    boolean raised = true;

    public ThreeDimensionalRectangle(){
        super();
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());

        g.draw3DRect(getMinX(), getMinY(), getWidth(), getHeight(), true);
    }
}
