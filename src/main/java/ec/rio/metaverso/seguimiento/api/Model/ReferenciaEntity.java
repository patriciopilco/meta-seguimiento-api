package ec.rio.metaverso.seguimiento.api.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.*;

@Entity(name = "referenciaEntity")
@Table(name = "ARQ_REFERENCIAS_T", schema = "ADMIN", catalog = "")
public class ReferenciaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_REFERENCIA")
    private long idReferencia;
    @Basic
    @Column(name = "REFERENCIA")
    private String referencia;
    @Basic
    @Column(name = "ID_TIPOREF")
    private Long idTiporef;
    @Basic
    @Column(name = "FEC_CREACION")
    private Timestamp fecCreacion;
    @OneToMany( fetch = FetchType.LAZY, mappedBy = "referenciaEntity" ,cascade = CascadeType.ALL)
    private List<ProyectoEntity> listaProyectos = new ArrayList<>();

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_TIPOREF", referencedColumnName = "ID_TIPOREF" , insertable = false, updatable = false)
    private TipoReferenciaEntity tipoReferenciaEntity;

    public long getIdReferencia() {
        return idReferencia;
    }

    public void setIdReferencia(long idReferencia) {
        this.idReferencia = idReferencia;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public Long getIdTiporef() {
        return idTiporef;
    }

    public void setIdTiporef(Long idTiporef) {
        this.idTiporef = idTiporef;
    }

    public Timestamp getFecCreacion() {
        return fecCreacion;
    }

    public void setFecCreacion(Timestamp fecCreacion) {
        this.fecCreacion = fecCreacion;
    }

    public List<ProyectoEntity> getListaProyectos() {
        return listaProyectos;
    }

    public void setListaProyectos(List<ProyectoEntity> listaProyectos) {
        this.listaProyectos = listaProyectos;
    }

    public TipoReferenciaEntity getTipoReferenciaEntity() {
        return tipoReferenciaEntity;
    }

    public void setTipoReferenciaEntity(TipoReferenciaEntity tipoReferenciaEntity) {
        this.tipoReferenciaEntity = tipoReferenciaEntity;
    }
}
