import java.util.List;
import java.util.Scanner;

import entities.Addresse;
import entities.Client;
import services.AddresseServices;
import services.ClientServices;

public class App {
    public static void main(String[] args) throws Exception {
        int choix;
        Scanner sc=new Scanner(System.in);

    
        ClientServices ClientService=new ClientServices();
        AddresseServices AddresseServices=new AddresseServices();
       
        do { 
            System.out.println("1-Creer un  Client");
            System.out.println("2-Lister Toutes les Clients"); 
            System.out.println("3-Ajouter une adresse et lui associe un client");
            System.out.println("4-Lister les adresse en affichant le nom du client "); 
            System.out.println("5-Quitter"); 
             choix=sc.nextInt();
             sc.nextLine();
            switch (choix) {
                case 1:
             System.out.println("Entrer le Telephone");
             telephone=sc.nextLine();
             String nom,prenom;
             Client client= ClientServices.rechercherClientParTel(telephone);
    
             if (client!=null) {
                  System.out.println("Ce numero de Telephone existe deja");
             } else {
                 System.out.println("Entrer un Nom");
                 nom=sc.nextLine(); 
                 client=new Client();
                 client.setNomComplet(nom);
                 client.setTelephone(telephone);
                 ClientServices.ajouterClient(client);
             }
             break;
             case 2:
                  List<Client> clients= ClientServices.listerClient();
                   for (Client cl: clients) {
                     System.out.println("nomComplet "+ cl.getNomComplet());
                     System.out.println("Telephone "+cl.getTelephone() );
                     System.out.println("Email "+cl.getEmail() );
                     System.out.println("=================================");
               }
                    break;
                    case 3:
                     System.out.println("Entrer une ville");
                     String numero=sc.nextLine(); 
                     System.out.println("Entrer un quartier");
                     String tel=sc.nextLine();  
                     System.out.println("Entrer un numero pour la ville");
                     String adresse=sc.nextLine();  
                     Addresse ad=new Addresse();
                       ad.setNumVilla(numVilla);
                       ad.setQuartier(quartier);
                       ad.setEmail(email);
                    AddresseServices.ajouterAddresse(ad);
                    break;
                }
                case 4:
                List<Addresse> addresses= AddresseServices.listerAddresses();
                for (Addresse addresse: addresses) {
                  System.out.println("numVilla "+ addresse.getNumVilla());
                  System.out.println("Telephone "+addresse.getQuartier() );
                  System.out.println("Email "+addresse.getVille() );
                  System.out.println("=================================");
               break;
                 
    }

}



