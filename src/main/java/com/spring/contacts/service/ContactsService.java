package com.spring.contacts.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.contacts.Entity.Contacts;
import com.spring.contacts.Repository.ContactsRepository;

@Service
public class ContactsService {
	 @Autowired
	    private ContactsRepository contactRepository;

	    public List<Contacts> getAllContacts() {
	        return contactRepository.findAll();
	    }

		/*
		 * public Optional<Contacts> getContactById(Long id) { return
		 * contactRepository.findById(id); }
		 */

	    public Contacts createContact(Contacts contact) {
	        return contactRepository.save(contact);
	    }

		/*
		 * public void deleteContact(Long id) { contactRepository.deleteById(id); }
		 */
}
