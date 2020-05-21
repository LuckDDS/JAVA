package com.dy.dao;

import com.dy.model.AySchool;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author DongDeShuai
 * @Date:2020/5/14 4:39 下午
 */
@Repository
public interface AySchoolDao {
    /**
     * 通过学生id查找学生学校
     * @param id
     * @return
     */
    public AySchool findById(@Param("id") String id);
    public AySchool findSchool(@Param("id") String id);
}
