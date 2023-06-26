package com.Example.Student;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test void getStudentByIdTest() {
		String id="2"; 
		Studentservice.getById(id); 
		verify(studentrepository).findById(id); }

}
