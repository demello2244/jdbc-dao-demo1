package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Department dp = new Department(1, "Comercial");		
		Seller seller = new Seller(1, "Denise", "denise@gmail.com", new Date(), 2000.0, dp);
		System.out.println(seller);
	}

}
