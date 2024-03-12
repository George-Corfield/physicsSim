package George.Physics;

import java.awt.Dimension;
import javax.swing.*;

public class Main implements Runnable{

    public static final String VERSION = "0.0.1";
    public static final String TITLE = "Physics Sim" + VERSION;
    public static final Dimension SCREEN_SIZE = new Dimension(800, 600);

    public JFrame frame;
    public Renderer renderer;
    public static void main(String[] args) {
        Main main = new Main();
        new Thread(main).start();
    }

    public Main(){
        frame = new JFrame();
        frame.setSize(SCREEN_SIZE);
        frame.setTitle(TITLE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        renderer = new Renderer(frame);

        frame.setVisible(true);
    }

    public void run(){
        while(true){
            renderer.render();
            try {Thread.sleep(50);}
            catch(InterruptedException ie) {}
        }

    }
}