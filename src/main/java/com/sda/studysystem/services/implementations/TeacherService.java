package com.sda.studysystem.services.implementations;

import com.sda.studysystem.exceptions.SchoolNotFoundException;
import com.sda.studysystem.exceptions.TeacherNotFoundException;
import com.sda.studysystem.models.School;
import com.sda.studysystem.models.Teacher;

import java.util.List;

public interface TeacherService {

    void createTeacher(Teacher teacher);

    Teacher findTeacherById(Long id) throws TeacherNotFoundException;

    List<Teacher> findAllTeachers();

    void updateTeacher(Teacher teacher) throws TeacherNotFoundException;

    void deleteTeacherById(Long id) throws TeacherNotFoundException;

    void restoreTeacherById(Long id) throws TeacherNotFoundException;
}
