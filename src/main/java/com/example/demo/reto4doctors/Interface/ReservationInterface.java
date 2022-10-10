package com.example.demo.reto4doctors.Interface;

import com.example.demo.reto4doctors.model.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationInterface extends CrudRepository<Reservation, Integer> {
}
