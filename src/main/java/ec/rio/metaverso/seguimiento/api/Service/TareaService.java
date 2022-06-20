package ec.rio.metaverso.seguimiento.api.Service;

import ec.rio.metaverso.seguimiento.api.Model.TareaEntity;
import ec.rio.metaverso.seguimiento.api.Repository.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TareaService {

    @Autowired
    private TareaRepository repository;

    public List<TareaEntity> getTareas(){ return repository.findAll(); };
}
