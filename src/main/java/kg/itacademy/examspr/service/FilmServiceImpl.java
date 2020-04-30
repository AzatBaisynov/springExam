package kg.itacademy.examspr.service;

import kg.itacademy.examspr.entity.Film;
import kg.itacademy.examspr.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FilmServiceImpl implements FilmService {
    @Autowired
    private FilmRepository filmRepository;
    @Override
    public Film create(Film film) {
        return filmRepository.save(film);
    }

    @Override
    public Film findById(Long id) {
        return null;
    }

    @Override
    public List<Film> getAll() {
        return null;
    }
}
