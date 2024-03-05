package edu.unimagdalena.persistencia.entidades;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.CascadeType;
import lombok.Getter;
import lombok.Setter;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name="usuarios")
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(unique=true)
    private String user;
    @Column(unique=true)
    private String email;
    private String nombre;
    private String apellidos;
    private Integer edad;
    private String password;
    private String passwordConfirmation;
    private Boolean enabled;
    private String foto;
    private String rol;
    @Temporal(TemporalType.TIME)    
    private LocalDateTime createAt;
    @OneToMany(mappedBy = "usuario",cascade =CascadeType.REFRESH,orphanRemoval = true)
    private Sugerencia[] sugerencias;
    @OneToMany(mappedBy="usuario",cascade =CascadeType.REFRESH,orphanRemoval=true)
    private Mensaje[] mensajes;
    @ManyToMany(cascade =CascadeType.REFRESH) 
    @JoinTable(name="usuarios_partidas",
            joinColumns=@JoinColumn(name="idUsuario",referencedColumnName="id"),
            inverseJoinColumns=@JoinColumn(name="idPartida",referencedColumnName = "id"))
    private Partida[] partidas;    
}
