package tn.esprit.autoloccce17.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloccce17.Entities.Client;

import java.util.List;
@Service
@AllArgsConstructor
public class ClientService implements IClientService {

    @Override
    public Client addClient(Client client) {
        return null;
    }

    @Override
    public void deleteClient(Client client) {

    }

    @Override
    public List<Client> FindAllClients() {
        return List.of();
    }

    @Override
    public Client UpdateClient(Client client) {
        return null;
    }
}
