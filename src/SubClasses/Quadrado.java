	//Pacote
package SubClasses;
	
	//importando do pacote Superclasse
import SuperClasse.Poligono;

	//subclasse adequada de Poligono implementando os m�todos para:
	//quadrados 
public class Quadrado extends Poligono {

	//construtor expl�cito
	public Quadrado(double comprimentoLateral) {
			super(comprimentoLateral);}
	
	@Override 
	public int numeroDeLados() {
		return 4; //substituindo o retorno 0 da classe base
	}

	@Override
	public double area() {
		double area=Math.pow(comprimentoLateral, 2); //Aplicando a formula de c�lculo
		return area; //substituindo o retorno 0 da classe base
		}
 
	}

