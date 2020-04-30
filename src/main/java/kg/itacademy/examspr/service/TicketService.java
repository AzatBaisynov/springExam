package kg.itacademy.examspr.service;

import kg.itacademy.examspr.entity.Ticket;
import kg.itacademy.examspr.model.TicketModel;
import kg.itacademy.examspr.model.TicketModelUpdate;

import java.util.List;

public interface TicketService {
    TicketModel create(TicketModel ticketModel);
    TicketModelUpdate update(TicketModelUpdate request);
    List<Ticket> showAllByCinemaIdAndPassword(Long id, String pass);
}
