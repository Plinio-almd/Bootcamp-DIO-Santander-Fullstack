package dio.design.patterns.project.state;

public class SelectionTool implements Tool{
    @Override
    public void mouseDown() {
        System.out.println("Selector icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a dashed rectangle");
    }
}
