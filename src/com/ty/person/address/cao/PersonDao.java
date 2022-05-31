package com.ty.person.address.cao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.ty.person.address.cto.PersonDto;
import com.ty.person.address.util.ConnectionObject;

public class PersonDao {
	Connection connection = null;

	public int[] savePerson(List<PersonDto> list) {
		String query = "insert into person values(?,?,?,?)";
		connection = ConnectionObject.getConnection();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			for (PersonDto personDto : list) {
				preparedStatement.setInt(1, personDto.getPid());
				preparedStatement.setString(2, personDto.getName());
				preparedStatement.setString(3, personDto.getEmail());
				preparedStatement.setString(4, personDto.getPhone());
				
				preparedStatement.addBatch();
			}

			return preparedStatement.executeBatch();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

}
