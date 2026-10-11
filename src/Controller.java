public class Controller {
    public Window window;

    public Controller setWindow(Window newWindow) {
        window = newWindow;
        return this;
    }

    public void init() {
        window.initWindow();
    }
}
