package tarefa_classes;

public class principal {

	public static void main(String[] args) {
		System.out.println("Objeto real é Roda");
		
		tarefa_classes.objeto objeto = new objeto();
		
		objeto.setNome("Aço");
		objeto.setDescricao("Objeto feito de liga metalica (mistura de dois materiais, carbono e ferro)");
		objeto.setIdade(135);
		
		System.out.println(objeto.getNome());
		System.out.println(objeto.getDescricao());
		System.out.println(objeto.getIdade());
	}	

}
