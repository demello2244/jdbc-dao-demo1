package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao department = DaoFactory.createDepartmentDao();
		
		System.out.println("\n======= TESTE 1 : Department findById =======");
		Department dp = department.findById(4);
		System.out.println(dp);
		
		System.out.println("\n======= TESTE 2 : Department findAll =======");
		List<Department> list = new ArrayList<>();
		list = department.findAll();
		for(Department obj: list) {
			System.out.println(obj);
		}
		
		System.out.println("\n======= TESTE 3 : Department insert =======");
		Department dp1 = new Department(null, "Almoxarifado");
		department.insert(dp1);
		System.out.println("Insert Department: "+dp1.getId()+" - "+dp1.getName());
		
		System.out.println("\n======= TESTE 4 : Department Update =======");
		Department dp2  = department.findById(5);
		dp2.setName("Compras");
		department.update(dp2);
		System.out.println("Departmento Id: "+ dp2.getId()+" upadated!!");
		
		
		System.out.println("\n======= TESTE 5 : Department Delete =======");
		int id =9;
		department.deleteById(id);
		System.out.println("Departmento ID: "+ id +" deleted!!!!");
	}

}
