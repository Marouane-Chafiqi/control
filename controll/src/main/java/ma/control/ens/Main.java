package ma.control.ens;

import ma.control.ens.dao.AssuranceFacade;
import ma.control.ens.dao.ClientFacade;
import ma.control.ens.dao.ContratFacade;
import ma.control.ens.entities.Assurance;
import ma.control.ens.entities.Client;
import ma.control.ens.entities.Contrat;
import ma.control.ens.entities.StatutContrat;
import ma.control.ens.util.HibernateUtil;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        ClientFacade clientFacade = new ClientFacade();
        AssuranceFacade assuranceFacade = new AssuranceFacade();
        ContratFacade contratFacade = new ContratFacade();

        Client client = new Client("AB123456", "Alaoui", "Ahmed", "ahmed@mail.com", "0600000000");
        clientFacade.create(client);

        Assurance assurance = new Assurance("Auto", 3500.0, "Tous risques");
        assuranceFacade.create(assurance);

        Contrat contrat = new Contrat(new Date(), new Date(), StatutContrat.ACTIF, client, assurance);
        contratFacade.create(contrat);

        System.out.println("Nombre de clients : " + clientFacade.count());
        System.out.println("Nombre d'assurances : " + assuranceFacade.count());
        for (Contrat c : contratFacade.findAll()) {
            System.out.println(c);
        }

        HibernateUtil.fermer();
    }
}
