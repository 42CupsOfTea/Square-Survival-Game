import java.awt.*;


public class food {
    private int x,y,cx,cy,speed,size;
    private Color colour;

    public food(int x, int y , int cx, int cy, int speed, Color colour, int size) {
        this.x = x;
        this.y = y;
        this.cx = cx;
        this.cy = cy;
        this.speed = speed;
        this.colour = colour;
        this.size = size;
    }
    public void paint(Graphics g) {  
        g.setColor(colour);
        g.fillOval(x,y,size,size);
    }
    public void movefood () {
        x += cx * Math.abs(speed/2);
        y += cy * Math.abs(speed/2);
    }
    public void bounceOfEdeges(int top, int bottom, int left, int right) {
        if (y > bottom - size) {
            reverseY();
        }
        else if (y < top) {
            reverseY();
        }
        if (x < left) {
            reverseX();
        }
        else if (x > right - size) {
            reverseX();
        }
    }
    public void reverseY () {
        cy *= -1;
    }
    public void reverseX () {
        cx *= -1;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getSize() {
        return size;
    }
}
