package srp;

// 복합기는 프린트, 스캔, 복사하는 3개의 책임을 가짐.
public class MultiPrinter {

    void print() {
        System.out.println("Printing");
    }

    void scan() {
        System.out.println("Scanning");
    }

    void copy() {
        System.out.println("Copy");
    }
}
