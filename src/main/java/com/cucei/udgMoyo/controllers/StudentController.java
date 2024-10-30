package com.cucei.udgMoyo.controllers;

import com.cucei.udgMoyo.models.StudentModel;
import com.cucei.udgMoyo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping()
    public StudentModel saveStudent(@RequestBody StudentModel studentModel) {
        return studentService.saveStudent(studentModel);
    }

    @GetMapping()
    public List<StudentModel> getAllStudentsSaved() {
        return studentService.findAllStudents();
    }

    @GetMapping("/findByCode={code}")
    public Optional<StudentModel> getStudentByCode(@PathVariable String code) {
        return studentService.findStudentByCode(code);
    }

    @GetMapping("/findByName={name}")
    public Optional<StudentModel> getStudentByName(@PathVariable String name) {
        return studentService.findStudentByName(name);
    }

    @DeleteMapping("/deleteByCode={code}")
    public String deleteStudentByCode(@PathVariable String code) {
        return studentService.deleteStudentByCode(code);
    }

    @PutMapping()
    public StudentModel updateStudent(@RequestBody StudentModel studentModel) {
        return studentService.saveStudent(studentModel);
    }
}
