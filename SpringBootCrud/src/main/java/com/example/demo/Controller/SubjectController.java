package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Bean.Subject;
import com.example.demo.Service.SubjectService;

@RestController
public class SubjectController {
	
	@RequestMapping("/subjects")
	public List<Subject> getAllSubjects()
	{
		return subjectService.getAllSubjects();
	}
	@Autowired
	private SubjectService subjectService ;
	
	@PostMapping("/addsubject")
	public void addSubject(@RequestBody Subject subject)
	{
		subjectService.addSubject(subject);
	}
	@PutMapping("/updatesubject/{id}")
	public void UpdateSubject(@PathVariable String id ,@RequestBody Subject subject)
	{
		subjectService.updateSubject(subject);
	}
	@DeleteMapping("/deletesubjects")
	public void DeleteSubject(@PathVariable String id)
	{
		subjectService.deletesubject(id);
	}
}
