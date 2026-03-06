package com.sistema.funcionarios.repository;

import com.sistema.funcionarios.model.Funcionario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {


    Page<Funcionario> findByNomeContainingIgnoreCase(String nome, Pageable pageable);
}