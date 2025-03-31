package projetos.pratica.TaskManager.Model;

import java.sql.Date;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Task{
    @id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String titulo;
    private String descricao;
    private String criador;
    private Date dataCriacao;
    private boolean concluido;
    private String status;
    private String prioridade;
    private Date prazoFinal;

    public Task() {
    }


    public Task(String titulo, String descricao, String criador, String prioridade){
        this.titulo = titulo;
        this.descricao = descricao;
        this.criador = criador;
        this.prioridade = prioridade;
        this.dataCriacao = new Date(System.currentTimeMillis());
        this.concluido = false;
        this.status = "Pendente";
      }


}