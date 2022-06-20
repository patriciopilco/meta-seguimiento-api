package ec.rio.metaverso.seguimiento.api.Service;

import ec.rio.metaverso.seguimiento.api.Model.ReferenciaEntity;
import ec.rio.metaverso.seguimiento.api.Repository.ReferenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReferenciaService {

    @Autowired
    private ReferenciaRepository repository;

    // READ
    public List<ReferenciaEntity> getReferencias() {
        return repository.findAll();
    }
}
