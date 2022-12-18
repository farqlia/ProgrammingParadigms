package lectures.lecture8.coersion;

public class Overloading {

    /* Method's name along with its parameters list, types and order is called
    * a method signature. Overloading is commonly used to create several methods
    * with the same name which perform similar tasks, but on different data types */
    public static void main(String[] args) {
        add("Hello", 4);
        add(66, "Hello");
        add("Hello");
        add(13);
    }

    public static void add(String str, int i){
        System.out.println(str + i);
    }

    //public static String add(String str, int i){return (str + i);}

    public static void add(int i, String str){
        System.out.println(i + str);
    }

    public static void add(String str){
        System.out.println(str + 1);
    }

    public static void add(int i){
        System.out.println(i + "default");
    }

}
