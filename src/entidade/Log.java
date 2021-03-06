package entidade;
// Generated 24/08/2015 19:33:04 by Hibernate Tools 3.2.1.GA

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
 * Log generated by hbm2java
 */
@Entity
@Table(name = "log", schema = "public")
public class Log implements java.io.Serializable {

    @Id
    @Column(name = "idlog")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idlog;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pessoa_idpessoa", nullable = false)
    private Pessoa pessoa;
    @Column(name = "descricao", nullable = false, length = 45)
    private String descricao;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dt_hora", nullable = false, length = 29)
    private Date dtHora;
    @Column(name = "tipo_acao", nullable = false, length = 45)
    private String tipoAcao;
@Column(name="tabela", nullable=false, length=45)
	private String tabela;
	
    public Log() {
    }

    public Log(int idlog, Pessoa pessoa, String descricao, Date dtHora, String tipoAcao, String tabela) {
       this.idlog = idlog;
       this.pessoa = pessoa;
       this.descricao = descricao;
       this.dtHora = dtHora;
       this.tipoAcao = tipoAcao;
       this.tabela = tabela;
    }

    public int getIdlog() {
        return this.idlog;
    }

    public void setIdlog(int idlog) {
        this.idlog = idlog;
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
	
	public String getTabela() {
        return this.tabela;
    }
    
    public void setTabela(String tabela) {
        this.tabela = tabela;
    }
	
}
