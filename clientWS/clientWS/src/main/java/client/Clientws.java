package client;

import proxy.BanckService;
import proxy.BanckWS;
import proxy.Compte;

import java.util.List;

public class Clientws {
    public static void main(String[] args) {
        BanckService proxy=new BanckWS().getBanckServicePort();
        System.out.println(proxy.conversionEuroToD(2500));
        Compte cpt= proxy.getCompte(3);
        System.out.println("Code = " + cpt.getCode());
        System.out.println("Solde = " +cpt.getSolde());
        System.out.println("Date création = " +cpt.getDateCreation());
        List<Compte> compteLists=proxy.getComptes();
        for(Compte c:compteLists){
            System.out.println("----------------------------------");
            System.out.println("Code = " + c.getCode());
            System.out.println("Solde = " +c.getSolde());
            System.out.println("Date création = " +c.getDateCreation());
        }

    }
}
