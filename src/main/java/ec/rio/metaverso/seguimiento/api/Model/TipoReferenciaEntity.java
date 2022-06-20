package ec.rio.metaverso.seguimiento.api.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity(name = "tipoReferenciaEntity")
@Table(name = "ARQ_TIPOSREF_TC", schema = "ADMIN", catalog = "")
public class TipoReferenciaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_TIPOREF")
    private long idTipoReferencia;
    @Basic
    @Column(name = "TIPO_REFERENCIA")
    private String tipoReferencia;

    @JsonIgnore
    @OneToMany(mappedBy = "tipoReferenciaEntity")
    private List<ReferenciaEntity> listaRefencias;

    public long getIdTipoReferencia() {
        return idTipoReferencia;
    }

    public void setIdTipoReferencia(long idTipoReferencia) {
        this.idTipoReferencia = idTipoReferencia;
    }

    public String getTipoReferencia() {
        return tipoReferencia;
    }

    public void setTipoReferencia(String tipoReferencia) {
        this.tipoReferencia = tipoReferencia;
    }

    public List<ReferenciaEntity> getListaRefencias() {
        return listaRefencias;
    }

    public void setListaRefencias(List<ReferenciaEntity> listaRefencias) {
        this.listaRefencias = listaRefencias;
    }
}
