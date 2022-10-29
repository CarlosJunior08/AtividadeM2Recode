package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Contatos;

@Repository
public interface ContatoRepository extends JpaRepository <Contatos,Long>{

}
