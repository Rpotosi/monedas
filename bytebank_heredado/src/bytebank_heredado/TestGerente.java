package bytebank_heredado;

public class TestGerente {
	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		gerente.setNombre("Richard");
		gerente.setDocumento("1123306890");
		gerente.setSalario(5000.0);
		
	/*	
		System.out.println(gerente.getNombre());
		System.out.println(gerente.getDocumento());
		System.out.println(gerente.getSalario());
	*/	
		gerente.setClave("AluraCursosOnline");
		gerente.setTipo(1);
		
		//System.out.println(gerente.getBonificacion());
		System.out.println(gerente.iniciarSesion("AluraCursosOnline"));
	}

}
