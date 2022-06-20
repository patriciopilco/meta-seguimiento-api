package ec.rio.metaverso.seguimiento.api.Controller;

import ec.rio.metaverso.seguimiento.api.Model.AvanceEntity;
import ec.rio.metaverso.seguimiento.api.Service.AvanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AvanceController {

    @Autowired
    private AvanceService service;

    @RequestMapping(value="/avance", method= RequestMethod.GET)
    public List<AvanceEntity> listarAvanceTodos() { return service.getAvances(); };

}
