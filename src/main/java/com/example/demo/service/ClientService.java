package com.example.demo.service;

import com.example.demo.Dao.repo.ClientRepo;
import com.example.demo.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ClientService {

    @Autowired
    ClientRepo clientRepo;

    public Client findByidClient(Long IdClient) {

        return this.clientRepo.findByIdClient(IdClient);
    }


    public Client findByadressemail(String adressemail){
        return  this.clientRepo.findByAdressemail(adressemail);

    }
    public Client addClient(Client client){
        return  this.clientRepo.save(client);

    }

    public List<Client> findAllClients(){
        return  clientRepo.findAll();
    }
    public Client UpdateClient(Client client){
        return  clientRepo.save(client);
    }



    public void deleteClient(Long IdClient){
        clientRepo.deleteClientByIdClient(IdClient);
    }
}
