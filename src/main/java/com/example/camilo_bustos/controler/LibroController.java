package com.example.camilo_bustos.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.camilo_bustos.repository.LibroRepository;

@RestController
@RequestMapping("/libros")
public class LibroController {
    @Autowired
    private LibroRepository libroRepository;
}
