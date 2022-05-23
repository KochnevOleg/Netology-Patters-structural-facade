package Unit3.Patterns.Facade;

public class Main {
    public static void main(String[] args) {
        BinOps binOps = new BinOps();

        System.out.println(binOps.sum("12", "34"));
        System.out.println(binOps.mult("21", "43"));
    }
}
