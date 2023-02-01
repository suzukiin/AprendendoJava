package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		Data d2 = new Data(14,11,2003);
	
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
	}
}
