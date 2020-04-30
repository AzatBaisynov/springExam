package kg.itacademy.examspr.service;

import kg.itacademy.examspr.entity.Cinema;

import java.util.List;

public interface CinemaService {
    Cinema create(Cinema cinema);
    Cinema getById(Long id);
    List<Cinema> getAll();
}
