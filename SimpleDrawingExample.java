import javax.swing.JFrame;

public class SimpleDrawingExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Drawing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        DrawingPanel panel = new DrawingPanel();
        frame.add(panel);

        frame.setVisible(true);
    }
}