package Main;

import Bean.Shipment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class UpdateShipment {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("BlueDart");
        EntityManager em=emf.createEntityManager();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Update Id");
        int id=sc.nextInt();

        System.out.println("Enter new Content");
        String content=sc.next();

        System.out.println("Enter new Weight");
        double weight=sc.nextDouble();

        System.out.println("Enter Recipient Address");
        String re_add=sc.nextLine();


        em.getTransaction().begin();
        Shipment bd=em.find(Shipment.class,id);
        bd.setContent(content);
        bd.setWeight(weight);
        bd.setRecipientAddress(re_add);
        em.getTransaction().commit();
        em.close();
        System.out.println("Data updated successfully");


    }
}
