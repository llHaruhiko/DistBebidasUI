package my.distbebidas;
import java.sql.SQLException;
import my.distbebidas.conexaobd.conexaoBD;

public class ClienteDAO {
    private String cnpj;
    private String inscricaoestadual;
    private String nome;
    private String endereco;
    private String bairro;
    private String cep;
    private String cidade;
    private String email;
    private String telefone;
    private String celular;
    private String uf;
    
    

    public ClienteDAO(String nome, String cnpj, String inscricaoestadual, String endereco, String bairro, String cep, String cidade, String email, String telefone, String celular, String uf) {
        this.cnpj = cnpj;
        this.inscricaoestadual = inscricaoestadual;
        this.nome = nome;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.email = email;
        this.telefone = telefone;
        this.celular = celular;
        this.uf = uf;	
    }

   




    public ClienteDAO(){
    }
    
        /*Utilizado nos testes (retorna true/false para realizar as comparações)*/
    public int insereCliente(){
        conexaoBD conexao = new conexaoBD();
         
        try{
            conexao.insereDadosCliente(this);
            return 1;
        }
        catch(Exception ex){
            //throw new EntradaInvalidaException(""+ex);
            System.out.println("Houve um problema ao inserir. Erro: "+ex);
            return 0;
        }
    }

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return the inscricaoestadual
     */
    public String getInscricaoestadual() {
        return inscricaoestadual;
    }

    /**
     * @param inscricaoestadual the inscricaoestadual to set
     */
    public void setInscricaoestadual(String inscricaoestadual) {
        this.inscricaoestadual = inscricaoestadual;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * @return the uf
     */
    public String getUf() {
        return uf;
    }

    /**
     * @param uf the uf to set
     */
    public void setUf(String uf) {
        this.uf = uf;
    }
}
    

