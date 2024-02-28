package test;

import entities.Personne;
import Service.PersonneService;
import java.sql.SQLException;

public class Test {
    public static void main (String [] arg) throws SQLException {


        PersonneService ps=new PersonneService();
        Personne p=new Personne("gz","chaima",21,"string","chaima","ezerty","ddd","admin",11111);

         //ps.ajouter(p);

       // System.out.println(ps.recuperer());
        p.setEmail("chaima.gz@esprit.tn");
p.setPassword("123456789");
        System.out.println(ps.login("chaima.gz@esprit.tn","123456789"));

    }}


