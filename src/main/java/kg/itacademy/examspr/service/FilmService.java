package kg.itacademy.examspr.service;

import kg.itacademy.examspr.entity.Film;

import java.util.List;

public interface FilmService {
    Film create(Film film);
    Film findById(Long id);
    List<Film> getAll();
}
