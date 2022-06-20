package ec.rio.metaverso.seguimiento.api.Repository;

import ec.rio.metaverso.seguimiento.api.Model.TareaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TareaRepository extends JpaRepository<TareaEntity, Long> {


}
