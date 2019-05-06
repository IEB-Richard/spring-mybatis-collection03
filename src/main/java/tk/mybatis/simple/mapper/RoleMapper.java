package tk.mybatis.simple.mapper;

import java.util.List;

import tk.mybatis.simple.model.SysRole;

public interface RoleMapper {
	
	List<SysRole> selectAllRoleAndPrivileges();
	
}
