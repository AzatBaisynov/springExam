package kg.itacademy.examspr.controller;

import kg.itacademy.examspr.entity.Client;
import kg.itacademy.examspr.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @PostMapping
    public Client create(@RequestBody Client client){
        return clientService.create(client);
    }
}
