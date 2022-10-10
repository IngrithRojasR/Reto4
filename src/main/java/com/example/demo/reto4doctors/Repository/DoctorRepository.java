package com.example.demo.reto4doctors.Repository;

import com.example.demo.reto4doctors.Interface.DoctorInterface;
import com.example.demo.reto4doctors.model.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class DoctorRepository {
    @Autowired
    private DoctorInterface doctorCrudRepository;
    public List<Doctor> getAll(){
        return (java.util.List<Doctor>) doctorCrudRepository.findAll();
    }

    public Optional<Doctor> getDoctor(int id){
        return doctorCrudRepository.findById(id);
    }

    public Doctor save(Doctor doctor){
        return doctorCrudRepository.save(doctor);
    }

    public void delete(Doctor doctor){
        doctorCrudRepository.delete(doctor);
    }

}
