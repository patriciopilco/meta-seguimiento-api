package ec.rio.metaverso.seguimiento.api.Model;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Objects;

@Entity
@Table(name = "ARQ_TIPOSENT_TC", schema = "ADMIN", catalog = "")
public class TipoEntregableEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_TIPOENT")
    private long idTipoent;
    @Basic
    @Column(name = "TIPO_ENTREGABLE")
    private String tipoEntregable;
    @Basic
    @Column(name = "CODIFICACION")
    private String codificacion;
    @Basic
    @Column(name = "SECUENCIA")
    private BigInteger secuencia;

    public long getIdTipoent() {
        return idTipoent;
    }

    public void setIdTipoent(long idTipoent) {
        this.idTipoent = idTipoent;
    }

    public String getTipoEntregable() {
        return tipoEntregable;
    }

    public void setTipoEntregable(String tipoEntregable) {
        this.tipoEntregable = tipoEntregable;
    }

    public String getCodificacion() {
        return codificacion;
    }

    public void setCodificacion(String codificacion) {
        this.codificacion = codificacion;
    }

    public BigInteger getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(BigInteger secuencia) {
        this.secuencia = secuencia;
    }

}
