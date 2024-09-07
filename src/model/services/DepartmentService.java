package model.services;

import java.util.ArrayList;
import java.util.List;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

/*
the service class is almost the same for both entity type Data Access object, which is responsible
for managing the data retrieved from the server and organize it into the local computer memory;
 */
public class DepartmentService {

    //note that the data access object is retrieved from the connection that is "got" from the method "createDepartmentDao"; it is similar to the sellerService class, and is the last formater of the retrieved data from the SQL connection before its instantiation on local memory
    private DepartmentDao dao = DaoFactory.createDepartmentDao();

    public List<Department> findAll() {
        return dao.findAll();
    }

    public void saveOrUpdate(Department obj) {
        if (obj.getId() == null) {
            dao.insert(obj);
        } else {
            dao.update(obj);
        }
    }

    public void remove(Department obj) {
        dao.deleteById(obj.getId());
    }

}
