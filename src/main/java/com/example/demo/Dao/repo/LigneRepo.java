package com.example.demo.Dao.repo;

import com.example.demo.entities.LigneCommande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LigneRepo extends JpaRepository<LigneCommande,Long> {
}
