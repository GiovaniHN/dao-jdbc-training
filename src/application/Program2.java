package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
		
		System.out.println("=====TEST #1: departmentInsert=====");
		Department dep = new Department(8, "Singers");		
		depDao.insert(dep);
		System.out.println("Inserted! New department id: " + dep.getId());
		
		System.out.println("\n=====TEST #2: deleteById=====");
		System.out.println("Enter id to be deleted: ");
		int deleteId = sc.nextInt();
		depDao.deleteById(deleteId);
		System.out.println("Done! Id of department deleted: " + deleteId);
		
		System.out.println("\n=====TEST #3: departmentUpdate=====");
		Department dep2 = new Department(1, "Computers");
		depDao.update(dep2);
		System.out.println("Updated!");
		
		sc.close();
	}
	
}
