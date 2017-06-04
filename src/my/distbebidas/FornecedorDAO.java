package my.distbebidas;
import java.sql.SQLException;
import my.distbebidas.conexaobd.conexaoBD;

public class FornecedorDAO {
    private String cnpj;
    private String inscricaoestadual;
    private String razaosocial;
    private String nomefantasia;
    private String endereco;
    private String bairro;
    private String cep;
    private String cidade;
    private String email;
    private String telefone;
    private String celular;
    private String uf;

    public FornecedorDAO(String cnpj, String inscricaoestadual, String razaosocial, String nomefantasia, String endereco,
            String bairro, String cep, String cidade, String email, String telefone, String celular, String uf) {
        this.cnpj = cnpj;
        this.inscricaoestadual = inscricaoestadual;
        this.razaosocial = razaosocial;
        this.nomefantasia = nomefantasia;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.email = email;
        this.telefone = telefone;
        this.celular = celular;
        this.uf = uf;
    }
    
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setInscricaoestadual(String inscricaoestadual) {
        this.inscricaoestadual = inscricaoestadual;
    }

    public void setRazaosocial(String razaosocial) {
        this.razaosocial = razaosocial;
    }

    public void setNomefantasia(String nomefantasia) {
        this.nomefantasia = nomefantasia;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getInscricaoestadual() {
        return inscricaoestadual;
    }

    public String getRazaosocial() {
        return razaosocial;
    }

    public String getNomefantasia() {
        return nomefantasia;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCep() {
        return cep;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }
    
    public String getCelular() {
        return celular;
    }

    public String getUf() {
        return uf;
    }
    
    public FornecedorDAO(){
        /*Para usar nos testes*/
    }
    
        public boolean insereFornecedor() /*throws EntradaInvalidaException, SQLException*/{
        conexaoBD conexao = new conexaoBD();
         
        try{
            conexao.insereDadosFornecedor(this);
            return true;
        }
        catch(Exception ex){
            /*throw new EntradaInvalidaException(""+ex);*/
            System.out.println("Houve um problema ao inserir. Erro: "+ex);
            return false;
        }
    }
        
}
