package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.medico.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
}
