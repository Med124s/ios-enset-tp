package ext;

import dao.IDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class DaoImpV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version Web Service");
        double temp = 55;
        return temp;
    }
}
