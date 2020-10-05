package br.dev.diego.bdscliente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.dev.diego.bdscliente.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
