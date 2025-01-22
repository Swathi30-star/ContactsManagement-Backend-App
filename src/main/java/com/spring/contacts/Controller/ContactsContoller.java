package com.spring.contacts.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.contacts.Entity.Contacts;
import com.spring.contacts.Repository.ContactsRepository;
import com.spring.contacts.service.ContactsService;

@RestController
@RequestMapping("/Contacts")
@CrossOrigin(origins = "http://localhost:4200")
public class ContactsContoller {

	@Autowired
	private ContactsService contactService;
	 
	 @GetMapping("/allContacts")
	 public ResponseEntity<List<Contacts>> getAllContacts() { 
		 List<Contacts> contacts= contactService.getAllContacts();
		 return   new ResponseEntity<>(contacts,HttpStatus.OK);
		 }
	  
		/*
		 * @GetMapping("/{id}") public Contacts getContactById(@PathVariable Long id) {
		 * return contactService.getContactById(id).orElse(null); }
		 */
	  @PostMapping("/addContacts")
	  public ResponseEntity<Contacts>  createContact(@RequestBody Contacts contact) {
		  Contacts newContact=contactService.createContact(contact);
		  return new ResponseEntity<>(newContact,HttpStatus.CREATED);
		  }
	  
	  
}
