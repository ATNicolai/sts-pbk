package ro.jademy.pbk.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import ro.jademy.pbk.dao.ContactDao;
import ro.jademy.pbk.exception.NoSuchContactException;
import ro.jademy.pbk.model.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	ContactDao contactDao;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ContactServiceImpl.class);

	@Override
	public Contact createContact(Contact contact) {
		return contactDao.save(contact);
	}

	@Override
	public void deleteContact(Long id) {
		// catch illegal argument
		try {
			contactDao.delete(id);
		} catch (EmptyResultDataAccessException e) {
			// TODO: handle exception
			String msg = "No such contact with id: "+ id;
			LOGGER.error(msg);
			throw new NoSuchContactException(msg,e);
		}
	}

	@Override
	public List<Contact> retrieveContacts() {
		return (List<Contact>) contactDao.findAll();
	}
	
	
	
}
