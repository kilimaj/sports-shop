package dev.kilima.sports.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.kilima.sports.entity.Type;

@Repository
public interface TypeRepository extends JpaRepository<Type, Integer>{

}
