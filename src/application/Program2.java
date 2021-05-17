package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println();
		System.out.println("=== TEST 1: department insert ===");
		Department dep = new Department(null, "Music");
		departmentDao.insert(dep);
		System.out.println("Inserted! New id = " + dep.getId());
		
		System.out.println();
		System.out.println("=== TEST 2: department findById ===");
		Department dep2 = departmentDao.findById(1);
		System.out.println(dep2);
		
		System.out.println();
		System.out.println("=== TEST 3: department update ===");
		dep2 = departmentDao.findById(1);
		dep2.setName("Food");
		departmentDao.update(dep2);
		System.out.println("Update completed");
		
		System.out.println();
		System.out.println("=== TEST 4: department delete ===");
		departmentDao.deleteById(8);
		System.out.println("Delete completed");
		
		System.out.println();
		System.out.println("=== TEST 5: department findAll ===");
		List<Department> list = departmentDao.findAll();
		for(Department dep3 : list) {
			System.out.println(dep3);
		}
		
	}

}
