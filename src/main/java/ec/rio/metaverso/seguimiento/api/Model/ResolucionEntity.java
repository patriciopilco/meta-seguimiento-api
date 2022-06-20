package ec.rio.metaverso.seguimiento.api.Model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "ARQ_RESOLUCIONES_TC", schema = "ADMIN", catalog = "")
public class ResolucionEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_RESOLUCION")
    private long idResolucion;
    @OneToMany(mappedBy = "arqResolucionesTcByIdResolucion")
    private Collection<AtribucionEntity> arqAtribucionesTcsByIdResolucion;
    @OneToMany(mappedBy = "arqResolucionesTcByIdResolucion")
    private Collection<ProductoEntity> arqProductosTcsByIdResolucion;

    public long getIdResolucion() {
        return idResolucion;
    }

    public void setIdResolucion(long idResolucion) {
        this.idResolucion = idResolucion;
    }

    public Collection<AtribucionEntity> getArqAtribucionesTcsByIdResolucion() {
        return arqAtribucionesTcsByIdResolucion;
    }

    public void setArqAtribucionesTcsByIdResolucion(Collection<AtribucionEntity> arqAtribucionesTcsByIdResolucion) {
        this.arqAtribucionesTcsByIdResolucion = arqAtribucionesTcsByIdResolucion;
    }

    public Collection<ProductoEntity> getArqProductosTcsByIdResolucion() {
        return arqProductosTcsByIdResolucion;
    }

    public void setArqProductosTcsByIdResolucion(Collection<ProductoEntity> arqProductosTcsByIdResolucion) {
        this.arqProductosTcsByIdResolucion = arqProductosTcsByIdResolucion;
    }
}
