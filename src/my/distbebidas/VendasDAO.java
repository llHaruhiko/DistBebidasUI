package my.distbebidas;
import java.sql.SQLException;
import my.distbebidas.conexaobd.conexaoBD;

public class VendasDAO{
    private int idpedido;
    private String nomeproduto;
    private int quantidade;
    private String data;

    public VendasDAO(int idpedido, String nomeproduto, int quantidade, String data){
        this.idpedido = idpedido;
        this.nomeproduto = nomeproduto;
        this.quantidade = quantidade;
        this.data = data;
    }

    VendasDAO(String id, String nome, String produto, String data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     public void setIdpedido(int idpedido) {
        this.idpedido = idpedido;
    }
    
    public void setNomeproduto(String nomeproduto) {
        this.nomeproduto = nomeproduto;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    public int getIdpedido(){
        return idpedido;
    }
    
    public String getNomeproduto(){
        return nomeproduto;
    }
    
    public int getQuantidade(){
        return quantidade;
    }
    
    public String getData(){
        return data;
    }
    
    public String getNomecliente(){
        ClienteDAO cl = new ClienteDAO();
        return cl.getNome();
    }
    
    public String getCnpjcliente(){
        ClienteDAO cl = new ClienteDAO();
        return cl.getCnpj();
    }
    
    public VendasDAO(){
    }
    
        public boolean insereVendas() /*throws EntradaInvalidaException, SQLException*/{
        conexaoBD conexao = new conexaoBD();
         
        try{
            conexao.insereDadosVendas(this);
            return true;
        }
        catch(Exception ex){
            /*throw new EntradaInvalidaException(""+ex);*/
            System.out.println("Houve um problema ao inserir. Erro: "+ex);
            return false;
        }
    }
    
}
   
