package com.lmk.mapper;

import com.lmk.user.Department;
import com.lmk.user.DepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DepartmentMapper {
    
    long countByExample(DepartmentExample example);

    int deleteByExample(DepartmentExample example);

    int deleteByPrimaryKey(String id);

    int insert(Department record);

    int insertSelective(Department record);

    List<Department> selectByExample(DepartmentExample example);

    Department selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Department record, @Param("example") DepartmentExample example);

    int updateByExample(@Param("record") Department record, @Param("example") DepartmentExample example);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
}