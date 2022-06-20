package ec.rio.metaverso.seguimiento.api.Controller;

import ec.rio.metaverso.seguimiento.api.Model.EntregableEntity;
import ec.rio.metaverso.seguimiento.api.Service.EntregableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EntregableController {

    @Autowired
    private EntregableService service;

    @RequestMapping(value="/entregable", method= RequestMethod.GET)
    public List<EntregableEntity> listarEntregablesTodos() { return service.getEntregables(); }
}
