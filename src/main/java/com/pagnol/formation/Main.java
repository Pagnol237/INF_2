package src.main.java.com.pagnol.formation;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*
        exercice 1:
        Créer une classe Group avec 1 paramètre
        générique précisant
        – Le type d’entité que contiendra le groupe.
        – Ajouter une propriété members qui est une liste
        d’objets typée par le paramètre global.
        – Ajouter une propriété nom et années de création
        – Définir une méthode toString().
        • Tester la classe Group avec comme entités les
        classe Student et Cours

       */
        Group<Student> assosiation1 = new Group<Student>("mozaique",2024);
        Student user1 = new Student("franck");
        Student user2 = new Student("serena");
        Student user3 = new Student("awa");
        Student user4 = new Student("jean piere");
        Student user5 = new Student("martia");
        assosiation1.members.add(user1);
        assosiation1.members.add(user2);
        assosiation1.members.add(user3);
        assosiation1.members.add(user4);
        assosiation1.members.add(user5);

       System.out.println(assosiation1.toString());




    }
}