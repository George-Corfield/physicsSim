package George.Physics;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Graphics;

public class Renderer {
    
    private JFrame frame;

    public Renderer(JFrame frame){
        this.frame = frame;
    }

    public void render(){
        Graphics g = frame.getGraphics();
        g.setColor(Color.green);
        g.drawOval(100, 100, 100, 400);
        g.dispose();
    }

}
