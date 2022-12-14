package com.sda.studysystem.services.implementations;

import com.sda.studysystem.exceptions.SchoolNotFoundException;
import com.sda.studysystem.exceptions.TeacherNotFoundException;
import com.sda.studysystem.models.School;
import com.sda.studysystem.models.Teacher;
import com.sda.studysystem.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

     @Override
    public void createTeacher(Teacher teacher) {
        teacher.setActive(true);
        teacherRepository.save(teacher);
    }

    public Teacher findTeacherById(Long id) throws TeacherNotFoundException {
        Optional<Teacher> optionalTeacher = teacherRepository.findById(id);

        if(optionalTeacher.isEmpty()) {
            throw new TeacherNotFoundException(id);
        }

        return optionalTeacher.get();
    }


    public List<Teacher> findAllTeachers() {
        return teacherRepository.findAll();
    }



    @Override
    public void updateTeacher(Teacher teacher) throws TeacherNotFoundException {
        if(findTeacherById(teacher.getId()) != null) {
            teacherRepository.saveAndFlush(teacher);
        }
    }

    @Override
    public void deleteTeacherById(Long id) throws TeacherNotFoundException {
        Teacher teacher = findTeacherById(id);
        teacher.setActive(false);
        teacherRepository.saveAndFlush(teacher);
    }

    @Override
    public void restoreTeacherById(Long id) throws TeacherNotFoundException {
        Teacher teacher = findTeacherById(id);
        teacher.setActive(true);
        teacherRepository.saveAndFlush(teacher);
    }


}









