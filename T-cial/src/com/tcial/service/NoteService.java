package com.tcial.service;

import java.util.ConcurrentModificationException;

import org.slim3.datastore.Datastore;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.Transaction;
import com.tcial.meta.common.CommentMeta;
import com.tcial.meta.common.NoteMeta;
import com.tcial.meta.user.AccountMeta;
import com.tcial.model.common.Note;
import com.tcial.model.user.Account;

public class NoteService {

	/* Meta */
	private AccountMeta acc_meta = AccountMeta.get();
    private NoteMeta note_meta = NoteMeta.get();
    private CommentMeta com_meta = CommentMeta.get();

    /* create */
    public Note create(String student, String writer, String body){

    	Transaction tx = Datastore.beginTransaction();
    	try {
	    	Note note = new Note();
	    	Key parentKey = Datastore.createKey(acc_meta, student);
	    	Key key = Datastore.allocateId(parentKey, note_meta);
	    	Long id = key.getId();

	    	note.setKey(key);
	    	note.setWriter(writer);
	    	note.setBody(body);
	    	note.setId(id);

	    	Datastore.put(tx, note);
	    	tx.commit();
	    	return note;
	    } catch (ConcurrentModificationException e) {
	        if (tx.isActive()) {
	            tx.rollback();
	        }
	        throw e;
	    }
    }

    /* update */
    public Note update(Long id, String student, String body){

    	Transaction tx = Datastore.beginTransaction();
    	try {
	    	Key parentKey = Datastore.createKey(acc_meta, student);
	    	Key key = Datastore.createKey(parentKey, note_meta, id);
	    	Note note = Datastore.get(note_meta, key);
	    	note.setBody(body);
	    	Datastore.put(tx, note);
	    	tx.commit();
	    	return note;
	    } catch (ConcurrentModificationException e) {
	        if (tx.isActive()) {
	            tx.rollback();
	        }
	        throw e;
	    }
    }

    /* delete */
    public void delete(Long id, String student){

    	Transaction tx = Datastore.beginTransaction();
    	try {
	    	Key parentKey = Datastore.createKey(acc_meta, student);
	    	Key noteKey = Datastore.createKey(parentKey, note_meta, id);

	    	Datastore.deleteAll(tx, noteKey);
	    	tx.commit();

	    } catch (ConcurrentModificationException e) {
	        if (tx.isActive()) {
	            tx.rollback();
	        }
	        throw e;
	    }
    }
}