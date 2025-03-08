package Interface;

public class MysqlDB implements DBinterface {
    @Override
    public void connect() {
        System.out.println("Mysql connection success");
    }

    @Override
    public void close() {
        System.out.println("quit Mysql");
    }
}
