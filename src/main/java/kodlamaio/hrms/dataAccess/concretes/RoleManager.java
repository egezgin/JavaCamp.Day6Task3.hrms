package kodlamaio.hrms.dataAccess.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.RoleService;
import kodlamaio.hrms.dataAccess.abstracts.RoleDao;
import kodlamaio.hrms.entities.concretes.Role;

@Service
public class RoleManager implements RoleService {
	private RoleDao roleDao;
	
	@Autowired
	public RoleManager(RoleDao roleDao) {
		super();
		this.roleDao = roleDao;
	}

	@Override
	public List<Role> getAll() { 
		return this.roleDao.findAll();
	}

}
