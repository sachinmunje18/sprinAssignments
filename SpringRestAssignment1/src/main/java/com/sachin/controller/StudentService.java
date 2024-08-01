package com.sachin.controller;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final List<Student> students = new ArrayList<>();

    public List<Student> getAllStudents() {
        return students;
    }

    public Student getStudentById(Long studentId) {
        return students.stream().filter(student -> student.getId().equals(studentId)).findFirst().orElse(null);
    }

    public Student createStudent(Student student) {
        students.add(student);
        return student;
    }

    public Student updateStudent(Long studentId, Student updatedStudent) {
        Optional<Student> existingStudent = students.stream().filter(student -> student.getId().equals(studentId)).findFirst();
        if (existingStudent.isPresent()) {
            Student student = existingStudent.get();
            student.setName(updatedStudent.getName());
            student.setStream(updatedStudent.getStream());
            student.setMarks(updatedStudent.getMarks());
            return student;
        }
        return null;
    }

    public void deleteStudent(Long studentId) {
        students.removeIf(student -> student.getId().equals(studentId));
    }
}
