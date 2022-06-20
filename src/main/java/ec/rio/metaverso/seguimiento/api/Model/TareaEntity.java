package ec.rio.metaverso.seguimiento.api.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ARQ_TAREAS_T", schema = "ADMIN", catalog = "")
public class TareaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_TAREA")
    private long idTarea;
    @Basic
    @Column(name = "ID_TECNICO")
    private Long idTecnico;

    private String tarea;

    @Basic
    @Column(name = "ID_PROYECTO")
    private Long idProyecto;

    @ManyToOne
    @JoinColumn(name = "ID_PROYECTO", referencedColumnName = "ID_PROYECTO" , insertable = false, updatable = false)
    @JsonIgnore
    private ProyectoEntity proyectoEntity;

    @ManyToOne
    @JoinColumn(name = "ID_TECNICO", referencedColumnName = "ID_TECNICO" , insertable = false, updatable = false)
    @JsonIgnore
    private TecnicoEntity tecnicoEntity;

    @OneToMany(mappedBy = "tareaEntity")
    private List<AvanceEntity> listaAvances;

    public long getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(long idTarea) {
        this.idTarea = idTarea;
    }

    public Long getIdTecnico() {
        return idTecnico;
    }

    public void setIdTecnico(Long idTecnico) {
        this.idTecnico = idTecnico;
    }

    public Long getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(Long idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

    public ProyectoEntity getProyectoEntity() {
        return proyectoEntity;
    }

    public void setProyectoEntity(ProyectoEntity proyectoEntity) {
        this.proyectoEntity = proyectoEntity;
    }

    public List<AvanceEntity> getListaAvances() {
        return listaAvances;
    }

    public void setListaAvances(List<AvanceEntity> listaAvances) {
        this.listaAvances = listaAvances;
    }
}
