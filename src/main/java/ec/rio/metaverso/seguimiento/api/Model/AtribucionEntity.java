package ec.rio.metaverso.seguimiento.api.Model;

import javax.persistence.*;

@Entity
@Table(name = "ARQ_ATRIBUCIONES_TC", schema = "ADMIN", catalog = "")
public class AtribucionEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_ATRIBUCION")
    private long idAtribucion;
    @Basic
    @Column(name = "ID_RESOLUCION")
    private Long idResolucion;
    @ManyToOne
    @JoinColumn(name = "ID_RESOLUCION", referencedColumnName = "ID_RESOLUCION", insertable = false, updatable = false)
    private ResolucionEntity arqResolucionesTcByIdResolucion;

    public long getIdAtribucion() {
        return idAtribucion;
    }

    public void setIdAtribucion(long idAtribucion) {
        this.idAtribucion = idAtribucion;
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

}
