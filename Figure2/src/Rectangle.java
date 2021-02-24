public class Rectangle {
    float a;
    float b;

    Rectangle() {
         a = 0;
         b = 0;
    }

    Rectangle(float x, float y) {
        a = x;
        b = y;
    }

    float square() {
        float s = a * b;
        return s;
    }

    boolean test() {
        return ((a > 0) && (b > 0));
    }
}
