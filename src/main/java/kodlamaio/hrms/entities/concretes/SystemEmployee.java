package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="system_employees")
public class SystemEmployee {
	@Id
	@GeneratedValue
	@Column(name="employee_id")
	private int id;
	
	@Column(name="mail")
	private String mail;
	
	@Column(name="password")
	private String password;
}
