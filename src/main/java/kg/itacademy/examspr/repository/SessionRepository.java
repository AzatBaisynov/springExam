package kg.itacademy.examspr.repository;

import kg.itacademy.examspr.entity.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.rmi.registry.LocateRegistry;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface SessionRepository extends JpaRepository<Session, Long> {
    List<Session> findAllByCinema_Id(Long id);
    List<Session> findAllByCinema_IdAndIs3DTrue(Long id);
    List<Session> findAllByCinema_IdAndDate(Long id, LocalDateTime localDateTime);
    List<Session> findAllByFilmNameIgnoringCase(String name);
}
