package com.sda.studysystem.exceptions;

public class CourseNotFoundException extends Exception {

    public CourseNotFoundException(Long id) {
        super(String.format("The course has not found for id : %d, id"));
    }

}
