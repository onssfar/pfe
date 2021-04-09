package com.example.demo.entities;


import lombok.*;

import javax.persistence.*;

import com.example.demo.entities.LigneCommande;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@Data
@ToString
public class Fournisseur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idFournisseur")
    private Long idFournisseur;


    @Column(name = "nomFournisseur")
    private String nomFournisseur;

    @Column(name = "prenomFournisseur")
    private String prenomFournisseur;

    @Column(name = "adressemail")
    private String adressemail;

    @Column(name = "telephonePortable")
    private String telephonePortable;

    @Column(name = "postale")
    private String postale;




    public Fournisseur() {

    }

    public Fournisseur(String nomFournisseur, String prenomFournisseur, String adressemail, String telephonePortable, String postale) {
        this.nomFournisseur = nomFournisseur;
        this.prenomFournisseur = prenomFournisseur;
        this.adressemail = adressemail;
        this.telephonePortable = telephonePortable;
        this.postale = postale;
    }


}
