package ec.rio.metaverso.seguimiento.api.Service;

import ec.rio.metaverso.seguimiento.api.Model.EntregableEntity;
import ec.rio.metaverso.seguimiento.api.Repository.EntregableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntregableService {

    @Autowired
    private EntregableRepository respository;

    public List<EntregableEntity> getEntregables() { return respository.findAll(); };
}
