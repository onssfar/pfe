package com.example.demo.Dao.repo;

import com.example.demo.entities.Client;
import com.example.demo.entities.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface FournisseurRepo extends JpaRepository<Fournisseur,Long> {

}
