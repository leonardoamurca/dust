
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Pedro Cruz
 */
public class RecicladorBean { //UTILIZAR HERANÇA 
    
    private String email;
    private String confirmaEmail;
    private String senha;
    private String nomeEmpresa;
    private String endereco;
    private String numeroCasa;
    private String telefone;

    public String getEmail() {
        return email;
    }

    public String getConfirmaEmail() {
        return confirmaEmail;
    }

    public String getSenha() {
        return senha;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getNumeroCasa() {
        return numeroCasa;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setConfirmaEmail(String confirmaEmail) {
        this.confirmaEmail = confirmaEmail;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setNumeroCasa(String numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String salvar() {
        FacesContext context = FacesContext.getCurrentInstance();

        if (!this.email.equalsIgnoreCase(this.confirmaEmail)) {
            context.addMessage(
                    null,
                    new FacesMessage(
                            FacesMessage.SEVERITY_ERROR,
                            "Email confirmado incorretamente.",
                            ""
                    )
            );
            return "reciclador";

        }

        return "sucesso";

    }

    public String cadastrarReciclador() {
        return "cadastroReciclador";
    }
}
