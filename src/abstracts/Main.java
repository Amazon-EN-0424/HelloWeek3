package abstracts;

public class Main {
    public static void main(String[] args) {


        Lion lion = new Lion("Simba", "3");
        System.out.println(lion);

        Bat bat = new Bat("Bruce", "7");
        bat.fly();
        Bear bear = new Bear("Winnie ", "4");
        bear.stealTheHoney();

        System.out.println(bat.getName());
    }
}
