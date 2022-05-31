package com.ty.person.address.controller;

import java.util.ArrayList;

import com.ty.person.address.cao.AddressDao;
import com.ty.person.address.cto.AddressDto;

public class AddressSaveController {

	public static void main(String[] args) {
		ArrayList<AddressDto> list = new ArrayList<AddressDto>();
		AddressDto dto1 = new AddressDto();
		dto1.setAid(10);
		dto1.setStreet("jayanagar 2nd street");
		dto1.setDoor_num("110A");
		dto1.setCity("Bangalore");
		dto1.setPinCode(590067);
		dto1.setPid(1);
		
		list.add(dto1);
		
		AddressDto dto2 = new AddressDto();
		dto2.setAid(11);
		dto2.setStreet("south end 2nd corss");
		dto2.setDoor_num("15/a");
	    dto2.setCity("Chennai");
	    dto2.setPinCode(600025);
	    dto2.setPid(1);
	    
	    list.add(dto2);
	    
	    AddressDto dto3 = new AddressDto();
	    dto3.setAid(13);
	    dto3.setStreet("Gandhi Street");
	    dto3.setDoor_num("112A/4");
	    dto3.setCity("Coimbatore");
	    dto3.setPinCode(567333);
	    dto3.setPid(2);
	    
	    list.add(dto3);
	    
	    AddressDao addressDao = new AddressDao();
	    int[] res = addressDao.saveAddress(list);
	    
	    if(res != null)System.out.println("Inserted");
	    else System.out.println("not inserted");

	}

}
