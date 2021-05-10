package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employers")
public class Employer {
	@Id
	@GeneratedValue
	@Column(name="employee_id")
	private int id;
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="website")
	private String website;
		
	@Column(name="mail")
	private String mail;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	@Column(name="password")
	private String password;
	
	@Column(name="enabled")
	private boolean isEnabled;
}
