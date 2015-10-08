package entidade;
// Generated 04/10/2015 19:28:26 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Auditoria generated by hbm2java
 */
@Entity
@Table(name="auditoria"
    ,schema="public"
)
public class Auditoria  implements java.io.Serializable {

 @Id
    @Column(name = "idAuditoria")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int idauditoria;
 @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="pessoa_idpessoa", nullable=false)
     private Pessoa pessoa;
  @Column(name="descricao", nullable=false, length=200)
     private String descricao;
  @Column(name="tabela", nullable=false, length=45)
     private String tabela;
  @Temporal(TemporalType.TIMESTAMP)
    @Column(name="dt_hora", nullable=false, length=29)
     private Date dtHora;
  @Column(name="tipo_acao", nullable=false, length=45)
     private String tipoAcao;

    public Auditoria() {
    }

    public Auditoria(int idauditoria, Pessoa pessoa, String descricao, String tabela, Date dtHora, String tipoAcao) {
       this.idauditoria = idauditoria;
       this.pessoa = pessoa;
       this.descricao = descricao;
       this.tabela = tabela;
       this.dtHora = dtHora;
       this.tipoAcao = tipoAcao;
    }
   
  
    
    
    public int getIdauditoria() {
        return this.idauditoria;
    }
    
    public void setIdauditoria(int idauditoria) {
        this.idauditoria = idauditoria;
    }


    public Pessoa getPessoa() {
        return this.pessoa;
    }
    
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    
   
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
    
    public String getTabela() {
        return this.tabela;
    }
    
    public void setTabela(String tabela) {
        this.tabela = tabela;
    }

    
    public Date getDtHora() {
        return this.dtHora;
    }
    
    public void setDtHora(Date dtHora) {
        this.dtHora = dtHora;
    }

    
    
    public String getTipoAcao() {
        return this.tipoAcao;
    }
    
    public void setTipoAcao(String tipoAcao) {
        this.tipoAcao = tipoAcao;
    }




}


