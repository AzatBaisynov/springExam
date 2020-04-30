package kg.itacademy.examspr.service;

import kg.itacademy.examspr.entity.Cinema;
import kg.itacademy.examspr.repository.CinemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CinemaServiceImpl implements CinemaService {
    @Autowired
    private CinemaRepository cinemaRepository;

    @Override
    public Cinema create(Cinema cinema) {
        return cinemaRepository.save(cinema);
    }

    @Override
    public Cinema getById(Long id) {
        return null;
    }

    @Override
    public List<Cinema> getAll() {
        return null;
    }
}
