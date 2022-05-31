package com.ty.person.address.controller;

import com.ty.person.address.cao.AddressDao;

public class AddressGetController {

	public static void main(String[] args) {
		
		AddressDao addressDao = new AddressDao();
		System.out.println(addressDao.getAddress("karthi@mail.com"));

	}

}
