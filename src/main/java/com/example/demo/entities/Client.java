package com.example.demo.entities;

import lombok.*;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@AllArgsConstructor
@Setter
@Getter
@Data
@ToString
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idClient")
    private Long idClient;

    @Column(name = "nomClient")
    private String nomClient;

    @Column(name = "prenomClient")
    private String prenomClient;

    @Column(name = "telephonePortable")
    private int telephonePortable;

    @Column(name = "adressemail")
    private String adressemail;

    @Column(name = "categorie")
    private String categorie;

    @Column(name = "postale")
    private String postale;

    //Entre client fournisseur
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "idFournisseur")
    private Fournisseur fournisseur;

    //entre client et commande
   // @OneToMany(mappedBy = "client", fetch = FetchType.EAGER)
   // private List<Commande> commande_cl = new ArrayList<>();

    public Client() {

    }

    public Client(String nomClient, String prenomClient, int telephonePortable, String adressemail, String categorie, String postale) {
        this.nomClient = nomClient;
        this.prenomClient = prenomClient;
        this.telephonePortable = telephonePortable;
        this.adressemail = adressemail;
        this.categorie = categorie;
        this.postale = postale;
    }


}
