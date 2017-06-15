package com.sharath.StudentJaxb.app;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.sharath.StudentJaxb.Student;


public class StudentUnmarshalling {
	public static void main(String[] args) {

	try {
		JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		Student student = (Student) jaxbUnmarshaller.unmarshal(new File("C:/Users/shara/workspace/student.xml"));
		System.out.println(student);
	  } catch (JAXBException e) {
		e.printStackTrace();
	  }
}
}
