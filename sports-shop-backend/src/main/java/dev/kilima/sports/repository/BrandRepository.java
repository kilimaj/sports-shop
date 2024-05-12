package dev.kilima.sports.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.kilima.sports.entity.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer>{

}
