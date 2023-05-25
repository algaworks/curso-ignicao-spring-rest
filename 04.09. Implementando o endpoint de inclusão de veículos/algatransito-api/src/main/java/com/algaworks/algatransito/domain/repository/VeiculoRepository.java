package com.algaworks.algatransito.domain.repository;

import com.algaworks.algatransito.domain.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
}
