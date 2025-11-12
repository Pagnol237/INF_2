package src.main.java.com.pagnol.formation;

import src.Etudiant;
import src.MessagePrinter;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        MessagePrinter afficheMessage = (String msg)->{
           return msg;
        };
        System.out.println(afficheMessage.printMsg("bonjour le monde"));

            /*
    Exercice 1 — Transformation et filtrage

    Tu disposes d’une liste de prénoms :

    List<String> noms = List.of("jean", "marie", "luc", "julie", "marc", "aline");


    Consignes :

    Crée un stream à partir de cette liste.

    Garde uniquement les prénoms de plus de 4 lettres.

    Transforme ces prénoms pour que la première lettre soit en majuscule.

    Affiche le résultat final avec forEach.

    (Utilise au moins une lambda et une méthode de référence.)
        */
        List<String> noms = new List<>("jean", "marie", "luc", "julie", "marc", "aline");
        System.out.println("solution exercice");

        noms.stream()
                .filter(nom->nom.length()>4)
                .map(nom->nom.substring(0,1).toUpperCase()+nom.substring(1))
                .forEach(System.out::println);

        //creation d'etudiant

        Etudiant student1 = new Etudiant("austine","river",18);
        Etudiant student2 = new Etudiant("pagnol","franck",28);
        Etudiant student3 = new Etudiant("yves","dhalia",18);
        Etudiant student4 = new Etudiant("urelle","paola",25);













    }
}