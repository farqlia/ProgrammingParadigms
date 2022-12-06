package lectures.lecture8.badoopexample;

public class BadExample {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        g(r1);

        // class Square violates Liskov substitution principle
        Square s1 = new Square();
        g(s1);

    }

    /*
    An author of this function assumed that changing the height leaves
    the width unchanged. It works well as long as we pass only instances of
    Rectangle class and not Square class

    Because Square class doesn't behave as would be expected from Rectangle class in this
    function, then Square is not identical to Rectangle class

     */
    public static void g(Rectangle r){
        r.setHeight(5);
        r.setWidth(4);
        if (r.getArea() != 20){
            throw new IllegalArgumentException("Incorrect Area!");
        }
    }

}
