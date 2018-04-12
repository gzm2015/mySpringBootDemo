package com.lmk.security;

import com.lmk.mapper.UserMapper;
import com.lmk.mapper.UserRoleMapper;
import com.lmk.user.Roles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 连接我的数据库
 *
 * @author LiuMengKe
 * @create 2018-04-12-10:50
 */
@Service
public class LmkUserDetailService implements UserDetailsService {

    @Autowired
    UserMapper userMapper;
    @Autowired
    UserRoleMapper userRoleMapper;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        com.lmk.user.User user = userMapper.loginByUserName(username);
        if(user == null){
            throw new RuntimeException("未找到");
        } else {
            System.out.println(user.getPassword() + " --pw-- ");
            List<Roles> roles = userRoleMapper.selectUserRoleByUserId(user.getId()).getRoles();
            List<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();
            //写入用户的角色  ***  切记 由于框架原因 角色名称要以 ROLE_ 开头 **** 血泪史 ****
            //源码：org.springframework.security.access.expression.SecurityExpressionRoot hasAnyRole()
            for (Roles role : roles) {
                if (role != null && role.getRolename() != null) {
                    SimpleGrantedAuthority grantedAuthority = new SimpleGrantedAuthority(role.getRoleCode());
                    grantedAuthorities.add(grantedAuthority);
                }
            }
            org.springframework.security.core.userdetails.User uu = new User(username, user.getPassword(), grantedAuthorities);
            return uu;
        }
    }
}
