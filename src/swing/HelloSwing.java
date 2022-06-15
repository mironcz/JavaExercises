package swing;

import javax.swing.JFrame;

public class HelloSwing extends JFrame {
    public static void main(String[] args) {
        new HelloSwing();
    }

    public HelloSwing() {
        setTitle("Hello Swing");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(600, 400);
        setVisible(true);
    }
}
