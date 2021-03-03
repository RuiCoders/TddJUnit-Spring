package com.SpringTDDcomJUnitModel.contato.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringTDDcomJUnitModel.contato.model.ContatoModel;

public interface ContatoRepository extends JpaRepository<ContatoModel, Long> {
}
