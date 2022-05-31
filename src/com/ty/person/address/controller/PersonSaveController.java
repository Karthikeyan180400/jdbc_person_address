package com.ty.person.address.controller;

import java.util.ArrayList;

import com.ty.person.address.cao.PersonDao;
import com.ty.person.address.cto.PersonDto;

public class PersonSaveController {

	public static void main(String[] args) {
		ArrayList<PersonDto> list = new ArrayList<PersonDto>();

		PersonDto dto1 = new PersonDto();
		dto1.setPid(1);
		dto1.setName("Karthi");
		dto1.setEmail("karthi@mail.com");
		dto1.setPhone("111111");

		list.add(dto1);

		PersonDto dto2 = new PersonDto();
		dto2.setPid(2);
		dto2.setName("Abhijit");
		dto2.setEmail("abi@mail.com");
		dto2.setPhone("222222");

		list.add(dto2);

		PersonDto dto3 = new PersonDto();
		dto3.setPid(3);
		dto3.setName("Peter");
		dto3.setEmail("peter@mail.com");
		dto3.setPhone("333333");

		list.add(dto3);

		PersonDao personDao = new PersonDao();

		int[] res = personDao.savePerson(list);

		if (res != null)
			System.out.println("Inserted");
		else
			System.out.println("not inserted");

	}

}
