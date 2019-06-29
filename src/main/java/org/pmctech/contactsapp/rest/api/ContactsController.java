package org.pmctech.contactsapp.rest.api;

import java.util.List;

import org.pmctech.contactsapp.mapper.ContactMapper;
import org.pmctech.contactsapp.models.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contact")
public class ContactsController {

	@Autowired
	ContactMapper contactMapper;
	
	@GetMapping
	public List<Contact> getAllContacts(){
		return contactMapper.getAllContacts();
	}
	@PostMapping
	public ResponseEntity<String> addNewContact(@RequestBody Contact contact){
		boolean isAdded = contactMapper.addNewContact(contact) == 1;
		return ResponseEntity.ok(isAdded?"Added Successfully":"Failed");
	}
}
