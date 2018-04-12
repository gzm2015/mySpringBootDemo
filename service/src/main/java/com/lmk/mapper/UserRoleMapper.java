package com.lmk.mapper;

import com.lmk.user.User;

/**
 * Created by LiuMengKe on 2018/4/12.
 */
public interface UserRoleMapper {
    User selectUserRoleByUserId(String id);
}
