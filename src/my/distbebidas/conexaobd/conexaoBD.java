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
}
    


