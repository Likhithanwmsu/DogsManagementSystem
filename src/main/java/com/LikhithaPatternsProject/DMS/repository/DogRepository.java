package com.LikhithaPatternsProject.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.LikhithaPatternsProject.DMS.Models.Dog;

/**
 * @author S561368 Likhitha Maheswari Chebrolu
 */
public interface DogRepository extends CrudRepository<Dog, Integer> {

	List<Dog> findByName(String name);
}
