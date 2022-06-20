package ec.rio.metaverso.seguimiento.api.Repository;

import ec.rio.metaverso.seguimiento.api.Model.ReferenciaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReferenciaRepository extends JpaRepository<ReferenciaEntity, Long> {
}