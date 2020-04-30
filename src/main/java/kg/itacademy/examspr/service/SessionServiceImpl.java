package kg.itacademy.examspr.service;

import kg.itacademy.examspr.entity.Session;
import kg.itacademy.examspr.model.SessionModel;
import kg.itacademy.examspr.repository.CinemaRepository;
import kg.itacademy.examspr.repository.FilmRepository;
import kg.itacademy.examspr.repository.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class SessionServiceImpl implements SessionService {
    @Autowired
    private SessionRepository sessionRepository;
    @Autowired
    private FilmRepository filmRepository;
    @Autowired
    private CinemaRepository cinemaRepository;

    @Override
    public SessionModel create(SessionModel request) {
        Session session = new Session();
        session.setIs3D(request.getIs3D());
        session.setDate(request.getDate());
        session.setFilm(filmRepository.getOne(request.getFilmId()));
        session.setCinema(cinemaRepository.getOne(request.getCinemaId()));
        sessionRepository.save(session);
        return request;
    }

    @Override
    public List<Session> findAllByCinemaId(Long id) {
        return sessionRepository.findAllByCinema_Id(id);
    }

    @Override
    public List<Session> findJust3DByCinemaId(Long id) {
        return sessionRepository.findAllByCinema_IdAndIs3DTrue(id);
    }

    @Override
    public List<Session> findAllByCinemaIdAndDate(Long id, LocalDateTime localDateTime) {
        return sessionRepository.findAllByCinema_IdAndDate(id, localDateTime);
    }

    @Override
    public List<Session> findAllByFilmName(String name) {
        return sessionRepository.findAllByFilmNameIgnoringCase(name);
    }
}
