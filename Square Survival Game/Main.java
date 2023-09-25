import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Main {
    static JFrame frame = new JFrame("SpaceShip");
    public static void main(String[] args) throws IOException{
        //getting the screen setup
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        spaceGame game = new spaceGame();

        frame.setSize(650,500);
        frame.add(game);
        frame.setVisible(true);


        //main loop of the program
        Timer timer = new Timer(1, new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                game.repaint();
        
        
                try {
                    game.gameLogic();
                } catch (IOException ex) {
                    ex.printStackTrace(); // Or handle the exception as per your requirement
                }
            }
        });
        timer.start();
        
    }
}