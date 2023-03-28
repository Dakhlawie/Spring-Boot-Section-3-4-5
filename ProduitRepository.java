package com.meriem.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meriem.demo.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
