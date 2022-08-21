package chap02;

/**
 * 数据类型转换, 编译器默认的处理行为
 *
 *                  char ->
 * byte -> short -> int -> long
 * float -> double
 * @author m1513
 */
public class DataTypeConversion {

    public static void main(String[] args) {
        byte b = 3;
        b(b);
    }

//    public static void b(byte b) {
//        System.out.println("bbbbbbbbb");
//    }

//    public static void b(short s) {
//        System.out.println("sssss");
//    }

    public static void b(char c) {
        System.out.println("ccccccc");
    }

    public static void b(int i) {
        System.out.println("iiiiiiiii");
    }
}
