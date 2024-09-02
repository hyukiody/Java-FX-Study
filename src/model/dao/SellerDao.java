package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

/*
As mentioned in the DepartmentDAOJDBC header commentary, this is the actual interface;
between the Data Access layer and the factory; even though it being only a interface,
it splits the CRUD operations for each of the Entities that are treated by the DAO
objects, avoiding then the need to 
*/

public interface SellerDao {

	void insert(Seller obj);
	void update(Seller obj);
	void deleteById(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();
	List<Seller> findByDepartment(Department department);
}
