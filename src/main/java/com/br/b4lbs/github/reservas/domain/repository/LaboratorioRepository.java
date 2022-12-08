package com.br.b4lbs.github.reservas.domain.repository;

import com.br.b4lbs.github.reservas.domain.model.Laboratorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaboratorioRepository extends JpaRepository<Laboratorio, Long> {

}
