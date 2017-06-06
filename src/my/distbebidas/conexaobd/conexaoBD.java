package my.distbebidas.conexaobd;
import my.distbebidas.FornecedorDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import my.distbebidas.TelaCadastroFornecedor;
import my.distbebidas.EntradaInvalidaException;
import my.distbebidas.ComprasDAO;
import my.distbebidas.VendasDAO;
import my.distbebidas.ClienteDAO;
import my.distbebidas.EstoqueDAO;

public class conexaoBD {
    Connection conexao;
    private Statement state;
    
    public Connection getConnection(){
        try{
            conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres" ,"postgres");
            return conexao;
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    /*Desconecta do BD*/
    public void desconBD(){
        try{
            conexao.close();
            System.out.println("Conexão finalizada com sucesso");
        }
        catch(Exception ex){
            System.out.println("Erro ao desconectar: "+ex.getMessage());
        }
    }
    
    public void insereDadosFornecedor(FornecedorDAO f) throws SQLException, EntradaInvalidaException{
        getConnection();
        state = conexao.createStatement();
        
        state.executeUpdate("INSERT INTO FORNECEDOR (CNPJ,INSCRICAO_ESTADUAL,RAZAO_SOCIAL,NOME_FANTASIA,ENDERECO,BAIRRO,CEP,CIDADE,UF,EMAIL,TELEFONE,CELULAR)"
                    + "VALUES ('"+f.getCnpj()+"','"+f.getInscricaoestadual()+"','"+f.getRazaosocial()+"','"+f.getNomefantasia()+"','"+f.getEndereco()+"','"+f.getBairro()+"','"+f.getCep()+"',"
                    + "'"+f.getCidade()+"','"+f.getUf()+"','"+f.getEmail()+"','"+f.getTelefone()+"','"+f.getCelular()+"');");

        desconBD();
    }
    
   
    public void insereDadosCliente(ClienteDAO c) throws SQLException, EntradaInvalidaException{
        getConnection();
        state = conexao.createStatement();
        
        state.executeUpdate("INSERT INTO CLIENTE (CNPJ,INSCRICAO_ESTADUAL,NOME_CLIENTE,ENDERECO,BAIRRO,CEP,CIDADE,UF,EMAIL,TELEFONE,CELULAR)"
                    + "VALUES ('"+c.getCnpj()+"','"+c.getInscricaoestadual()+"','"+c.getNome()+"','"+c.getEndereco()+"','"+c.getBairro()+"','"+c.getCep()+"',"
                    + "'"+c.getCidade()+"','"+c.getUf()+"','"+c.getEmail()+"','"+c.getTelefone()+"','"+c.getCelular()+"');");

        desconBD();
    }
     
     public void insereDadosCompras(ComprasDAO co) throws SQLException, EntradaInvalidaException{
        getConnection();
        state = conexao.createStatement();
        
        state.executeUpdate("INSERT INTO COMPRAS (ID, NOME_PRODUTO,QUANTIDADE, DATA, RAZAO_EMPRESA)"
                    + "VALUES ('"+co.getIdcompra()+"','"+co.getNomeproduto()+"','"+co.getQuantidade()+"','"+co.getData()+"','"+co.getRazaosocial()+"');");

        desconBD();
    }
    
    public void insereDadosVendas(VendasDAO ven) throws SQLException, EntradaInvalidaException{
        getConnection();
        state = conexao.createStatement();
        
        state.executeUpdate("INSERT INTO VENDAS (ID, NOME_PRODUTO, QUANTIDADE, DATA, NOME_CLIENTE, CNPJ_CLIENTE)"
                    + "VALUES ('"+ven.getIdpedido()+"','"+ven.getNomeproduto()+"','"+ven.getQuantidade()+"','"+ven.getData()+"','"+ven.getNomecliente()+"','"+ven.getCnpjcliente()+"');");

        desconBD();
    }
    public List<EstoqueDAO> consultaTodos() throws SQLException{
        
    List<EstoqueDAO> est = new ArrayList<>();
        getConnection();
        
        try (PreparedStatement pstm = conexao.prepareStatement("select cod_produto, nome_produto, qnt_produto, preco_produto_compra, preco_produto_venda, validade_produto from ESTOQUE")) {
            ResultSet rs = pstm.executeQuery();
           
            while(rs.next()){              
                EstoqueDAO e = new EstoqueDAO();
                
                e.setCod_produto(rs.getInt("cod_produto"));
                e.setNome_produto(rs.getString("nome_produto"));
                e.setQnt_produto(rs.getInt("qnt_produto"));
                e.setPreco_produto_compra(rs.getFloat("preco_produto_compra"));
                e.setPreco_produto_venda(rs.getFloat("preco_produto_venda"));
                e.setValidade_produto(rs.getDate("validade_produto"));
                
            est.add(e);
            }   
        }
        
       desconBD();
        
       return est; 
        
    }
        public List<EstoqueDAO> consultaEspec(String nome) throws SQLException{
        
        List<EstoqueDAO> est = new ArrayList<>();
        getConnection();
        
        try (PreparedStatement pstm = conexao.prepareStatement("select cod_produto, nome_produto, qnt_produto, preco_produto_compra, preco_produto_venda, validade_produto from ESTOQUE where nome_produto like '%"+nome+"%'")) {
            ResultSet rs = pstm.executeQuery();
           
            while(rs.next()){              
                EstoqueDAO e = new EstoqueDAO();
                
                e.setCod_produto(rs.getInt("cod_produto"));
                e.setNome_produto(rs.getString("nome_produto"));
                e.setQnt_produto(rs.getInt("qnt_produto"));
                e.setPreco_produto_compra(rs.getFloat("preco_produto_compra"));
                e.setPreco_produto_venda(rs.getFloat("preco_produto_venda"));
                e.setValidade_produto(rs.getDate("validade_produto"));
                
            est.add(e);
            }   
        }
        
       desconBD();
        
       return est; 
        }
        
         public void atualizaQnt(int cod_produto, int qnt_produto) throws SQLException, EntradaInvalidaException{
             getConnection();
             state = conexao.createStatement();
 
            state.executeUpdate("update ESTOQUE set qnt_produto= "+qnt_produto+" where cod_produto= "+cod_produto+";");
            desconBD();
         }
        
        public boolean excluirProduto(int codigo) throws SQLException{
        getConnection();
        state = conexao.createStatement();
        state.executeUpdate("delete from ESTOQUE where cod_produto = '"+codigo+"'");
        desconBD(); 
        return true;
    }
        
    public List<ClienteDAO> consulTodosCli() throws SQLException{
        
    List<ClienteDAO> clis = new ArrayList<>();
        getConnection();
        
        try (PreparedStatement pstm = conexao.prepareStatement("select nome_cliente, cnpj, cidade, bairro from cliente")) {
            ResultSet rs = pstm.executeQuery();
           
            while(rs.next()){              
                ClienteDAO cli = new ClienteDAO();
                
                cli.setNome(rs.getString("nome_cliente"));
                cli.setCnpj(rs.getString("cnpj"));
                cli.setCidade(rs.getString("cidade"));
                cli.setBairro(rs.getString("bairro"));
                
                
            clis.add(cli);
            }   
        }
        
       desconBD();
        
       return clis; 
        
    }
    
    public List<ClienteDAO> consultaEspecCliente(String nome) throws SQLException{
        
        List<ClienteDAO> clis = new ArrayList<>();
        getConnection();
        
        try (PreparedStatement pstm = conexao.prepareStatement("select nome_cliente, cnpj, cidade, bairro from cliente where nome_produto like '%"+nome+"%'")) {
            ResultSet rs = pstm.executeQuery();
           
            while(rs.next()){              
                ClienteDAO cli = new ClienteDAO();
                
                cli.setNome(rs.getString("nome_cliente"));
                cli.setCnpj(rs.getString("cnpj"));
                cli.setCidade(rs.getString("cidade"));
                cli.setBairro(rs.getString("bairro"));
                
            clis.add(cli);
            }   
        }
        
       desconBD();
        
       return clis; 
        }
       
}
    


