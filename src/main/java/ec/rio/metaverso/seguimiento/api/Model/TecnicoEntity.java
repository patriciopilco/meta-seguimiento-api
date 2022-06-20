package ec.rio.metaverso.seguimiento.api.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "ARQ_TECNICOS_T", schema = "ADMIN", catalog = "")
public class TecnicoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_TECNICO")
    private long idTecnico;
    @Basic
    @Column(name = "EMAIL")
    private String email;

    @OneToMany( fetch = FetchType.LAZY, mappedBy = "tecnicoEntity" ,cascade = CascadeType.ALL)
    private List<EntregableEntity> listaEntregables = new ArrayList<>();

    @OneToMany( fetch = FetchType.LAZY, mappedBy = "tecnicoEntity" ,cascade = CascadeType.ALL)
    private List<TareaEntity> listaTareas = new ArrayList<>();

    public long getIdTecnico() {
        return idTecnico;
    }

    public void setIdTecnico(long idTecnico) {
        this.idTecnico = idTecnico;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<EntregableEntity> getListaEntregables() {
        return listaEntregables;
    }

    public void setListaEntregables(List<EntregableEntity> listaEntregables) {
        this.listaEntregables = listaEntregables;
    }

    public List<TareaEntity> getListaTareas() {
        return listaTareas;
    }

    public void setListaTareas(List<TareaEntity> listaTareas) {
        this.listaTareas = listaTareas;
    }
}
