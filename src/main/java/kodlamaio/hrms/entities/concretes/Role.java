package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="roles")
public class Role {
	@Id
	@GeneratedValue
	@Column(name="role_id")
	private int id;
	
	@Column(name="role_name")
	private String roleName;
}
