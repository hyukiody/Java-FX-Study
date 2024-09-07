package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

/*
since an interface cant be instantiated, it can be implemented in another class and this other class can be
grouped with others that use the same method into a Factory type class; hence the interface ObjectTypeDAO return type method below;
these methods return the instantiations of the databank type classes that are retrieved with the methods declared on the DAO interfaces;
Similar to what is commented at the DepartmentDaoJDBC.java file (which is the intermediate layer of this design pattern), this DaoFactory is
the last stop before the implementation of the service which then is simply called onto the Controller type classes of the JavaFX App
 */
public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }

    public static DepartmentDao createDepartmentDao() {
        return new DepartmentDaoJDBC(DB.getConnection());
    }
}
