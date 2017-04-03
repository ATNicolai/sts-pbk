package ro.jademy.pbk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ro.jademy.pbk.model.Contact;
import ro.jademy.pbk.service.ContactServiceImpl;

@RestController
@RequestMapping(value="pbk/contacts")
public class ContactController {

	@Autowired
	ContactServiceImpl contactService;
	
	@RequestMapping(value="/list"
			,method=RequestMethod.GET
			,produces="application/json")
	public ResponseEntity<List<Contact>> getAllContacts(){
		List<Contact> contacts = contactService.retrieveContacts();
		return new ResponseEntity<>(contacts,HttpStatus.OK);
	}
	
	@RequestMapping(value="/add", method=RequestMethod.PUT, consumes="application/json" )
	public ResponseEntity<Contact> addContact(@RequestBody Contact contact){
		contactService.createContact(contact);
		return new ResponseEntity<Contact>(contact,HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE )
	public ResponseEntity<Contact> deleteContact(@PathVariable Long id){
		contactService.deleteContact(id);
		return new ResponseEntity<Contact>(HttpStatus.OK);
	}
}
