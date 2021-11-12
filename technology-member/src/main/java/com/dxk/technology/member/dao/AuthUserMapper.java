package com.dxk.technology.member.dao;

import com.dxk.technology.member.model.AuthUser;
import com.dxk.technology.member.model.AuthUserExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AuthUserMapper {
    long countByExample(AuthUserExample example);

    int deleteByExample(AuthUserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(AuthUser record);

    int insertSelective(AuthUser record);

    List<AuthUser> selectByExample(AuthUserExample example);

    AuthUser selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") AuthUser record, @Param("example") AuthUserExample example);

    int updateByExample(@Param("record") AuthUser record, @Param("example") AuthUserExample example);

    int updateByPrimaryKeySelective(AuthUser record);

    int updateByPrimaryKey(AuthUser record);
}