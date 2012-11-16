package com.tcial.service;

import java.util.List;

import org.slim3.datastore.Datastore;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.Transaction;
import com.tcial.meta.ContactMeta;
import com.tcial.model.management.Contact;

public class ContactService {
    private ContactMeta meta = ContactMeta.get();

    public void set(String lastname,
                    String firstname,
                    String sai,
                    String mai,
                    String school_category,
                    String school_name,
                    String grade,
                    String postal_code,
                    String address,
                    String tel,
                    String mail,
                    String goal,
                    String terms,
                    String inquiry,
                    String problem,
                    String strong_weakness,
                    String contact_hours,
                    String how_know,
                    String content ) {
        Transaction tx = Datastore.beginTransaction();
        Contact contact = new Contact();
        Key key = Datastore.allocateId(meta);
        contact.setKey(key);
        contact.setLastname(lastname);
        contact.setFirstname(firstname);
        contact.setSai(sai);
        contact.setMai(mai);
        contact.setSchool_category(school_category);
        contact.setSchool_name(school_name);
        contact.setGrade(grade);
        contact.setPostal_code(postal_code);
        contact.setAddress(address);
        contact.setTel(tel);
        contact.setMail(mail);
        contact.setGoal(goal);
        contact.setTerms(terms);
        contact.setInquiry(inquiry);
        contact.setProblem(problem);
        contact.setStrong_weakness(strong_weakness);
        contact.setContact_hours(contact_hours);
        contact.setHow_know(how_know);
//        contact.setInterest_point(interest_point);
        contact.setContent(content);
        Datastore.put(tx, contact);
        tx.commit();
    }

    public List<Contact> getContactAll() {
        return Datastore.query(meta).asList();
    }
}