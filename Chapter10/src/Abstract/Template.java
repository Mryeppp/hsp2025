package Abstract;

//模板设计模式
abstract public class Template {
    abstract public void job();

    public void CalculateTime() {
        long start = System.currentTimeMillis();
        job();
        long end = System.currentTimeMillis();
        System.out.println(" 执行时间" + (end - start));
    }
}
