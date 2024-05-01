package abstracts;

public class Lion extends Animal{

    public void leads(){
        System.out.println("and you know it");
    }

    @Override
    public void sing() {
        System.out.println("Real Lions don´t sing");
    }

    public Lion(String name, String age) {
        super(name, age);
    }
}
