package com.example.demo.reto4doctors.Service;

import com.example.demo.reto4doctors.Repository.DoctorRepository;
import com.example.demo.reto4doctors.model.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;

    public List<Doctor> getAll(){
        return doctorRepository.getAll();
    }

    public Optional<Doctor> getDoctor(int doctorId) {
        return doctorRepository.getDoctor(doctorId);
    }

    public Doctor save(Doctor doctor){
        if(doctor.getId()==null){
            return doctorRepository.save(doctor);
        }else{
            Optional<Doctor>e= doctorRepository.getDoctor(doctor.getId());
            if(e.isEmpty()){
                return doctorRepository.save(doctor);
            }else{
                return doctor;
            }
        }
    }

    public Doctor update(Doctor doctor){
        if(doctor.getId()!=null){
            Optional<Doctor> e= doctorRepository.getDoctor(doctor.getId());
            if(!e.isEmpty()){
                if(doctor.getName()!=null){
                    e.get().setName(doctor.getName());
                }
                /*if(doctor.getBrand()!=null){
                    e.get().setBrand(machine.getBrand());
                }*/
                if(doctor.getAge()!=null){
                    e.get().setAge(doctor.getAge());
                }
                if(doctor.getDescription()!=null){
                    e.get().setDescription(doctor.getDescription());
                }
                if(doctor.getSpecialty()!=null){
                    e.get().setSpecialty(doctor.getSpecialty());
                }
                doctorRepository.save(e.get());
                return e.get();
            }else{
                return doctor;
            }
        }else{
            return doctor;
        }
    }



    public boolean deleteDoctor (int id){
        Boolean d = getDoctor(id).map(doctor -> {
            doctorRepository.delete(doctor);
            return true;
        }).orElse(false);
        return d;
    }

}
