package Interface;

public class Interface03 {
    public static void main(String[] args) {
        MysqlDB mysqlDB = new MysqlDB();
        OracleDB oracleDB = new OracleDB();
        DBManager dbManager = new DBManager();
        dbManager.TestDB(mysqlDB);
        dbManager.TestDB(oracleDB);

        // testDB(mysqlDB);
        // testDB(oracleDB);

    }

    // public static void testDB(DBinterface db){
    // db.connect();
    // db.close();
    // }

}
