import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

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
    public void test1(){ //CNPJ Válido
        Fornecedor f = new fornecedorDAO();
        assertEquals(true, f.insereFornecedor(f.fornecedorDAO(11.111.111/1111-11, inscricaoestadual, razaosocial, nomefantasia, endereco, bairro, cep, cidade, email, telefone, celular, uf)));      
    }
	
	@Test
	public void test2(){ //CNPJ Inválido
		Fornecedor f = new fornecedorDAO();
		assertEquals(false, f.insereFornecedor(f.fornecedorDAO(23.2 2.3 3/2111-1, inscricaoestadual, razaosocial, nomefantasia, endereco, bairro, cep, cidade, email, telefone, celular, uf)));
	}
	
	@Test
	public void test3(){ //IE Válida
		Fornecedor f = new fornecedorDAO();
		assertEquals(true, f.insereFornecedor(f.fornecedorDAO(cnpj, 0321418-40, razaosocial, nomefantasia, endereco, bairro, cep, cidade, email, telefone, celular, uf)));
	}
	
	@Test
	public void test4(){ //IE Inválida
		Fornecedor f = new fornecedorDAO();
		assertEquals(false, f.insereFornecedor(f.fornecedorDAO(cnpj, 0354418-8, razaosocial, nomefantasia, endereco, bairro, cep, cidade, email, telefone, celular, uf)));		
	}
	
	@Test
	public void test5(){ //Razão Social Válida
		Fornecedor f = new fornecedorDAO();
		assertEquals(true, f.insereFornecedor(f.fornecedorDAO(cnpj, 0354418-8, Peças&Serviços LTDA, nomefantasia, endereco, bairro, cep, cidade, email, telefone, celular, uf)));
	}
	
	@Test
	public void test6(){ //Razão Social Invalida
		Fornecedor f = new fornecedorDAO();
		assertEquals(false, f.insereFornecedor(f.fornecedorDAO(cnpj, 0354418-8, Peçaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaas&Serviço, nomefantasia, endereco, bairro, cep, cidade, email, telefone, celular, uf)));
	}
	
	@Test
	public void test7(){ //Razão Social Inválida - Já Existente
		Fornecedor f = new fornecedorDAO();
		assertEquals(false, f.insereFornecedor(f.fornecedorDAO(cnpj, 0354418-8, Coca-Cola Indústrias Ltda, nomefantasia, endereco, bairro, cep, cidade, email, telefone, celular, uf)));
	}
	
	@Test
	public void test8(){ //Nome Fantasia Valido
		Fornecedor f = new fornecedorDAO();
		assertEquals(true, f.insereFornecedor(f.fornecedorDAO(cnpj, inscricaoestadual, razaosocial, Peças&Serviços do Marcão, endereco, bairro, cep, cidade, email, telefone, celular, uf)));
	}
	
	@Test
	public void test9(){ //Nome Fantasia Invalido - Marca Registrada
		Fornecedor f = new fornecedorDAO();
		assertEquals(false, f.insereFornecedor(f.fornecedorDAO(cnpj, inscricaoestadual, razaosocial, Coca-Cola, endereco, bairro, cep, cidade, email, telefone, celular, uf)));
	}
	
	@Test
	public void test10(){ //Nome Fantasia Invalido
		Fornecedor f = new fornecedorDAO();
		assertEquals(false, f.insereFornecedor(f.fornecedorDAO(cnpj, inscricaoestadual, razaosocial, Peçaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaas, endereco, bairro, cep, cidade, email, telefone, celular, uf)));
	}
	
	@Test
	public void test11(){ //Endereço Valido
		Fornecedor f = new fornecedorDAO();
		assertEquals(true, f.insereFornecedor(f.fornecedorDAO(cnpj, inscricaoestadual, razaosocial, nomefantasia, Rua Treze, bairro, cep, cidade, email, telefone, celular, uf)));
	}
	
	@Test
	public void test12(){ //Endereço Invalido
		Fornecedor f = new fornecedorDAO();
		assertEquals(false, f.insereFornecedor(f.fornecedorDAO(cnpj, inscricaoestadual, razaosocial, nomefantasia, Ruatrezejuntocomaesquina10pertodoaeroportodefrentecomumpostodegasolinanaesquinadohospital , bairro, cep, cidade, email, telefone, celular, uf)));
	}
	
	@Test
	public void test13(){ //Bairro Valido
		Fornecedor f = new fornecedorDAO();
		assertEquals(true, f.insereFornecedor(f.fornecedorDAO(cnpj, inscricaoestadual, razaosocial, nomefantasia, endereco, Jd. Castelo, cep, cidade, email, telefone, celular, uf)));
	}
	
	@Test
	public void test14(){ //Bairro Invalido
		Fornecedor f = new fornecedorDAO();
		assertEquals(false, f.insereFornecedor(f.fornecedorDAO(cnpj, inscricaoestadual, razaosocial, nomefantasia, endereco, Jd.Estadosunidosjuntocomobairrovilaolimpia, cep, cidade, email, telefone, celular, uf)));
	}
	
	@Test
	public void test15(){ //CEP Valido
		Fornecedor f = new fornecedorDAO();
		assertEquals(true, f.insereFornecedor(f.fornecedorDAO(cnpj, inscricaoestadual, razaosocial, nomefantasia, endereco, bairro, 15703-304, cidade, email, telefone, celular, uf)));
	}
	
	@Test
	public void test16(){ //CEP Invalido
		Fornecedor f = new fornecedorDAO();
		assertEquals(false, f.insereFornecedor(f.fornecedorDAO(cnpj, inscricaoestadual, razaosocial, nomefantasia, endereco, bairro, 16789-098, cidade, email, telefone, celular, uf)));
	}
	
	@Test
	public void test17(){ //Cidade Valida
		Fornecedor f = new fornecedorDAO();
		assertEquals(true, f.insereFornecedor(f.fornecedorDAO(cnpj, inscricaoestadual, razaosocial, nomefantasia, endereco, bairro, cep, Jales, email, telefone, celular, uf)));
	}
	
	@Test
	public void test18(){ //Cidade Invalida
		Fornecedor f = new fornecedorDAO();
		assertEquals(false, f.insereFornecedor(f.fornecedorDAO(cnpj, inscricaoestadual, razaosocial, nomefantasia, endereco, bairro, cep, Jalesfernandopolissaojosedoriopretoitapetiningacorneliprocopio, email, telefone, celular, uf)));
	}
	
	@Test
	public void test19(){ //Cidade Inexistente
		Fornecedor f = new fornecedorDAO();
		assertEquals(false, f.insereFornecedor(f.fornecedorDAO(cnpj, inscricaoestadual, razaosocial, nomefantasia, endereco, bairro, cep, Santa Pedra, email, telefone, celular, uf)));
	}
	
	@Test
	public void test20(){ //Email Valido
		Fornecedor f = new fornecedorDAO();
		assertEquals(true, f.insereFornecedor(f.fornecedorDAO(cnpj, inscricaoestadual, razaosocial, nomefantasia, endereco, bairro, cep, cidade, pedro_silva@hotmail.com, telefone, celular, uf)));
	}
	
	@Test
	public void test21(){ //Email Invalido
		Fornecedor f = new fornecedorDAO();
		assertEquals(false, f.insereFornecedor(f.fornecedorDAO(cnpj, inscricaoestadual, razaosocial, nomefantasia, endereco, bairro, cep, cidade, pedrooooooooooooooooooooooooooooooooooooooo_silva@hotmail.com, telefone, celular, uf)));
	}
	
	@Test
	public void test22(){ //Email Inexistente
		Fornecedor f = new fornecedorDAO();
		assertEquals(false, f.insereFornecedor(f.fornecedorDAO(cnpj, inscricaoestadual, razaosocial, nomefantasia, endereco, bairro, cep, cidade, pedro123_silva1324232@hotmail.com, telefone, celular, uf)));
	}
	
	@Test
	public void test23(){ //Telefone Valido
		Fornecedor f = new fornecedorDAO();
		assertEquals(true, f.insereFornecedor(f.fornecedorDAO(cnpj, inscricaoestadual, razaosocial, nomefantasia, endereco, bairro, cep, cidade, email, (17)36671302, celular, uf)));
	}
	
	@Test
	public void test24(){ //Telefone Invalido
		Fornecedor f = new fornecedorDAO();
		assertEquals(false, f.insereFornecedor(f.fornecedorDAO(cnpj, inscricaoestadual, razaosocial, nomefantasia, endereco, bairro, cep, cidade, email, (11)998576452, celular, uf)));
	}
	
	@Test
	public void test25(){ //Celular Valido
		Fornecedor f = new fornecedorDAO();
		assertEquals(true, f.insereFornecedor(f.fornecedorDAO(cnpj, inscricaoestadual, razaosocial, nomefantasia, endereco, bairro, cep, cidade, email, telefone, (17)991499602, uf)));
	}
	
	@Test
	public void test26(){ //Celular Invalido
		Fornecedor f = new fornecedorDAO();
		assertEquals(false, f.insereFornecedor(f.fornecedorDAO(cnpj, inscricaoestadual, razaosocial, nomefantasia, endereco, bairro, cep, cidade, email, telefone, (21)32456877, uf)));
	}
	
	@Test
	public void test27(){ //UF Valido
		Fornecedor f = new fornecedorDAO();
		assertEquals(true, f.insereFornecedor(f.fornecedorDAO(cnpj, inscricaoestadual, razaosocial, nomefantasia, endereco, bairro, cep, cidade, email, telefone, celular, SP)));
	}
	
	@Test
	public void test28(){ //UF Invalido
		Fornecedor f = new fornecedorDAO();
		assertEquals(false, f.insereFornecedor(f.fornecedorDAO(cnpj, inscricaoestadual, razaosocial, nomefantasia, endereco, bairro, cep, cidade, email, telefone, celular, GC)));
	}
	
	//Sprint 2
	
	@Test
	public void test29(){ //Nome Valido
		Cliente c = new clienteDAO();
		assertEquals(true, c.insereCliente(c.clienteDAO(João da Silva, cnpj, endereco, bairro, cep, cidade, email, telefone, celular, uf, pagamento)));
	}
	
	@Test
	public void test30(){ //Nome Invalido
		Cliente c = new clienteDAO();
		assertEquals(false, c.insereCliente(c.clienteDAO(Jo4o Maria, cnpj, endereco, bairro, cep, cidade, email, telefone, celular, uf, pagamento)));
	}
    
    @Test
    public void test31(){ //CNPJ Válido
        Cliente c = new clienteDAO();
        assertEquals(true, c.insereCliente(c.clienteDAO(nome, 11.111.111/1111-11, endereco, bairro, cep, cidade, email, telefone, celular, uf, pagamento)));      
    }
	
	@Test
	public void test32(){ //CNPJ Inválido
		Cliente c = new clienteDAO();
		assertEquals(false, c.insereCliente(c.clienteDAO(nome, 23.2 2.3 3/2111-1, endereco, bairro, cep, cidade, email, telefone, celular, uf, pagamento)));
	}
	
	@Test
	public void test33(){ //Endereço Invalido
		Cliente c = new clienteDAO();
		assertEquals(true, c.insereCliente(c.clienteDAO(nome, cnpj, Rua Treze, bairro, cep, cidade, email, telefone, celular, uf, pagamento)));
	}
	
	@Test
	public void test34(){ //Endereço Invalido
		Cliente c = new clienteDAO();
		assertEquals(false, c.insereCliente(c.clienteDAO(nome, cnpj, Ruatrezejuntocomaesquina10pertodoaeroportodefrentecomumpostodegasolinanaesquinadohospital , bairro, cep, cidade, email, telefone, celular, uf, pagamento)));
	}
	
	@Test
	public void test35(){ //Bairro Valido
		Cliente c = new clienteDAO();
		assertEquals(true, c.insereCliente(c.clienteDAO(nome, cnpj, endereco, Jd. Castelo, cep, cidade, email, telefone, celular, uf, pagamento)));
	}
	
	@Test
	public void test36(){ //Bairro Invalido
		Cliente c = new clienteDAO();
		assertEquals(false, c.insereCliente(c.clienteDAO(nome, cnpj, endereco, Jd.Estadosunidosjuntocomobairrovilaolimpia, cep, cidade, email, telefone, celular, uf, pagamento)));
	}
	
	@Test
	public void test37(){ //CEP Valido
		Cliente c = new clienteDAO();
		assertEquals(true, c.insereCliente(c.clienteDAO(nome, cnpj, endereco, bairro, 15703-304, cidade, email, telefone, celular, uf, pagamento)));
	}
	
	@Test
	public void test38(){ //CEP Invalido
		Cliente c = new clienteDAO();
		assertEquals(false, c.insereCliente(c.clienteDAO(nome, cnpj, endereco, bairro, 16789-098, cidade, email, telefone, celular, uf, pagamento)));
	}
	
	@Test
	public void test39(){ //Cidade Valida
		Cliente c = new clienteDAO();
		assertEquals(true, c.insereCliente(c.clienteDAO(nome, cnpj, endereco, bairro, cep, Jales, email, telefone, celular, uf, pagamento)));
	}
	
	@Test
	public void test40(){ //Cidade Invalida
		Cliente c = new clienteDAO();
		assertEquals(false, c.insereCliente(c.clienteDAO(nome, cnpj, endereco, bairro, cep, Jalesfernandopolissaojosedoriopretoitapetiningacorneliprocopio, email, telefone, celular, uf, pagamento)));
	}
	
	@Test
	public void test41(){ //Cidade Inexistente
		Cliente c = new clienteDAO();
		assertEquals(false, c.insereCliente(c.clienteDAO(nome, cnpj, endereco, bairro, cep, Santa Pedra, email, telefone, celular, uf, pagamento)));
	}
	
	@Test
	public void test42(){ //Email Valido
		Cliente c = new clienteDAO();
		assertEquals(true, c.insereCliente(c.clienteDAO(nome, cnpj, endereco, bairro, cep, cidade, pedro_silva@hotmail.com, telefone, celular, uf, pagamento)));
	}
	
	@Test
	public void test43(){ //Email Invalido
		Cliente c = new clienteDAO();
		assertEquals(false, c.insereCliente(c.clienteDAO(nome, cnpj, endereco, bairro, cep, cidade, pedrooooooooooooooooooooooooooooooooooooooo_silva@hotmail.com, telefone, celular, uf, pagamento)));
	}
	
	@Test
	public void test44(){ //Email Inexistente
		Cliente c = new clienteDAO();
		assertEquals(false, c.insereCliente(c.clienteDAO(nome, cnpj, endereco, bairro, cep, cidade, pedro123_silva1324232@hotmail.com, telefone, celular, uf, pagamento)));
	}
	
	@Test
	public void test45(){ //Telefone Valido
		Cliente c = new clienteDAO();
		assertEquals(true, c.insereCliente(c.clienteDAO(nome, cnpj, endereco, bairro, cep, cidade, email, (17)36671302, celular, uf, pagamento)));
	}
	
	@Test
	public void test46(){ //Telefone Invalido
		Cliente c = new clienteDAO();
		assertEquals(false, c.insereCliente(c.clienteDAO(nome, cnpj, endereco, bairro, cep, cidade, email, (11)9985769452, celular, uf, pagamento)));
	}
	
	@Test
	public void test47(){ //Celular Valido
		Cliente c = new clienteDAO();
		assertEquals(true, c.insereCliente(c.clienteDAO(nome, cnpj, endereco, bairro, cep, cidade, email, telefone, (17)991499602, uf, pagamento)));
	}
	
	@Test
	public void test48(){ //Celular Invalido
		Cliente c = new clienteDAO();
		assertEquals(false, c.insereCliente(c.clienteDAO(nome, cnpj, endereco, bairro, cep, cidade, email, telefone, (21)9324569877, uf, pagamento)));
	}
	
	@Test
	public void test49(){ //UF Valido
		Cliente c = new clienteDAO();
		assertEquals(true, c.insereCliente(c.clienteDAO(nome, cnpj, endereco, bairro, cep, cidade, email, telefone, celular, SP, pagamento)));
	}
	
	@Test
	public void test50(){ //UF Invalido
		Cliente c = new clienteDAO();
		assertEquals(false, c.insereCliente(c.clienteDAO(nome, cnpj, endereco, bairro, cep, cidade, email, telefone, celular, GC, pagamento)));
	}
	
	@Test
	public void test51(){ //Pagamento Valido
		Cliente c = new clienteDAO();
		assertEquals(true, c.insereCliente(c.clienteDAO(nome, cnpj, endereco, bairro, cep, cidade, email, telefone, celular, uf, 17500)));
	}
	
	@Test
	public void test52(){ //Pagamento Invalido
		Cliente c = new clienteDAO();
		assertEquals(false, c.insereCliente(c.clienteDAO(nome, cnpj, endereco, bairro, cep, cidade, email, telefone, celular, uf, -500)));
	}
}