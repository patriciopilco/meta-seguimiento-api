package ec.rio.metaverso.seguimiento.api.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "ARQ_AVANCES_T", schema = "ADMIN", catalog = "")
public class AvanceEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_AVANCE")
    private long idAvance;

    private String avance;

    private int porcentaje;

    @Column(name = "FEC_AVANCE")
    private Timestamp fechaAvance;

    private long predecesor;

    @Basic
    @Column(name = "ID_TAREA")
    private Long idTarea;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "ID_TAREA", referencedColumnName = "ID_TAREA", insertable = false, updatable = false)
    private TareaEntity tareaEntity;

    public long getIdAvance() {
        return idAvance;
    }

    public void setIdAvance(long idAvance) {
        this.idAvance = idAvance;
    }

    public Long getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(Long idTarea) {
        this.idTarea = idTarea;
    }

    public String getAvance() {
        return avance;
    }

    public void setAvance(String avance) {
        this.avance = avance;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Timestamp getFechaAvance() {
        return fechaAvance;
    }

    public void setFechaAvance(Timestamp fechaAvance) {
        this.fechaAvance = fechaAvance;
    }

    public long getPredecesor() {
        return predecesor;
    }

    public void setPredecesor(long predecesor) {
        this.predecesor = predecesor;
    }

    public TareaEntity getTareaEntity() {
        return tareaEntity;
    }

    public void setTareaEntity(TareaEntity tareaEntity) {
        this.tareaEntity = tareaEntity;
    }
}
