package dio.design.patterns.project.memento;

public class TextEditor {
    private String content;

    public EditorState createState(){
        return new EditorState(content);
    }
    public void restore(EditorState state){
        content = state.getContent();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
