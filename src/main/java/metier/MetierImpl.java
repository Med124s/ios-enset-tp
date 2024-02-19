package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("metier")

public class MetierImpl implements IMetier {
    //@Autowired //Injecte object dao
    private IDao dao2;

    public MetierImpl(@Qualifier("dao2") IDao dao) {
        this.dao2 = dao;
    }
    public void setDao(IDao dao) {
        this.dao2 = dao;
    }
    @Override
    public double calcule() {
        double t = dao2.getData();
        return t * 3;
    }
}
