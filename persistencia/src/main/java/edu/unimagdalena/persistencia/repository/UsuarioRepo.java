package edu.unimagdalena.persistencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.unimagdalena.persistencia.entidades.Usuario;

public interface UsuarioRepo extends JpaRepository<Usuario,Long>{}
