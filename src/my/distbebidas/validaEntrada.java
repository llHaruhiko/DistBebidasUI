/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.distbebidas;

import my.distbebidas.EntradaInvalidaException;

/**
 *
 * @author AVELL
 */
public class validaEntrada {
    
    public void valida_entrada(String nome, String cnpj,String inscricao_estadual,String endereco, String bairro, String cep, String cidade, String email, String telefone, String celular, String uf) throws EntradaInvalidaException{
        validaNomeFantasia(nome);
        validaCNPJ(cnpj);
        validaRua(endereco);
        validaBairro(bairro);
        validaCep(cep);
        validaCidade(cidade);
        validaEmail(email);
        validaTelefone(telefone);
        validaTelefone(celular);
        validaInscricao_estadual(inscricao_estadual);
        validaUf(uf);
        
    }
    
     public boolean validaUf(String uf) throws EntradaInvalidaException{
        if(uf.matches("[a-zA-z0-9áéíóú\\-\\.\\/]{2,}(\\s[a-zA-z0-9áéíóú\\-\\.\\/]{2,})*")){
            return true;
        }else{
            throw new EntradaInvalidaException("uf Inválido!");
        }
    }
    
     public boolean validaInscricao_estadual(String inscricao_estadual) throws EntradaInvalidaException{
        if(inscricao_estadual.matches("[a-zA-z0-9áéíóú\\-\\.\\/]{2,}(\\s[a-zA-z0-9áéíóú\\-\\.\\/]{2,})*")){
            return true;
        }else{
            throw new EntradaInvalidaException("Inscricao Inválida!");
        }
    }
    
    public boolean validaEmail(String email) throws EntradaInvalidaException{
        if(email.matches("[a-zA-z0-9áéíóú\\-\\.\\/]{2,}(\\s[a-zA-z0-9áéíóú\\-\\.\\/]{2,})*")){
            return true;
        }else{
            throw new EntradaInvalidaException("email Inválido!");
        }
    }
    
    public boolean validaCNPJ(String cnpj) throws EntradaInvalidaException{
    
        if(cnpj.matches("[0-9]{2}\\.[0-9]{3}\\.[0-9]{3}\\/[0-9]{4}\\-[0-9]{2}")){
            return true;
        }else{
            throw new EntradaInvalidaException("CNPJ Inválido!");
        }
    }
    
    public boolean validaNomeFantasia(String nf) throws EntradaInvalidaException{
        
        if(nf.matches("[a-zA-z0-9áéíóú\\-\\.\\/]{2,}(\\s[a-zA-z0-9áéíóú\\-\\.\\/]{2,})*")){
            return true;
        }else{
            throw new EntradaInvalidaException("Nome Fantasia inválido!");
        }
    }
    
    public boolean validaRazaoSocial(String rs) throws EntradaInvalidaException{
        
        if(rs.matches("[a-zA-záéíóú\\-\\.\\/]{2,}(\\s[a-zA-záéíóú\\-\\.\\/]{2,})*")){
            return true;
        }else{
            throw new EntradaInvalidaException("Razão social inválido!");
        }
    }
    
    public boolean validaInscEst(String ie) throws EntradaInvalidaException{
        
        if(ie.matches("[0-9]{9,14}")){
            return true;
        }else{
            throw new EntradaInvalidaException("Inscrição Estadual inválida (digite somente números)");
        }
    }
    
    public boolean validaRua(String rua) throws EntradaInvalidaException{
        
        if(rua.matches("[a-zA-z0-9áéíóú]{2,}\\.?(\\s[a-zA-z0-9áéíóú]+)*")){
            return true;
        }else{
            throw new EntradaInvalidaException("Rua inválida");
        }
    }
    
    public boolean validaNumRua(String nRua) throws EntradaInvalidaException{
        
        if(nRua.matches("([a-zA-Z]{1})?[0-9]{1,4}([a-zA-Z]{1})?")){ //Pode ser somente número ou A1111 ou 1111B por exemplo.
            return true;
        }else{
            throw new EntradaInvalidaException("Número do endereço inválido!");
        }
    }
    
    public boolean validaBairro(String rua) throws EntradaInvalidaException{
        
        if(rua.matches("[a-zA-z]{2,}\\.?(\\s[a-zA-z]{2,})*")){
            return true;
        }else{
            throw new EntradaInvalidaException("Bairro inválido!");
        }
    }
    
    public boolean validaCep(String cep) throws EntradaInvalidaException{
        
        if(cep.matches("[0-9]{5}\\-[0-9]{3}")){
            return true;
        }else{
            throw new EntradaInvalidaException("CEP inválido!");
        }
    }
    
    public boolean validaCidade(String cid) throws EntradaInvalidaException{
        
        if(cid.matches("[a-zA-záéíóúãõ]{2,}(\\s[a-zA-záéíóúãõ]{2,})*")){
            return true;
        }else{
            throw new EntradaInvalidaException("Cidade inválida!");
        }
    }
    
    public boolean validaTelefone(String tel) throws EntradaInvalidaException{
        
        if(tel.matches("\\([1-9]{2}\\)[0-9]{4}\\-[0-9]{4}")){
            return true;
        }else{
            throw new EntradaInvalidaException("Telefone inválido!");
        }
    }
    
    /*
    public boolean validaEstado(String est) throws EntradaInvalidaException{
        
        if(est.matches("[RS]|[SC]|[PR]|[SP]|[MG]|[RJ]|[ES]|[BA]|[SE]|[AL]|[PE]|"
                + "[PB]|[RN]|[PI]|[MA]|[CE]|[GO]|[TO]|[MT]|[MS]|[DF]|[AM]|[AC]|"
                + "[PA]|[RO]|[RR]|[AP]")){
            return true;
        }else{
            throw new EntradaInvalidaException("Verifique o Estado!");
        }
    }    
    */
}
