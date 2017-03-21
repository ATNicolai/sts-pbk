package ro.jademy.pbk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ro.jademy.pbk.model.Contact;
import ro.jademy.pbk.service.ContactService;

@RestController
public class ContactController {

	@Autowired
	ContactService contactService;
	
	@RequestMapping(value="pbk/contacts"
			,method=RequestMethod.GET
			,produces="application/json")
	public ResponseEntity<List<Contact>> getAllContacts(){
		List<Contact> contacts = contactService.getAllContacts();
		return new ResponseEntity<>(contacts,HttpStatus.OK);
	}
	
	
	
	@RequestMapping(value="pbk/contacts", method=RequestMethod.PUT, consumes="application/json" )
	public void addContact(@RequestBody Contact contact){
		contactService.addContact(contact);
	}
}
