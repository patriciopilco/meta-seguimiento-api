package ec.rio.metaverso.seguimiento.api.Controller;

import ec.rio.metaverso.seguimiento.api.Model.ProductoEntity;
import ec.rio.metaverso.seguimiento.api.Service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductoController {

    @Autowired
    private ProductoService service;

    @RequestMapping(value="/producto", method= RequestMethod.GET)
    public List<ProductoEntity> listarProductos() {
        return service.getProductos();
    }
}
