public class Quadro extends Rectangle {
    boolean test() {
        boolean x = (a == b);
        x = x && (a > 0);
        return x;
    }

    Quadro(float x) {
        a = x;
    }

}
