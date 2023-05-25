package com.algaworks.algatransito.domain.repository;

import com.algaworks.algatransito.domain.model.Proprietario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProprietarioRepository extends JpaRepository<Proprietario, Long> {
}
