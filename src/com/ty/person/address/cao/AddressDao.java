package com.ty.person.address.cao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ty.person.address.cto.AddressDto;
import com.ty.person.address.util.ConnectionObject;
import com.ty.person.address.cto.PersonDto;

public class AddressDao {
	Connection connection = null;

	public int[] saveAddress(List<AddressDto> list) {
		String query = "insert into address values(?,?,?,?,?,?)";
		connection = ConnectionObject.getConnection();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			for (AddressDto addressDto : list) {
				preparedStatement.setInt(1, addressDto.getAid());
				preparedStatement.setString(2, addressDto.getStreet());
				preparedStatement.setString(3, addressDto.getDoor_num());
				preparedStatement.setString(4, addressDto.getCity());
				preparedStatement.setLong(5, addressDto.getPinCode());
				preparedStatement.setInt(6, addressDto.getPid());

				preparedStatement.addBatch();
			}
			return preparedStatement.executeBatch();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

	public List<AddressDto> getAddress(String email) {
		connection = ConnectionObject.getConnection();
		String query = "select * from address where pid = (select pid from person where email=?)";

		connection = ConnectionObject.getConnection();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, email);
			//preparedStatement.setInt(2, pid);

			ResultSet resultSet = preparedStatement.executeQuery();
			List<AddressDto> list = new ArrayList<AddressDto>();
			while (resultSet.next()) {
				AddressDto addressDto = new AddressDto();
				addressDto.setAid(resultSet.getInt(1));
				addressDto.setStreet(resultSet.getString(2));
				addressDto.setDoor_num(resultSet.getString(3));
				addressDto.setCity(resultSet.getString(4));
				addressDto.setPinCode(resultSet.getLong(5));
				addressDto.setPid(resultSet.getInt(6));

				list.add(addressDto);

			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

}
