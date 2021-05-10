package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.RoleService;
import kodlamaio.hrms.entities.concretes.Role;

@RestController
@RequestMapping("/api/roles")
public class RolesController {
	private RoleService roleService;

	@Autowired
	public RolesController(RoleService roleService) {
		super();
		this.roleService = roleService;
	}
	
	@RequestMapping("/getall")
	public List<Role> getAll()
	{
		return this.roleService.getAll();
	}
}
