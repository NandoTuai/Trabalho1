	//Pacote
package SubClasses;
	
	//importando do pacote Superclasse
import SuperClasse.Poligono;

	//subclasse adequada de Poligono implementando os métodos para:
	//quadrados 
public class Quadrado extends Poligono {

	//construtor explícito
	public Quadrado(double comprimentoLateral) {
			super(comprimentoLateral);}
	
	@Override 
	public int numeroDeLados() {
		return 4; //substituindo o retorno 0 da classe base
	}

	@Override
	public double area() {
		double area=Math.pow(comprimentoLateral, 2); //Aplicando a formula de cálculo
		return area; //substituindo o retorno 0 da classe base
		}
 
	}

