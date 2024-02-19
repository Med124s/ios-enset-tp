package ext;

import dao.IDao;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version Web Service");
        double temp = 55;
        return temp;
    }
}
