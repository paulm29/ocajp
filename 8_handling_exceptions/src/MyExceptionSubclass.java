
public class MyExceptionSubclass extends MyException {

    public static void main(String[] args) {
        try {
            throwException();
        }
        catch(MyExceptionSubclass e) {

        }
        catch(MyException e) {
            // this compiles, but is unreachable
        }
    }

    public static void throwException() throws MyExceptionSubclass {
        throw new MyExceptionSubclass();
    }
}
