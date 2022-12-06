package lectures.lecture8.immutabletrees;

public abstract class BT<A> {
    public abstract A elem();
    public abstract BT<A> left();
    public abstract BT<A> right();

    // we use raw type which is in general
    // a bad idea but there's no other way to
    // implement generic singleton
    public static final BT EMPTY = new Empty();

    private static class Empty<B> extends BT<B> {

        @Override
        public B elem() {
            return null;
        }

        @Override
        public BT<B> left() {
            return null;
        }

        @Override
        public BT<B> right() {
            return null;
        }
    }

    private static class Node<A> extends BT<A> {
        private final A elem;
        private final BT<A> left;
        private final BT<A> right;

        private Node(A elem, BT<A> left, BT<A> right){
            this.elem = elem;
            this.left = left;
            this.right = right;
        }


        @Override
        public A elem() {
            return elem;
        }

        @Override
        public BT<A> left() {
            return left;
        }

        @Override
        public BT<A> right() {
            return right;
        }
    }

    /*
    * Trees can only be built using static factory methods because
    * classes are private
    * */

    public static <A> BT<A> empty(){
        return EMPTY;
    }

    public static <A> BT<A> node(A elem, BT<A> left, BT<A> right){
        return new Node<>(elem, left, right);
    }

}
