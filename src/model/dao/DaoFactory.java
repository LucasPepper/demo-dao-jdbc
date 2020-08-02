package model.dao;

import model.dao.impl.SellerDaoJDBC;

// Factory: classe auxiliar responsável por instanciar os DAOs// Factory: classe auxiliar responsável por instanciar os DAOs
public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC();
    }
}
