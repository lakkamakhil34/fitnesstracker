package com.vcube.fitnesstracker.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.vcube.fitnesstracker.Repo.ExerciseRepo;
import com.vcube.fitnesstracker.model.Exercise;

@RestController
@RequestMapping("/exercise")
public class ExerciseController {

	@Autowired
	   ExerciseRepo exerciseRepo;
	 @GetMapping("/test")
	    public String test() {
	        return "Exercise Controller is Working!";
	    }

	    @PostMapping("/create")
	    @ResponseStatus(HttpStatus.CREATED)
	    public Exercise createData(@RequestBody Exercise exercise) {
	        return exerciseRepo.save(exercise);
	    }
	    
	    @GetMapping("/getAllexercises")
	    public List<Exercise> getAllExercises() {
	    	return exerciseRepo.findAll();
	    }

	    @GetMapping("/{id}")
	    public Exercise getExerciseById(@PathVariable Long id) {
	    	return exerciseRepo.findById(id).orElse(null);
	    }

	    @PutMapping("/{id}")
	    public Exercise updateExercise(
	            @PathVariable Long id,
	            @RequestBody Exercise exercise) {
	    	
	    	Exercise existing = exerciseRepo.findById(id).orElse(null);

	        if (existing != null) {
	            existing.setName(exercise.getName());
	            existing.setMuscleGroup(exercise.getMuscleGroup());
	            existing.setEquipment(exercise.getEquipment());
	            existing.setDescription(exercise.getDescription());
	            
	    	return exerciseRepo.save(existing);
	    }
	        return null;
	 }

	    @DeleteMapping("/{id}")
	    @ResponseStatus(HttpStatus.NO_CONTENT)
	    public String deleteExercise(@PathVariable Long id) {

	        if (exerciseRepo.existsById(id)) {
	            exerciseRepo.deleteById(id);
	            return "Exercise deleted successfully";
	        }

	        return "Exercise not found";
	    }
		
	
	
}
