package com.portafolio.mauro.repository;

import com.portafolio.mauro.model.Redes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedesRepository extends JpaRepository<Redes, Long>{
    
}
