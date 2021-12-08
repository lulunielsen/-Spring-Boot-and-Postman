package com.luisa.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.luisa.domain.Endereco;


@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer>{

}
