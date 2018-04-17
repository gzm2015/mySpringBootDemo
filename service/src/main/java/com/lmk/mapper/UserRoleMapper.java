package com.lmk.mapper;

import com.lmk.user.Users;

/**
 * Created by LiuMengKe on 2018/4/12.
 */
public interface UserRoleMapper {
    Users selectUserRoleByUserId(String id);
}
