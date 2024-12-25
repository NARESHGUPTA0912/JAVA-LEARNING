import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class AppPanel extends JPanel {
    BufferedImage bgImage;
    int xAxis = 0;
    int yAxis = 250;
    int x=10; 
    int y=10;
    Timer timer;

    AppPanel() {
        setSize(500, 500);
        // setBackground(Color.BLUE);
        loadBgImage();
        callPaintAgain();
    }

    void loadBgImage() {
        try {
            bgImage = ImageIO.read(AppPanel.class.getResource("car.png"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    void callPaintAgain() {
        timer = new Timer(50, (a) ->  {
            // if (xAxis > 500) {
            //     xAxis = 0;
            // } 
            
            xAxis += x;
            yAxis += y;
            if(xAxis<=0 || xAxis>=500-100){
                x=-x;       // for reverse direction horizontally
            }
            if(yAxis<=0 || yAxis>=500-100){
                y=-y;       // for reverse direction vertically
            }
        
            repaint();
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics brush) {
        super.paintComponent(brush);
        brush.drawImage(bgImage, xAxis, yAxis, 80, 120, null);
    }
}
