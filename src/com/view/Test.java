package com.view;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import com.model.Product;
import com.service.ProductService;
import com.service.ProductServiceImpl;

public class Test {
	
	public static void main(String[] args) {
		
		addBtn();
		getAll();
		deleteBtn();
	}
	
	//add product
	static void addBtn() {
		
		ProductService service = new ProductServiceImpl();
		char flag = 'y';
		Scanner  sc = new Scanner(System.in);
		
	  do {	
			Product  p = new Product();
			
			System.out.println("Enter id ");
			p.setId(sc.nextInt());
			
			System.out.println("Enter Name ");
			p.setName(sc.next());
			
			p.setCompany("Apple");
			p.setPrice(250000);
			p.setMdfDate(LocalDate.now());
			p.setExpDate(LocalDate.now().plusYears(5));
			
			service.addProduct(p);
			
			System.out.println("Do you want to add more[y/n]");
			flag = sc.next().charAt(0);
			
	  }while(flag == 'y');
		
	}
	
	//get all products
	static void getAll() {
		
		ProductService service = new ProductServiceImpl();
		List<Product>  plist = service.getAllProducts();
				
		System.out.println(plist);
	}
	
	//delete product
	static void deleteBtn() {
		ProductService  service = new ProductServiceImpl();
		 service.deleteProduct(0);
		 
		 getAll();//get all products after deleted
	}
	
	/*   Simulate following Entities With console base MVC pattern :
	 *    a> Book
	 *    b> Patient
	 */

}
