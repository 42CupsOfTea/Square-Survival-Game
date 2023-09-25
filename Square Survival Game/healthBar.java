import java.awt.*;

public class healthBar {
    private int x,y, height,health;
    private Color colour;

    public healthBar (int x, int y,int height,Color colour, int life) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.colour = colour;
        this.health = life;
    }

    public void paint (Graphics g) {
        g.setColor(colour);
        g.fillRect(x, y, health, height);
        
    }
    public void updateHealth (int hearts) {
        this.health = hearts;
    }
}
