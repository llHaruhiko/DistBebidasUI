import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import my.distbebidas.ClienteDAO;
import my.distbebidas.FornecedorDAO;

public class PigLatinTest {
   
    
    public PigLatinTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
   
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    //Sprint 1
    
        @Test
	public void test1(){ //Nome Fantasia Valido
		FornecedorDAO f = new FornecedorDAO();
         
                f.setNomefantasia("Coca Cola");
		assertEquals(0,f.insereFornecedor());
	}
	
	@Test
	public void test2(){ //CNPJ Valido
		FornecedorDAO f = new FornecedorDAO();
         
                f.setCnpj("11.111.111 /1132311-11");
		assertEquals(0,f.insereFornecedor());
	}
	
	@Test
	public void test3(){ //Inscricao Estadual Valido
		FornecedorDAO f = new FornecedorDAO();
         
                f.setInscricaoestadual("388.108.598.269");
		assertEquals(0,f.insereFornecedor());
	}
	
	@Test
	public void test4(){ //Razao Social
		FornecedorDAO f = new FornecedorDAO();
         
                f.setRazaosocial("Coca-Cola LTDA");
		assertEquals(0,f.insereFornecedor());
	}
        
        @Test
	public void test6(){ //Endereco Valido
		FornecedorDAO f = new FornecedorDAO();
         
                f.setEndereco("Rua 9");
		assertEquals(0,f.insereFornecedor());
	}
	
	@Test
	public void test7(){ //Bairro Valido
		FornecedorDAO f = new FornecedorDAO();
         
                f.setBairro("Vila Maria");
		assertEquals(0,f.insereFornecedor());
	}
	
	@Test
	public void test8(){ //CEP Valido
		FornecedorDAO f = new FornecedorDAO();
         
                f.setCep("15800000");
		assertEquals(0,f.insereFornecedor());
	}
	
	@Test
	public void test9(){ //Cidade Valido
		FornecedorDAO f = new FornecedorDAO();
         
                f.setCidade("Rio de Janeiro");
		assertEquals(0,f.insereFornecedor());
	}
	
	@Test
	public void test10(){ //Email Valido
		FornecedorDAO f = new FornecedorDAO();
         
                f.setEmail("cocacola@hotmail.com");
		assertEquals(0,f.insereFornecedor());
	}
        
        @Test
	public void test11(){ //Telefone Valido
		FornecedorDAO f = new FornecedorDAO();
         
                f.setTelefone("(34)9434-7324");
		assertEquals(0,f.insereFornecedor());
	}
        
        @Test
	public void test12(){ //Celular Valido
		FornecedorDAO f = new FornecedorDAO();
         
                f.setCelular("(11)8734-7324");
		assertEquals(0,f.insereFornecedor());
	}
        
        @Test
	public void test13(){ //UF Valido
		FornecedorDAO f = new FornecedorDAO();
         
                f.setUf("RJ");
		assertEquals(0,f.insereFornecedor());
	}
        	
	//Sprint 2
	
	@Test
	public void test14(){ //Nome Valido
		ClienteDAO c = new ClienteDAO();
         
                c.setNome("Marcos Souza");
		assertEquals(0,c.insereCliente());
	}
	
        
        @Test
	public void test15(){ //Nome Valido
		ClienteDAO c = new ClienteDAO();
         
                c.setCnpj("11.111.111 /1132311-11");
		assertEquals(0,c.insereCliente());
	}
    
        @Test
	public void test16(){ //Nome Valido
		ClienteDAO c = new ClienteDAO();
         
                c.setEndereco("Rua dos palmares");
		assertEquals(0,c.insereCliente());
	}
	
	@Test
	public void test17(){ //Nome Valido
		ClienteDAO c = new ClienteDAO();
         
                c.setBairro("Jardim Primavera");
		assertEquals(0,c.insereCliente());
	}
	
	@Test
	public void test18(){ //Nome Valido
		ClienteDAO c = new ClienteDAO();
         
                c.setCep("11913403");
		assertEquals(0,c.insereCliente());
	}
	
	@Test
	public void test19(){ //Nome Valido
		ClienteDAO c = new ClienteDAO();
         
                c.setCidade("São Paulo");
		assertEquals(0,c.insereCliente());
	}
	
	@Test
	public void test20(){ //Nome Valido
		ClienteDAO c = new ClienteDAO();
         
                c.setEmail("cocacola@hotmail.com");
		assertEquals(0,c.insereCliente());
	}
	
	@Test
	public void test21(){ //Nome Valido
		ClienteDAO c = new ClienteDAO();
         
                c.setTelefone("3456-8790");
		assertEquals(0,c.insereCliente());
	}
	
	@Test
	public void test22(){ //Nome Valido
		ClienteDAO c = new ClienteDAO();
         
                c.setCelular("9785-9876");
		assertEquals(0,c.insereCliente());
	}
	
	@Test
	public void test23(){ //Nome Valido
		ClienteDAO c = new ClienteDAO();
         
                c.setUf("SP");
		assertEquals(0,c.insereCliente());
	}
	
	@Test
	public void test24(){ //Nome Valido
		ClienteDAO c = new ClienteDAO();
         
                c.setUf("SP");
		assertEquals(0,c.insereCliente());
	}
	
	@Test
	public void test25(){ //Nome Valido
		ClienteDAO c = new ClienteDAO();
         
                c.setInscricaoestadual("388.108.598.269");
		assertEquals(0,c.insereCliente());
	}
}
