package ec.rio.metaverso.seguimiento.api.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "arqProyectosTEntity")
@Table(name = "ARQ_PROYECTOS_T", schema = "ADMIN", catalog = "")
public class ProyectoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_PROYECTO")
    private long idProyecto;
    @Basic
    @Column(name = "ID_REFERENCIA")
    private Long idReferencia;
    @Basic
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic
    @Column(name = "FEC_CREACION")
    private Timestamp fecCreacion;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_REFERENCIA", referencedColumnName = "ID_REFERENCIA" , insertable = false, updatable = false)
    @JsonIgnore
    private ReferenciaEntity referenciaEntity;

    @OneToMany( fetch = FetchType.LAZY, mappedBy = "proyectoEntity" ,cascade = CascadeType.ALL)
    private List<TareaEntity> listaTareas = new ArrayList<>();

    @OneToMany( fetch = FetchType.LAZY, mappedBy = "proyectoEntity" ,cascade = CascadeType.ALL)
    private List<EntregableEntity> listaEntregable = new ArrayList<>();

    public long getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(long idProyecto) {
        this.idProyecto = idProyecto;
    }

    public Long getIdReferencia() {
        return idReferencia;
    }

    public void setIdReferencia(Long idReferencia) {
        this.idReferencia = idReferencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Timestamp getFecCreacion() {
        return fecCreacion;
    }

    public void setFecCreacion(Timestamp fecCreacion) {
        this.fecCreacion = fecCreacion;
    }

    public ReferenciaEntity getReferenciaEntity() {
        return referenciaEntity;
    }

    public void setReferenciaEntity(ReferenciaEntity referenciaEntity) {
        this.referenciaEntity = referenciaEntity;
    }

    public List<TareaEntity> getListaTareas() {
        return listaTareas;
    }

    public void setListaTareas(List<TareaEntity> listaTareas) {
        this.listaTareas = listaTareas;
    }

    public List<EntregableEntity> getListaEntregable() {
        return listaEntregable;
    }

    public void setListaEntregable(List<EntregableEntity> listaEntregable) {
        this.listaEntregable = listaEntregable;
    }
}
