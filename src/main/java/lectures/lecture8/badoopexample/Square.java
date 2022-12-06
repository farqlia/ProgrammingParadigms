package lectures.lecture8.badoopexample;

/*
It would make sense that Square inherits from Rectangle
because square is a rectangle.
However, the first sign of troubles is that square doesn't need
both the height and width. It can lead to some memory issues because
we're wasting some space. Apart from the memory issue, the class inherits
unnecessary functionalities.
Now let's say we decide to override both width and height methods
to set the same value.
 */
public class Square extends Rectangle {

    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    public void setHeight(int height) {
        super.setWidth(height);
        super.setHeight(height);
    }
}
