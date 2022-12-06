package lectures.lecture8.immutabletrees;

import static lectures.lecture8.immutabletrees.BT.*;

public class TestBT {

    public static void main(String[] args) {

        BT<Integer> tree = node(1, node(2, empty(), node(3, empty(), empty())), empty());
        print(tree);

    }

    private static <A> void helper(BT<A> tree, int height){

        if (tree == BT.empty()) {
            for (int i = 0; i < height; i++){
                System.out.print("...");
            }
            System.out.println("||");
        } else {
            helper(tree.right(), height + 1);

            for (int i = 0; i < height; i++){
                System.out.print("...");
            }
            System.out.println(tree.elem());

            helper(tree.left(), height + 1);
        }

    }

    private static <A> void print(BT<A> tree){
        helper(tree, 0);
    }

}
