package com.cjc.CJCkarve.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.CJCkarve.Model.Student;
@RestController
public class HomeController 
{
	@RequestMapping("/getProd")
	public List getProduceData()
	{
		Student s= new Student();
		List <Student>al= new ArrayList();
		s.setRollno(1);
		s.setName("jai");
		s.setUname("jadhav");
		s.setPass("jai");
		
		al.add(s);
		

		Student s1= new Student();
	
		s1.setRollno(4);
		s1.setName("jai");
		s1.setUname("jadhav");
		s1.setPass("jai");
		
		al.add(s1);
	List<Student>firstclass=new ArrayList<Student>();
	for(Student ss:al)
	{
		if(ss.getRollno()>=2)
		{
			firstclass.add(ss);
		}
	}
	
		return firstclass;

}
}