package pres;

import metier.Imetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author med20
 **/
public class PresWithSpringXml {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        //Imetier metier = (Imetier) context.getBean("metier");// return Object
        Imetier metier = context.getBean(Imetier.class);// return Un Object qui implement cette interface, s'il trouve plusieur, il return exception


        System.out.println(metier.calcule());

    }
}
