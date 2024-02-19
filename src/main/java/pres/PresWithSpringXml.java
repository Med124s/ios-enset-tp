package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author med20
 **/
public class PresWithSpringXml {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        //IMetier metier = (IMetier) context.getBean("metier");// return Object
        IMetier metier = context.getBean(IMetier.class);// return Un Object qui implement cette interface, s'il trouve plusieur, il return exception
        System.out.println(metier.calcule());
    }
}
