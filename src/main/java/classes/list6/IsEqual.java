package classes.list6;

/* Primitive datatypes in Java are formed inside the Stack,
* whereas the Objects are formed in heap
*
* autoboxing is a process of automatic conversion of a primitive data type
* to an object of the corresponding wrapper class
*
* unboxing happens when an object of a wrapper class is converted to it's
* corresponding primitive type
*
* https://docs.oracle.com/javase/specs/jls/se8/html/jls-5.html#jls-5.1.7
*
*
*
*  */

public class IsEqual {

    public static boolean isEqual1(int m, int n){return n == m;}
    public static boolean isEqual2(Integer m, Integer n){return n == m;}

    public static void main(String[] args) {
        System.out.println(isEqual1(500, 500));
        System.out.println(isEqual2(2, 2));
        System.out.println(isEqual2(500, 500));
    }

}
