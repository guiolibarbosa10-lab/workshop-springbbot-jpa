package com.guidev.exemploStools.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guidev.exemploStools.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

// com apenas essa interface vazia, o Spring Data JPA gera 
//toda a implementação automaticamente em tempo de execução, sem precisar escrever uma linha de SQL.