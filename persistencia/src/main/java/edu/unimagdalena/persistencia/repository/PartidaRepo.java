package edu.unimagdalena.persistencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.unimagdalena.persistencia.entidades.Partida;

public interface PartidaRepo extends JpaRepository<Partida,Long>{ }
