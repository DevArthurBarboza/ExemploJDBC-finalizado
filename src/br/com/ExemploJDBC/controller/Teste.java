package br.com.ExemploJDBC.controller;

import java.sql.SQLException;
import br.com.ExemploJDBC.model.*;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.ExemploJDBC.model.Department;

public class Teste {

	public static void main(String[] args) {

		try {

			AbstractCRUD<Department> crudDepartment;
			// ...
			crudDepartment = new CRUDDepartment<Department>();

			System.out.println(crudDepartment.open());
			// INSERT
			Department departmentInsert = new Department();
			departmentInsert.setNameDepartment("DPT. Adm");
			departmentInsert.setBuildingDepartment("Campus Canada");
			departmentInsert.setBudgetDepartment(400.0);

			crudDepartment.create(departmentInsert);
			
			Department departmentInsert2 = new Department();
			departmentInsert2.setNameDepartment("Enfermagem");
			departmentInsert2.setBuildingDepartment("Campus JK");
			departmentInsert2.setBudgetDepartment(1000.0);

			crudDepartment.create(departmentInsert2);
			
//
//			// DELETE
//			crudDepartment.delete(2);
//
//			// UPDATE
//			Department departmentUpdate = new Department();
//			departmentUpdate.setIdDepartment(3);
//			departmentUpdate.setNameDepartment("Departamento Comp");
//			departmentUpdate.setBuildingDepartment("Campus Sede");
//			departmentUpdate.setBudgetDepartment(180000.0);
//
//			crudDepartment.update(departmentUpdate);
//
//			// Select by id
//			Department dep = crudDepartment.getById(2);
//			System.out.println(dep.getNameDepartment());
//
//			ArrayList<Department> departments = crudDepartment.listAll();
//			for (Department d : departments) {
//				System.out.println(d.getNameDepartment());
//			}
//			System.out.println(crudDepartment.close());

			// STUDENT

			AbstractCRUD<Student> crudStudent;
			// ...
			crudStudent = new CRUDStudent<Student>();

			System.out.println(crudStudent.open());
			// INSERT
			Student studentInsert = new Student();
			studentInsert.setName("Rogério");
			studentInsert.setDeptId(1);
			studentInsert.setTotalCredit(18000.0);

			crudStudent.create(studentInsert);
			
			Student studentInsert2 = new Student();
			studentInsert2.setName("Claudio");
			studentInsert2.setDeptId(2);
			studentInsert2.setTotalCredit(3000.0);

			crudStudent.create(studentInsert2);

			// DELETE
			crudStudent.delete(1);

			// UPDATE
			Student studentUpdate = new Student();
			studentUpdate.setIdStudent(2);
			studentUpdate.setName("Joao");
			studentUpdate.setDeptId(3);
			studentUpdate.setTotalCredit(300.0);

			crudStudent.update(studentInsert);

			// Select by id
			Student student = crudStudent.getById(2);
			System.out.println(student.getName());

			ArrayList<Student> students = crudStudent.listAll();
			for (Student s : students) {
				System.out.println(s.getName());
			}
			System.out.println(crudStudent.close());

			// COURSE

			AbstractCRUD<Course> crudCourse;
			// ...
			crudCourse = new CRUDCourse<Course>();

			System.out.println(crudCourse.open());
			// INSERT
			Course courseInsert = new Course();
			courseInsert.setTitle("ADM");
			courseInsert.setDeptId(1);
			courseInsert.setCredit(180.0);

			crudCourse.create(courseInsert);
			
			
			Course courseInsert2 = new Course();
			courseInsert2.setTitle("ED Física");
			courseInsert2.setDeptId(1);
			courseInsert2.setCredit(2380.0);

			crudCourse.create(courseInsert2);

			// DELETE
			crudCourse.delete(1);

			// UPDATE
			Course courseUpdate = new Course();
			courseUpdate.setIdCourse(2);
			courseUpdate.setTitle("CC");
			courseUpdate.setDeptId(2);
			courseUpdate.setCredit(280.0);

			crudCourse.update(courseUpdate);

			// Select by id
			Course course= crudCourse.getById(2);
			System.out.println(course.getTitle());

			ArrayList<Course> courses = crudCourse.listAll();
			for (Course c : courses) {
				System.out.println(c.getTitle());
			}
			System.out.println(crudStudent.close());

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}
}
