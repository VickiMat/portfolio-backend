
package com.portfoliosb.MiBackEnd.security.repository;

import com.portfoliosb.MiBackEnd.security.entity.Rol;
import com.portfoliosb.MiBackEnd.security.enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
