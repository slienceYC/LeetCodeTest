package thread;

/**
 * @author fyc
 * @date 2021-5-12
 * 顺序打印
 */
public class OrderPrint {

    class Foo {
        public void first() {
            System.out.println("first");
        }

        public void second() {
            System.out.println("second");
        }

        public void third() {
            System.out.println("third");
        }
    }
}
