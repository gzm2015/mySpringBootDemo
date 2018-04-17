package com.lmk;


import com.lmk.mapper.DepartmentMapper;
import com.lmk.mapper.UserRoleMapper;
import com.lmk.user.Department;
import com.lmk.user.DepartmentExample;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = WebApplication.class)
public class WebApplicationTests {



	@Autowired
	UserRoleMapper userRoleMapper;

	@Autowired
	DepartmentMapper departmentMapper;


	@Test
	public void testDepartment() {
		DepartmentExample departmentExample = new DepartmentExample();
		departmentExample.createCriteria().andDepartmentNameEqualTo("yajun");
		List<Department> departments = departmentMapper.selectByExample(departmentExample);
		Assert.assertTrue(departments.size()>0);
	}


}
