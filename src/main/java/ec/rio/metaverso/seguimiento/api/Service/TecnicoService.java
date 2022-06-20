package ec.rio.metaverso.seguimiento.api.Service;

import ec.rio.metaverso.seguimiento.api.Model.TecnicoEntity;
import ec.rio.metaverso.seguimiento.api.Repository.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TecnicoService {

    @Autowired
    private TecnicoRepository respository;

    public List<TecnicoEntity> getTecnicos() {
        return  respository.findAll();
    }
}
