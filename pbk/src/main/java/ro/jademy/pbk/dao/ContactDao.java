package ro.jademy.pbk.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import ro.jademy.pbk.model.Contact;

public interface ContactDao extends CrudRepository<Contact, Long> {
	
	
}
