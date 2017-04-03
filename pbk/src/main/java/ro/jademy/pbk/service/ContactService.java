package ro.jademy.pbk.service;

import java.util.List;

import ro.jademy.pbk.model.Contact;

public interface ContactService {
	
	Contact createContact(Contact contact);
	
	void deleteContact(Long id);
	
	List<Contact> retrieveContacts ();

}
