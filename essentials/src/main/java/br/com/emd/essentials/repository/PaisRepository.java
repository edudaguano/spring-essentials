package br.com.emd.essentials.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.emd.essentials.model.Pais;

@Repository
public interface PaisRepository extends JpaRepository<Pais, Long>{

}
