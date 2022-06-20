package ec.rio.metaverso.seguimiento.api.Controller;

import ec.rio.metaverso.seguimiento.api.Model.TareaEntity;
import ec.rio.metaverso.seguimiento.api.Service.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TareaController {

    @Autowired
    private TareaService service;

    @RequestMapping(value="/tarea", method= RequestMethod.GET)
    public List<TareaEntity> listarTareas() { return service.getTareas(); };
}
