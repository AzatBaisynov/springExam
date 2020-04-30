package kg.itacademy.examspr.controller;

import kg.itacademy.examspr.entity.Film;
import kg.itacademy.examspr.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/film")
public class FilmController {
    @Autowired
    private FilmService filmService;

    @PostMapping
    public Film create(@RequestBody Film film){
        return filmService.create(film);
    }
}
