/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.distbebidas;

import java.sql.Date;



/**
 *
 * @author Avell
 */
public class EstoqueDAO {
    private int cod_produto;
    private String nome_produto;
    private int qnt_produto;
    private float preco_produto_compra;
    private float preco_produto_venda;
    private Date validade_produto;

    public EstoqueDAO(int cod_produto, String nome_produto, int qnt_produto, float preco_produto_compra, float preco_produto_venda, Date validade_produto){
        this.cod_produto=cod_produto;
        this.nome_produto=nome_produto;
        this.qnt_produto=qnt_produto;
        this.preco_produto_compra=preco_produto_compra;
        this.preco_produto_venda=preco_produto_venda;
        this.validade_produto=validade_produto;
    }
    
    public EstoqueDAO(){
    }
    
    /**
     * @return the cod_produto
     */
    public int getCod_produto() {
        return cod_produto;
    }

    /**
     * @param cod_produto the cod_produto to set
     */
    public void setCod_produto(int cod_produto) {
        this.cod_produto = cod_produto;
    }

    /**
     * @return the nome_produto
     */
    public String getNome_produto() {
        return nome_produto;
    }

    /**
     * @param nome_produto the nome_produto to set
     */
    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    /**
     * @return the qnt_produto
     */
    public int getQnt_produto() {
        return qnt_produto;
    }

    /**
     * @param qnt_produto the qnt_produto to set
     */
    public void setQnt_produto(int qnt_produto) {
        this.qnt_produto = qnt_produto;
    }

    /**
     * @return the preco_produto_compra
     */
    public float getPreco_produto_compra() {
        return preco_produto_compra;
    }

    /**
     * @param preco_produto_compra the preco_produto_compra to set
     */
    public void setPreco_produto_compra(float preco_produto_compra) {
        this.preco_produto_compra = preco_produto_compra;
    }

    /**
     * @return the preco_produto_venda
     */
    public float getPreco_produto_venda() {
        return preco_produto_venda;
    }

    /**
     * @param preco_produto_venda the preco_produto_venda to set
     */
    public void setPreco_produto_venda(float preco_produto_venda) {
        this.preco_produto_venda = preco_produto_venda;
    }

    /**
     * @return the validade_produto
     */
    public Date getValidade_produto() {
        return validade_produto;
    }

    /**
     * @param validade_produto the validade_produto to set
     */
    public void setValidade_produto(Date validade_produto) {
        this.validade_produto = validade_produto;
    }
    
    
}
