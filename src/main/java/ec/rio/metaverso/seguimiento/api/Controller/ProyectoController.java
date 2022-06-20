package ec.rio.metaverso.seguimiento.api.Controller;

import ec.rio.metaverso.seguimiento.api.Model.ProyectoEntity;
import ec.rio.metaverso.seguimiento.api.Service.ProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProyectoController {

    @Autowired
    private ProyectoService service;

    @RequestMapping(value="/proyecto", method= RequestMethod.GET)
    public List<ProyectoEntity> listarProyectos() {
        return service.getProyectos();
    }
}
