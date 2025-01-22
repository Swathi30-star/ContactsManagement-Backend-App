package com.spring.contacts.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.contacts.Entity.Contacts;

@Repository
public interface ContactsRepository extends JpaRepository<Contacts, Long>{

}
