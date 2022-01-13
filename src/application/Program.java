package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("======= TESTE 1 : Seller findById =======");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n======= TESTE 2 : Seller findByDepartment =======");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department); 
		for (Seller obj: list) {
			System.out.println(obj);
		}
		
		System.out.println("\n======= TESTE 3 : Seller findAll =======");
		list = sellerDao.findAll(); 
		for (Seller obj: list) {
			System.out.println(obj);
		}
		
		
		/*System.out.println("\n======= TESTE 4 : Insert implementation =======");
		Seller newseller = new Seller(null, "Jorge Benjor", "jjjjjj@bbb.com", new Date(), 10000.0, department );
		sellerDao.insert(newseller);
		System.out.println("Inserted!! new ID: "+ newseller.getId() +" Seller name: "+ newseller.getName());*/
		
		System.out.println("\n======= TESTE 5 : Update implementation =======");
		seller = sellerDao.findById(14);
		seller.setName("Ben");
		seller.setEmail("ben@gmail.com");
		sellerDao.update(seller);
		System.out.println("Seller ID: "+ seller.getId()+" Updated!!");
		
		
		System.out.println("\n======= TESTE 6 : Delete implementation =======");
		int id = 23;
		sellerDao.deleteById(id);
		System.out.println("Deleted Id: " + id);
	}

}
