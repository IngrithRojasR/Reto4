package com.example.demo.reto4doctors.Repository;

import com.example.demo.reto4doctors.Interface.SpecialtyInterface;
import com.example.demo.reto4doctors.model.Specialty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class SpecialtyRepository {
    @Autowired
    private SpecialtyInterface specialtyCrudRepository;
    public List<Specialty> getAll(){
        return (List<Specialty>) specialtyCrudRepository.findAll();
    }

    public Optional<Specialty> getSpecialty(int id){
        return specialtyCrudRepository.findById(id);
    }

    public Specialty save(Specialty specialty){
        return specialtyCrudRepository.save(specialty);
    }

    public void delete(Specialty category){
        specialtyCrudRepository.delete(category);
    }

}
