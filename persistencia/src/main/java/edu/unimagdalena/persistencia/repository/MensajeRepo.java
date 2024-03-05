package edu.unimagdalena.persistencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.unimagdalena.persistencia.entidades.Mensaje;

public interface MensajeRepo extends JpaRepository<Mensaje,Long>{}
