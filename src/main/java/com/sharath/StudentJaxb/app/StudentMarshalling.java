package com.sharath.StudentJaxb.app;

import java.math.BigDecimal;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.sharath.StudentJaxb.Address;
import com.sharath.StudentJaxb.Marks;
import com.sharath.StudentJaxb.Student;

public class StudentMarshalling {

	public static void main(String[] args) throws DatatypeConfigurationException {
		try {

			// File file = new File("C:\\file.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			// StringWriter stringWriter = new StringWriter();
			// jaxbMarshaller.marshal(getEmployee(), stringWriter);
			jaxbMarshaller.marshal(getStudent(), System.out);

		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}

	private static Student getStudent() throws DatatypeConfigurationException {

		GregorianCalendar c = new GregorianCalendar();
		c.setTime(new Date());
		XMLGregorianCalendar joinDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);

		Student student = new Student();
		Marks marks = new Marks();
		marks.setSubject("Java");
		marks.setMarks(95l);
		marks.setMaxMarks(100l);
		student.setStudentId(10001);
		student.setName("Sharath");
		student.getMarks().add(marks);
		Address address = new Address();
		address.setStreet("ABC Street");
		address.setState("TX");
		address.setZipcode(78563);
		address.setType("suhgsgh");
		student.setAddress(address);
		return student;
	}


}
