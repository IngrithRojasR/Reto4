package com.example.demo.reto4doctors.Interface;

import com.example.demo.reto4doctors.model.Reservation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface ReservationInterface extends CrudRepository<Reservation, Integer> {

    public List<Reservation> findAllByStatus(String status);
    public List<Reservation> findAllByStarDateAfterAndStarDateBefore(Date dateOne, Date dateTwo);
    @Query("SELECT c.client, COUNT(c.client) FROM Reservation  AS c group by c.client order by COUNT (c.client) DESC")
    public List<Object[]> countTotalReservationByClient();

}
