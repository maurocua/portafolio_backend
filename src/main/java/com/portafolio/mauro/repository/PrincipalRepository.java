package com.portafolio.mauro.repository;

import com.portafolio.mauro.model.Principal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrincipalRepository extends JpaRepository<Principal, Long>{
    
}
