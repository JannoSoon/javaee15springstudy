package com.sda.studysystem.exceptions;

public class TeacherNotFoundException extends Exception{

    public TeacherNotFoundException(Long id) {
        super(String.format("Teacher not found for id: %d, id"));
    }
}
