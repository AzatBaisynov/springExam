package kg.itacademy.examspr.controller;

import kg.itacademy.examspr.entity.Ticket;
import kg.itacademy.examspr.model.TicketModel;
import kg.itacademy.examspr.model.TicketModelUpdate;
import kg.itacademy.examspr.service.CinemaService;
import kg.itacademy.examspr.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.PostUpdate;
import java.util.List;

@RestController
@RequestMapping("/ticket")
public class TicketController {
    @Autowired
    private TicketService ticketService;

    @PostMapping
    public TicketModel create(@RequestBody TicketModel request){
        return ticketService.create(request);
    }

    @PostUpdate
    public TicketModelUpdate update(@RequestBody TicketModelUpdate request){
        return ticketService.update(request);
    }

    @GetMapping("/{id}/{password}")
    public List<Ticket> getByCinemaIdAndPassword(@PathVariable Long id,
                                                 @PathVariable String password){
        return ticketService.showAllByCinemaIdAndPassword(id, password);
    }
}
