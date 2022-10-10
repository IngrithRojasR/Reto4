package com.example.demo.reto4doctors.Interface;

import com.example.demo.reto4doctors.model.Doctor;
import org.springframework.data.repository.CrudRepository;

public interface DoctorInterface extends CrudRepository<Doctor, Integer> {
}
