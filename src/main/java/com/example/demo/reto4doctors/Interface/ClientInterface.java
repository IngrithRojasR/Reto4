package com.example.demo.reto4doctors.Interface;

import com.example.demo.reto4doctors.model.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientInterface extends CrudRepository<Client, Integer> {
}
