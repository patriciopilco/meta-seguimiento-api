package ec.rio.metaverso.seguimiento.api.Service;

import ec.rio.metaverso.seguimiento.api.Model.AvanceEntity;
import ec.rio.metaverso.seguimiento.api.Repository.AvanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvanceService {

    @Autowired
    private AvanceRepository repository;

    public List<AvanceEntity> getAvances(){ return repository.findAll(); };
}
