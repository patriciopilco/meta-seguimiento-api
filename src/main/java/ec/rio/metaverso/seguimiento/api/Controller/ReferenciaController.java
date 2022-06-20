package ec.rio.metaverso.seguimiento.api.Controller;

import ec.rio.metaverso.seguimiento.api.Model.ReferenciaEntity;
import ec.rio.metaverso.seguimiento.api.Service.ReferenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReferenciaController {

    @Autowired
    private ReferenciaService referenciasTService;

    @RequestMapping(value="/referencia", method= RequestMethod.GET)
    public List<ReferenciaEntity> readEmployees() {
        return referenciasTService.getReferencias();
    }
}
