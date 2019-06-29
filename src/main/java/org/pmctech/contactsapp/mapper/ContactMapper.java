package org.pmctech.contactsapp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.pmctech.contactsapp.models.Contact;

@Mapper
public interface ContactMapper {

	/**
	 * Method to Return all contacts
	 * 
	 * @return
	 */
	@Select("select * from contact")
	List<Contact> getAllContacts();

	@Insert("insert into contact values(#{id},#{firstname},#{lastname},#{phoneno},#{email})")
	int addNewContact(Contact contact);
}
