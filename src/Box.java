public class Box<T> {
    private T content;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    // logic to determine and distribute content according to the defined type
    public <T> T addContentsToTheBox(T value) {
        if (this.content instanceof Integer c && value instanceof Integer i) {
            Integer result = c + i;
            return (T) result;
        } else if (this.content instanceof Double c && value instanceof Double d) {
            Double result = c + d;
            return (T) result;
        } else if (this.content instanceof String c && value instanceof String s) {
            String result = c + "\n" + s;
            return (T) result;
        }
        return null;
    }
}
