package ec.rio.metaverso.seguimiento.api.Controller;

import ec.rio.metaverso.seguimiento.api.Model.TecnicoEntity;
import ec.rio.metaverso.seguimiento.api.Service.TecnicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TecnicoController {

    @Autowired
    private TecnicoService service;

    @RequestMapping(value="/tecnico", method= RequestMethod.GET)
    public List<TecnicoEntity> listarTecnicosTodos() {
        return service.getTecnicos();
    }
}
