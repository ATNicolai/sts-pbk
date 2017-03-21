package ro.jademy.pbk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ro.jademy.pbk.dao.ContactDao;
import ro.jademy.pbk.model.Contact;

@Service
public class ContactService {

	@Autowired
	ContactDao contactDao;
	
	
	public List<Contact> getAllContacts(){
		return (List<Contact>) contactDao.findAll();
	}
	
	public void addContact(Contact contact){
		contactDao.save(contact);
	}
	
	
	
}
