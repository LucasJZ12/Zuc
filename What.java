import javax.swing.JFrame;
public class What{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Test 1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);

        DrawingPanel panel = new DrawingPanel();
        frame.add(panel);

        frame.setVisible(true);
    }
}
