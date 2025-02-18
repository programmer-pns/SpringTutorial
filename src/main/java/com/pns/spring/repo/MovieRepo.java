package com.pns.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pns.spring.entity.MovieEntity;

@Repository
public interface MovieRepo extends JpaRepository<MovieEntity, String>{

}
