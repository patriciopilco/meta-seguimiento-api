package ec.rio.metaverso.seguimiento.api.Repository;

import ec.rio.metaverso.seguimiento.api.Model.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<ProductoEntity,Long> {
}
