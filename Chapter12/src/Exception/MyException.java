package Exception;

//自定义异常
public class MyException extends RuntimeException {
    public static void main(String[] args) {
        throw new MyException_();
    }

    static class MyException_ extends RuntimeException {
        public int a = 1;

        public MyException_() {
            super("*** _MyException_ ***");
        }
    }
}
