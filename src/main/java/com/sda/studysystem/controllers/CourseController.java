package com.sda.studysystem.controllers;

import com.sda.studysystem.services.SchoolService;
import com.sda.studysystem.services.implementations.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;
}
