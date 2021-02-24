public class Circle {
    float r;

    float square() {
        float s = 31415/10000;
        s = s*4*r*r;
        return s;
    }

    boolean test() {
        return (r > 0);
    }

    Circle(float x) {
        r = x;
    }

}
