package com.zwt.charsjavaee.b_database.b6_mybatis.b6_8_annotation.multi_to_multi_cast;

import com.zwt.charsjavaee.b_database.b6_mybatis.b6_7_relation.bean.Course;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CourseCast {
    //Check the selected course by pupil id
    @Select("SELECT course.id,course.name from pup_course, course WHERE pup_course.course_id = course.id AND pup_course.pupil_id=#{id}; ")
    List<Course> checkById(Integer id);
}
