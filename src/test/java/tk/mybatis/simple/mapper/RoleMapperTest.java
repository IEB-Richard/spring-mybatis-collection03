package tk.mybatis.simple.mapper;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import tk.mybatis.simple.model.SysRole;

public class RoleMapperTest extends BaseMapperTest {
	
	@Test
	public void testSelectAllRoleAndPrivileges() {
		// get sql session
		SqlSession sqlSession = getSqlSession();
		try {
			RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
			List<SysRole> roleList = roleMapper.selectAllRoleAndPrivileges();
			System.out.println(roleList.size());
			
		} finally {
			// Please don't forget to close the session after reach test
			sqlSession.close();
		}
	}
}
