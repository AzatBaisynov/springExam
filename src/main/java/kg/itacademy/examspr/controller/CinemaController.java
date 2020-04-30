package kg.itacademy.examspr.controller;

import kg.itacademy.examspr.entity.Cinema;
import kg.itacademy.examspr.service.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cinema")
public class CinemaController {
    @Autowired
    private CinemaService cinemaService;

    @PostMapping
    public Cinema create(@RequestBody Cinema cinema){
        return cinemaService.create(cinema);
    }
}
