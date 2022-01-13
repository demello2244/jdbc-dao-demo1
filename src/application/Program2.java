package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao department = DaoFactory.createDepartmentDao();
		
		System.out.println("======= TESTE 1 : Seller findById =======");
		Department dp = department.findById(4);
		System.out.println(dp);
		
		
	}

}
