package com.example.demo.entities;

import ch.qos.logback.core.joran.spi.NoAutoStart;

import lombok.*;


import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoAutoStart
@Data
@ToString
public class Commande implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "commande_Id")
    private long id;

    @Column(name = "statutCommande")
    private String statutCommande;

    @Column(name = "prixTotale")
    private float prixTotale;



// lien entre commande et fournisseur
    @ManyToOne(fetch = FetchType.LAZY,cascade =CascadeType.ALL )
    @JoinColumn(name = "idFournisseur")
     private Fournisseur fournisseur ;

    //entre commande client
    @ManyToOne(fetch = FetchType.LAZY,cascade =CascadeType.ALL )
    @JoinColumn(name = "idclient")
    private Client client ;

    public Commande() {

    }
}
