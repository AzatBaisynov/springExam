package kg.itacademy.examspr.service;

import kg.itacademy.examspr.entity.Session;
import kg.itacademy.examspr.model.SessionModel;

import java.time.LocalDateTime;
import java.util.List;

public interface SessionService {
    SessionModel create(SessionModel request);
    List<Session> findAllByCinemaId(Long id);
    List<Session> findJust3DByCinemaId(Long id);
    List<Session> findAllByCinemaIdAndDate(Long id, LocalDateTime localDateTime);
    List<Session> findAllByFilmName(String name);
}
