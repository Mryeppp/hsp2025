import org.mryep.a.Dao;
import org.mryep.a.User;

import org.junit.jupiter.api.Test;

public class TestHomework {
    @Test
    public void test() {
        Dao<User> dao = new Dao();
        dao.save("001", new User(001,"hh",18));
        dao.save("002", new User(002,"jj",19));
        dao.save("003", new User(003,"kk",20));
        System.out.println(dao.get("001"));
        dao.update("001", new User(004,"ll",21));
        dao.delete("003");
        System.out.println(dao.list());
    }
}
