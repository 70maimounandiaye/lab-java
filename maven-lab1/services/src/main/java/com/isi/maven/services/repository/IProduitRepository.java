package com.isi.maven.services.repository;

import com.isi.maven.services.model.ProduitEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IProduitRepository extends JpaRepository<ProduitEntity, Integer> {
}
