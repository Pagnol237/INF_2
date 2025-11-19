package src.main.java.com.pagnol.formation;

import java.util.*;

public class Group <E> {
    List<E> members = new ArrayList<>();
    private String nom;
    private int anneeCreation;

    public Group(String nom, int anneeCreation) {
        this.nom = nom;
        this.anneeCreation = anneeCreation;
    }

    public String toString(){
        return "Liste des membres:\t"+members+"\nNom assocoation:\t"+nom+"\nAnnee de creation:\t"+anneeCreation+"\n----------";
    }
}
