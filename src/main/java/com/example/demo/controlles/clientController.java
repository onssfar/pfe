package com.example.demo.controlles;

import com.example.demo.entities.Client;
import com.example.demo.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/client")
public class clientController {
    @Autowired
     ClientService clientService;

    @GetMapping("/all")
    public ResponseEntity<List<Client>> getAllClients(){
        List<Client> clients = clientService.findAllClients();
        return new ResponseEntity<>(clients,HttpStatus.OK);
    }

    @GetMapping("/find/{ idClient}")
    public ResponseEntity <Client> getClient(@PathVariable(" idClient") Long  idClient ){
        Client  client = clientService.findByidClient( idClient);
        return new ResponseEntity<>(client,HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity <Client> addClient(@RequestBody Client client){
        Client newclient = clientService.addClient(client);
        return new ResponseEntity<>(newclient ,HttpStatus.CREATED);}


    @PutMapping("/update")
    public ResponseEntity <Client> updateClient(@RequestBody Client client){
        Client updateClient = clientService.UpdateClient(client);
        return new ResponseEntity<>(updateClient ,HttpStatus.OK);}


    @DeleteMapping("/delete/{id}")
    public ResponseEntity <?> deleteClinet(@PathVariable ("id") Long idClient){
        clientService.deleteClient(idClient);
        return new ResponseEntity<>(HttpStatus.OK);}

    @GetMapping("finde/{adressemail}")
    public ResponseEntity<Client>getClientByemail(@PathVariable("adressemail") String adressemail){
        Client client = clientService.findByadressemail(adressemail);
        return new ResponseEntity<>(client,HttpStatus.OK);
    }
}

