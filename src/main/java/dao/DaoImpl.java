package dao;


import org.springframework.stereotype.Repository;

@Repository("dao2") //creation d'un bean: un object: Idao dao2 = new DaoImpl()
public class DaoImpl implements IDao{
    @Override
    public double getData() {
        System.out.println("Version Base de donnée");
        double temp = 17;
        return temp;
    }
}
