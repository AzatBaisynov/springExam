package kg.itacademy.examspr.service;

import kg.itacademy.examspr.entity.Ticket;
import kg.itacademy.examspr.model.TicketModel;
import kg.itacademy.examspr.model.TicketModelUpdate;
import kg.itacademy.examspr.repository.ClientRepository;
import kg.itacademy.examspr.repository.SessionRepository;
import kg.itacademy.examspr.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {
    @Autowired
    private TicketRepository ticketRepository;
    @Autowired
    private SessionRepository sessionRepository;
    @Autowired
    private ClientRepository clientRepository;
    @Override
    public TicketModel create(TicketModel request) {
        Ticket ticket = new Ticket();
        ticket.setSession(sessionRepository.getOne(request.getSessionId()));
        ticket.setClient(clientRepository.getOne(request.getClientId()));
        ticket.setIsBought(request.getIsBought());
        ticket.setPrice(request.getPrice());
        ticket.setSit(request.getSit());
        ticketRepository.save(ticket);
        return request;
    }

    @Override
    public TicketModelUpdate update(TicketModelUpdate request) {
        TicketModel ticketModel = new TicketModel();
        ticketModel.setIsBought(true);
        ticketModel.setClientId(request.getClientId());
        ticketModel.setPrice(request.getPrice());
        ticketModel.setSessionId(request.getSessionId());
        ticketModel.setSit(request.getSit());
        create(ticketModel);
        return request;
    }

    @Override
    public List<Ticket> showAllByCinemaIdAndPassword(Long id, String pass) {
        return ticketRepository.findAllByIsBoughtTrueAndSessionCinemaIdAndSessionCinemaPassword(id, pass);
    }
}
