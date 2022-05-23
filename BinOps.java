package Unit3.Patterns.Facade;

public class BinOps {
    public String sum(String a, String b) {
    return String.valueOf(Integer.parseInt(a) + Integer.parseInt(b));
    }

    public String mult(String a, String b) {
    return String.valueOf(Integer.parseInt(a) * Integer.parseInt(b));
    }
}