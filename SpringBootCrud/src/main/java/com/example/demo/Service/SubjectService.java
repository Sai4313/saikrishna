package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Bean.Subject;
import com.example.demo.repository.SubjectRepository;

@Service
public class SubjectService {
	
	@Autowired
	private SubjectRepository subjectrepo;
	
	public List<Subject> getAllSubjects()
	{
		List<Subject> subjects =new ArrayList<>();
		subjectrepo.findAll().forEach(subjects::add);
		return subjects;
	}

	public void addSubject(Subject subject) {
	
		subjectrepo.save(subject);
		
	}
	//save method add subject and update subjects
	public void updateSubject(Subject subject) {
		subjectrepo.save(subject);
	}

	public void deletesubject(String id) {
		subjectrepo.deleteById(id);
	}

	
}
