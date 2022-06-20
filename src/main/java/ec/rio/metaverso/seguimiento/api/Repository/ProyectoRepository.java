package ec.rio.metaverso.seguimiento.api.Repository;

import ec.rio.metaverso.seguimiento.api.Model.ProyectoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepository extends JpaRepository<ProyectoEntity,Long> {

}
