package com.example.demo.Dao.repo;

import com.example.demo.entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandeRepo extends JpaRepository<Commande,Long> {

}
