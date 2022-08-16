package com.mapper;


import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import com.pojo.User;

public interface UserMapper {
    /**
     * 根据用户名和密码查询用户对象
     */
    //用户登录
    @Select("select * from tb_user where username = #{username} and password = #{password}")
    User select(@Param("username") String username, @Param("password")  String password);
    /**
     * 根据用户名查询用户对象
     */

    @Select("select * from tb_user where username=#{username}")
    User selectByUsername(String username);

    /**
     * 添加用户
     */
@Select("insert into tb_user values(null,#{username},#{password})")
    void  add(User user);
}











































