package Main;

import Bean.Shipment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.Timestamp;
import java.util.Date;

public class SaveData {
//    Create a new Shipment
public static void main(String[] args) {

    EntityManagerFactory emf= Persistence.createEntityManagerFactory("BlueDart");
    EntityManager em=emf.createEntityManager();
    Date date = new Date();
    Shipment bd=new Shipment();
    bd.setContent("Vegetable Basket");
    bd.setCreated_timestamp(new Timestamp(date.getTime()));
    bd.setPackageNumber("BD5678768");
    bd.setWeight(4.5);
    bd.setRecipientAddress("New Delhi");
    bd.setSenderAddress("Banglore");
    em.getTransaction().begin();
    em.persist(bd);
    em.getTransaction().commit();
    em.close();
    System.out.println("Data added successfully");
}
}
