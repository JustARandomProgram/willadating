import javax.swing.SwingUtilities;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Controller controller = new Controller()
                                .setWindow(new Window());
            controller.init();
        });
    }
}
