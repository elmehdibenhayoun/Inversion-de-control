package presentation;

import dao.DaoImpl;
import dao.DaoImpl2;
import metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImpl dao=new DaoImpl();
        MetierImpl metier = new MetierImpl(dao);
        metier.setDao(dao);//injesction
        System.out.println("resultat = "+metier.calcul());
    }
}
