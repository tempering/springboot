package com.example.Mapper;

import com.example.domain.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    @Insert("insert into student (stuSno,stuSname,stuPassword) values (#{stuSno},#{stuSname},#{stuPassword})")
    public void save(Student student);
}
