package kg.itacademy.examspr.service;

import kg.itacademy.examspr.entity.Client;

import java.util.List;

public interface ClientService {
    Client create(Client client);
    Client getById(Long id);
    List<Client> getAll();
}
