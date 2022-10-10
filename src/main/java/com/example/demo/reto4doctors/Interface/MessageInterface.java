package com.example.demo.reto4doctors.Interface;

import com.example.demo.reto4doctors.model.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageInterface extends CrudRepository<Message,Integer> {
}
