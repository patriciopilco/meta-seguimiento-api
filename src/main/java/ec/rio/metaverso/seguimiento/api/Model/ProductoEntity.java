package ec.rio.metaverso.seguimiento.api.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ARQ_PRODUCTOS_TC", schema = "ADMIN", catalog = "")
public class ProductoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_PRODUCTO")
    private long idProducto;
    @Basic
    @Column(name = "ID_PROCESO")
    private Long idProceso;
    @Basic
    @Column(name = "ID_RESOLUCION")
    private Long idResolucion;

    private int numeral;
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "ID_RESOLUCION", referencedColumnName = "ID_RESOLUCION" , insertable = false, updatable = false)
    @JsonIgnore
    private ResolucionEntity arqResolucionesTcByIdResolucion;

    public long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(long idProducto) {
        this.idProducto = idProducto;
    }

    public Long getIdResolucion() {
        return idResolucion;
    }

    public void setIdResolucion(Long idResolucion) {
        this.idResolucion = idResolucion;
    }

    public ResolucionEntity getArqResolucionesTcByIdResolucion() {
        return arqResolucionesTcByIdResolucion;
    }

    public void setArqResolucionesTcByIdResolucion(ResolucionEntity arqResolucionesTcByIdResolucion) {
        this.arqResolucionesTcByIdResolucion = arqResolucionesTcByIdResolucion;
    }

    public int getNumeral() {
        return numeral;
    }

    public void setNumeral(int numeral) {
        this.numeral = numeral;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
