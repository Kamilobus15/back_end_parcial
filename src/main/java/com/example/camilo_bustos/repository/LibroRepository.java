package com.example.camilo_bustos.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.camilo_bustos.model.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro,Long>{


    
}
