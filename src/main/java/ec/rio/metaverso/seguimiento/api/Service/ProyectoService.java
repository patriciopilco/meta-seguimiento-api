package ec.rio.metaverso.seguimiento.api.Service;

import ec.rio.metaverso.seguimiento.api.Model.ProyectoEntity;
import ec.rio.metaverso.seguimiento.api.Repository.ProyectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProyectoService {

    @Autowired
    private ProyectoRepository repository;

    public List<ProyectoEntity> getProyectos() {
        return repository.findAll();
    }
}
