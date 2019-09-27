package com.qianfeng.service.impl;

import com.qianfeng.dao.StudentMapper;
import com.qianfeng.entity.Student;
import com.qianfeng.service.IStudentService;
import org.hibernate.validator.internal.metadata.aggregated.rule.ReturnValueMayOnlyBeMarkedOnceAsCascadedPerHierarchyLine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentMapper studentMapper;


    @Override
    public int insertStudent(Student student) {
        return studentMapper.insertStudent(student);
    }
}
