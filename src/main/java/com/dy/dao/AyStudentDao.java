package com.dy.dao;

import com.dy.model.AyStudent;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author DongDeShuai
 * @Date:2020/5/14 4:38 下午
 */
@Repository
public interface AyStudentDao {
    /**
     * 通过学生id查找学校
     * @param id
     * @return
     */
    public List<AyStudent> findBySchoolId(@Param("id") String id);

    public AyStudent findById(@Param("id") String id);
}
