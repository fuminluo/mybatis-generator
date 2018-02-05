package com.mybatis.mapper;

import com.mybatis.model.ApplicationUser;

public interface ApplicationUserMapper {
    int insert(ApplicationUser record);

    int insertSelective(ApplicationUser record);
}