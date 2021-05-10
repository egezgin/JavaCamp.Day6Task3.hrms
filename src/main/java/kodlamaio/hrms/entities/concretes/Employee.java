package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employees")
public class Employee {
	@Id
	@GeneratedValue
	@Column(name="employee_id")
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="identity_number")
	private String identityNumber;
	
	@Column(name="year_birth")
	private int yearBirth;
	
	@Column(name="mail")
	private String mail;
	
	@Column(name="password")
	private String password;
	
	@Column(name="enabled")
	private boolean isEnabled;
}
