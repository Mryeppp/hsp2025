package Interface;

public class OracleDB implements DBinterface {

    @Override
    public void connect() {
        System.out.println("Oracel connection success");
    }

    @Override
    public void close() {
        System.out.println("quit Oracle");
    }
}
