public class TestBox {
    public static void main(String[] args) {

        Box<String> textBox = new Box<>();
        textBox.setContent("Saving text in my box!");
        System.out.println(textBox.addContentsToTheBox("one more line"));

        Box<Integer> ageBox = new Box<>();
        ageBox.setContent(30);
        System.out.println(ageBox.addContentsToTheBox(26));

        Box<Double> valueBox = new Box<>();
        valueBox.setContent(150.50);
        System.out.println(valueBox.addContentsToTheBox(350.50));
    }
}
