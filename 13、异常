class CheckedException extends Exception {}
class CheckedException2 extends Exception {}
class UncheckedException extends RuntimeException {}

public class ExceptionDemo {
    public static void throwCheckedException() throws CheckedException, CheckedException2 {
        if (true) {
            throw new CheckedException();
        } else {
            throw new CheckedException2();
        }
    }

    public static void throwUncheckedException() {
        throw new UncheckedException();
    }

    public static void main(String[] args) throws CheckedException, CheckedException2 {
        throwCheckedException();
    }
}
