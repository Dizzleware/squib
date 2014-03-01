import java.awt.*;

/**
 * Created by Cayle J. Elsey on 2/27/14.
 */
public interface entity {
    enum DIRECTION{
        NORTH,
        SOUTH,
        EAST,
        WEST;
    }

    enum COLOR{
        RED,
        BLACK,
        ORANGE,
        YELLOW,
        GREEN,
        BLUE,
        PURPLE;
    }
    public void remove();
    public void place(Point p);
    public void move(DIRECTION dir);
    public void convert(COLOR color);
}
