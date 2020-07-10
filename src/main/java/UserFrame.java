import java.awt.*;
import javax.swing.*;

public class UserFrame {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame frame = new SimpleFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.setIconImage(new ImageIcon("/neo4j-icon.png").getImage());    //Bug:Not show?
            frame.setTitle("Neo4j Database Management");
            frame.setLocation(0, 0); //左上方開始起算
        });
    }
}

class SimpleFrame extends JFrame {

    public SimpleFrame() {
//        Toolkit kit = Toolkit.getDefaultToolkit();
//        Dimension screenSize = kit.getScreenSize();
//        int screenWidth = screenSize.width;
//        int screenHeight = screenSize.height;
//
//        setSize(screenWidth, screenHeight);
        add(new MyComponent());
        pack();
    }
}

class MyComponent extends JComponent {
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;
//    Toolkit kit = Toolkit.getDefaultToolkit();
//    Dimension screenSize = kit.getScreenSize();
//    int screenWidth = screenSize.width;
//    int screenHeight = screenSize.height;

//    public static final int MESSAGE_X = 75;
//    public static final int MESSAGE_Y = 100;
//
//    public void paintComponent(Graphics g) {
//        g.drawString("Hello World", MESSAGE_X, MESSAGE_Y);
//    }

    public Dimension getPreferredSize() {
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}