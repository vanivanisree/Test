package com.Example.StudentController;

import java.util.List;

import com.Example.StudentModel.Student;
import com.Example.StudentRepository.StudentRepository;
import com.Example.StudentService.StudentService;
	public class StudentContoller {
	    private StudentRepository studentrepository;
	    private StudentService studentService;
	    @GetMapping("/")
		public String getAllstudent(Student model) {
			List<Student> empsList = studentService.showAllstudent();
			model.addAttribute("studentlist", studentsList);
			return "index";
		}
	    
		@GetMapping("/{id}")
		public String getEmp(@PathVariable("id") int id,Student model) {
			Student stu = StudentService.showstudentById(id);
			model.addAttribute("s", stu);
			return "displaystudent";
		}
}

