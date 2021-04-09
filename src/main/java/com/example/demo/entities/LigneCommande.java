package com.example.demo.entities;

import lombok.*;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Setter
@Getter
@AllArgsConstructor
@ToString
public class LigneCommande implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ligne_commande_id")
    private Long id;


    @Column(name = "ligne_dateCommande")
    private Date dateCommande;


    @Column(name = "ligne_referenceArticle")
    private String referenceArticle;


    @Column(name = "article")
    private String article;


    @Column(name = "quantite")
    private int quantite;


    @Column(name = "ligne_statut")
    private String statut;


    @Column(name = "prixFournisseur")
    private float prixFournisseur;

    @Column(name = "prixClient")
    private float prixClient;

    //entre ligneCommande et commande
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "commande_Id")
    private Commande commande;

    //entre ligneCommande et fournisseur
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "idFournisseur")
    private Fournisseur fournisseur;


    public LigneCommande() {

    }
}

