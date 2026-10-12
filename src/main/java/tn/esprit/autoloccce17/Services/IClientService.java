package tn.esprit.autoloccce17.Services;

import tn.esprit.autoloccce17.Entities.Agence;
import tn.esprit.autoloccce17.Entities.Client;

import java.util.List;

public interface IClientService {

    Client addClient(Client client);
    void deleteClient(Client client);
    List<Client> FindAllClients();
    Client UpdateClient(Client client);

}
