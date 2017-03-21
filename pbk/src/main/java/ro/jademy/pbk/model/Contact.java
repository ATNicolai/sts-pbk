package ro.jademy.pbk.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_contact")
public class Contact {

	@Id
	@GeneratedValue
	private long id;
	
	
	private String name;
	
	
	private String phoneNo;

	public Contact(long id, String name, String phoneNo) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNo = phoneNo;
	}
	
	public Contact() {
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", phoneNo=" + phoneNo + "]";
	}
	
}
