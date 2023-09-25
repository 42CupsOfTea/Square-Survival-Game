


import java.awt.*;
public class Player {
    private int x,y,height,speed;
    private Color colour;

    public Player (int x, int y, int height, int speed,Color colour) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.speed = speed;
        this.colour = colour;
    }

    public void paint(Graphics g) {
        g.setColor(colour);
        g.fillRect(x, y, height, height);
    }
    public void moveTowards(int moveToX, int moveToY) {
        
        double centerY = y + height / 2.0;
        double centerX = x + height / 2.0;
        double diffX = moveToX - centerX;
        double diffY = moveToY - centerY;
        double distance = Math.sqrt(diffX * diffX + diffY * diffY);
       
        if (distance > speed) {



            double directionX = diffX / distance;
            double directionY = diffY / distance;
            x += (int) ((5 * directionX) * speed);
            y += (int) ((5 * directionY) * speed);
        } 
    }
    public int getX () {
        return x;
    }
    public int getY () {
        return y;
    }
    public int findHeight () {
        return height;
    }
    
}

