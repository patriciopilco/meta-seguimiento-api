package ec.rio.metaverso.seguimiento.api.Repository;

import ec.rio.metaverso.seguimiento.api.Model.TecnicoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TecnicoRepository extends JpaRepository<TecnicoEntity, Long> {
}
