package kg.itacademy.examspr.controller;

import kg.itacademy.examspr.entity.Session;
import kg.itacademy.examspr.model.SessionModel;
import kg.itacademy.examspr.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/session")
public class SessionController {
    @Autowired
    private SessionService sessionService;

    @PostMapping
    SessionModel create(@RequestBody SessionModel request) {
        return sessionService.create(request);
    }

    @GetMapping("/byId/{id}")
    List<Session> getAllById(@PathVariable Long id){
        return sessionService.findAllByCinemaId(id);
    }

    @GetMapping("/byId/3d/{id}")
    List<Session> getAllByIdAnd3D(@PathVariable Long id){
        return sessionService.findJust3DByCinemaId(id);
    }

    @GetMapping("/byId/{id}/time/{time}")
    List<Session> getAllByIdAndTime(@PathVariable Long id,
                                    @PathVariable LocalDateTime time){
        return sessionService.findAllByCinemaIdAndDate(id, time);
    }

    @GetMapping("/ByFilm/{name}")
    List<Session> getAllByFilmName(@PathVariable String name){
        return sessionService.findAllByFilmName(name);
    }

}
