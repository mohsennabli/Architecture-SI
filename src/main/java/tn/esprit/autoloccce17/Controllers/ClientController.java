package tn.esprit.autoloccce17.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloccce17.Entities.Client;
import tn.esprit.autoloccce17.Services.IClientService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Clients")
public class ClientController {

    private IClientService clientService;

    @PostMapping("/addClient")
    public Client addClient(@RequestBody Client client) {
        return clientService.addClient(client);
    }

    @PutMapping("/updateClient")
    public Client updateClient(@RequestBody Client client) {
        return clientService.UpdateClient(client);
    }

    @DeleteMapping("/deleteClient")
    public void deleteClient(@RequestBody Client client) {
        clientService.deleteClient(client);
    }

    @GetMapping("/allClients")
    public List<Client> findAllClients() {
        return clientService.FindAllClients();
    }
}
