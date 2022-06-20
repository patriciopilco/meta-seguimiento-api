package ec.rio.metaverso.seguimiento.api.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;


@Entity
@Table(name = "ARQ_ENTREGABLES_T", schema = "ADMIN", catalog = "")
public class EntregableEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_ENTREGABLE")
    private long idEntregable;
    @Basic
    @Column(name = "ID_PROYECTO")
    private Long idProyecto;
    @Basic
    @Column(name = "ID_TIPOENT")
    private Long idTipoent;
    @Basic
    @Column(name = "CODIGO")
    private String codigoDocumento;
    @Basic
    @Column(name = "NOMBRE")
    private String nomombreDocumento;

    @Basic
    @Column(name = "ENLACE")
    private String enlaceDocumento;

    @Basic
    @Column(name = "OBSERVACION")
    private String observacionDocumento;

    @Basic
    @Column(name = "ID_TECNICO")
    private Long idTecnico;

    @Basic
    @Column(name = "ID_PRODUCTO")
    private Long idProducto;

    @ManyToOne
    @JoinColumn(name = "ID_PROYECTO", referencedColumnName = "ID_PROYECTO" , insertable = false, updatable = false)
    @JsonIgnore
    private ProyectoEntity proyectoEntity;

    @ManyToOne
    @JoinColumn(name = "ID_TECNICO", referencedColumnName = "ID_TECNICO" , insertable = false, updatable = false)
    @JsonIgnore
    private TecnicoEntity tecnicoEntity;

    public long getIdEntregable() {
        return idEntregable;
    }

    public void setIdEntregable(long idEntregable) {
        this.idEntregable = idEntregable;
    }

    public Long getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(Long idProyecto) {
        this.idProyecto = idProyecto;
    }

    public Long getIdTipoent() {
        return idTipoent;
    }

    public void setIdTipoent(Long idTipoent) {
        this.idTipoent = idTipoent;
    }

    public String getCodigoDocumento() {
        return codigoDocumento;
    }

    public void setCodigoDocumento(String codigoDocumento) {
        this.codigoDocumento = codigoDocumento;
    }

    public String getNomombreDocumento() {
        return nomombreDocumento;
    }

    public void setNomombreDocumento(String nomombreDocumento) {
        this.nomombreDocumento = nomombreDocumento;
    }

    public String getEnlaceDocumento() {
        return enlaceDocumento;
    }

    public void setEnlaceDocumento(String enlaceDocumento) {
        this.enlaceDocumento = enlaceDocumento;
    }

    public String getObservacionDocumento() {
        return observacionDocumento;
    }

    public void setObservacionDocumento(String observacionDocumento) {
        this.observacionDocumento = observacionDocumento;
    }

    public Long getIdTecnico() {
        return idTecnico;
    }

    public void setIdTecnico(Long idTecnico) {
        this.idTecnico = idTecnico;
    }

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public ProyectoEntity getProyectoEntity() {
        return proyectoEntity;
    }

    public void setProyectoEntity(ProyectoEntity proyectoEntity) {
        this.proyectoEntity = proyectoEntity;
    }
}
