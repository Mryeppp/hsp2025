package Abstract;

public class BB extends Template {
    @Override
    public void job() {
        for (int i = 1; i <= 8000000; i++) {
            long num = 0;
            num += i;
        }
    }
}