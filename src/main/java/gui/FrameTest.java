package gui;

import javax.swing.*;
import java.awt.*;

/**
 * @author weat0212@gmail.com
 * @project Thesis
 * @package PACKAGE_NAME
 * @date 2020/7/10 下午 03:57
 */
public class FrameTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame frame = new NotHelloWorldFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.setTitle("Not Hello");
        });
    }
}

class NotHelloWorldFrame extends JFrame {
    public NotHelloWorldFrame() {
//        add(new NotHelloWorldComponent());
//        pack();
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        setSize(screenWidth, screenHeight);
    }
}


//class NotHelloWorldComponent extends JComponent {
//    public static final int MESSAGE_X = 75;
//    public static final int MESSAGE_Y = 100;
//
//    private static final int DEFAULT_WIDTH = 300;
//    private static final int DEFAULT_HEIGHT = 200;
//
//    public void paintComponent(Graphics g) {
//        g.drawString("Not a Hello, World program", MESSAGE_X, MESSAGE_Y);
//    }
//
//    public Dimension getPreferredSize() {
//        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
//    }
//}