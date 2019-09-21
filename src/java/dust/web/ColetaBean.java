/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dust.web;

/**
 *
 * @author leonardoamurca
 */
public class ColetaBean {

    private double quantidade;
    private String descricao;

    public double getQuantidade() {
        return quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String cadastrarColeta() {
        return "cadastroColeta";
    }

    public String salvar() {
        return "sucessoColeta";
    }

}
