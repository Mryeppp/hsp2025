package Interface;

public class Phone implements UsbInterface {
    @Override
    public void start() {
        System.out.println("手机在工作");
    }

    @Override
    public void stop() {
        System.out.println("手机停止工作");
    }
}
