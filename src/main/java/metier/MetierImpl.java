package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MetierImpl implements IMetier {

    @Autowired
    @Qualifier("vws")
    private IDao dao;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }
    public MetierImpl() {
        // Constructeur par défaut
    }

    @Override
    public double calcul() {
        double data = dao.getData();
        double res = data*2;
        return res;
    }


    public void setDao(IDao dao) {
        this.dao = dao;
    }
}