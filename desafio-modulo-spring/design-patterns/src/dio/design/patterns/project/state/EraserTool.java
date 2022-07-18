package dio.design.patterns.project.state;

public class EraserTool implements Tool{
    @Override
    public void mouseDown() {
        System.out.println("Eraser icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Erase somenthing");
    }
}
