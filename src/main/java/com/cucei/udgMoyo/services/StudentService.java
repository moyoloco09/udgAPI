package com.cucei.udgMoyo.services;

import com.cucei.udgMoyo.models.StudentModel;
import com.cucei.udgMoyo.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    // Create
    public StudentModel saveStudent(StudentModel student){return studentRepository.save(student);}
    //Read
    public List<StudentModel> findAllStudents(){return (List<StudentModel>) studentRepository.findAll();}
    //Find by code
    public Optional<StudentModel> findStudentByCode(String code){return studentRepository.findByCode(code);}
    //Find by name
    public Optional<StudentModel> findStudentByName(String name){return studentRepository.findByName(name);}
    //Delete by code
    public String deleteStudentByCode(String code){
        String response="";
        Optional<StudentModel> foundStudent=findStudentByCode(code);
        if(foundStudent.isPresent()){
            studentRepository.delete(foundStudent.get());
            response="Student deleted seccesfully";
        }
        else{
            response="Student not found";
        }
        return response;
    }
}
