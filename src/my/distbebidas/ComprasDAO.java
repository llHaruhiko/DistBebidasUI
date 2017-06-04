package my.distbebidas;
import java.sql.SQLException;
import my.distbebidas.conexaobd.conexaoBD;

public class ComprasDAO{
    private int idcompra;
    private String nomeproduto;
    private int quantidade;
    private String data;

    public ComprasDAO(int idcompra, String nomeproduto, int quantidade, String data){
        this.idcompra = idcompra;
        this.nomeproduto = nomeproduto;
        this.quantidade = quantidade;
        this.data = data;
    }

    ComprasDAO(String id, String nome, String produto, String data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     public void setIdcompra(int idcompra) {
        this.idcompra = idcompra;
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
    
    public int getIdcompra(){
        return idcompra;
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
    
    public String getRazaosocial(){
        FornecedorDAO f = new FornecedorDAO();
        return f.getRazaosocial();
    }
    
    public ComprasDAO(){
    }
    
        public boolean insereCompras() /*throws EntradaInvalidaException, SQLException*/{
        conexaoBD conexao = new conexaoBD();
         
        try{
            conexao.insereDadosCompras(this);
            return true;
        }
        catch(Exception ex){
            /*throw new EntradaInvalidaException(""+ex);*/
            System.out.println("Houve um problema ao inserir. Erro: "+ex);
            return false;
        }
    }
    
}
   
