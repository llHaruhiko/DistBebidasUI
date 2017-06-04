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
import my.distbebidas.ClienteDAO;
import my.distbebidas.ComprasDAO;
import my.distbebidas.VendasDAO;
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
        
    List<EstoqueDAO> clis = new ArrayList<>();
        getConnection();
        
        try (PreparedStatement pstm = conexao.prepareStatement("select cod_produto, nome_produto, qnt_produto, preco_produto_compra, preco_produto_venda, validade_produto from ESTOQUE")) {
            ResultSet rs = pstm.executeQuery();
           
            while(rs.next()){              
                EstoqueDAO est = new EstoqueDAO();
                
                est.setCod_produto(rs.getInt("cod_produto"));
                est.setNome_produto(rs.getString("nome_produto"));
                est.setQnt_produto(rs.getInt("qnt_produto"));
                est.setPreco_produto_compra(rs.getFloat("preco_produto_compra"));
                est.setPreco_produto_venda(rs.getFloat("preco_produto_venda"));
                est.setValidade_produto(rs.getDate("validade_produto"));
                
            clis.add(est);
            }   
        }
        
       desconBD();
        
       return clis; 
        
    }
    
}
    


