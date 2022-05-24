	//pacote
package SubClasses;

	//Importes
import SuperClasse.Poligono;

	//subclasse adequada de Poligono implementando os métodos para:
	//triângulos equilátero
public class TrianguloEquilatero extends Poligono {
	
	//construtor explicito
	public TrianguloEquilatero(double comprimentoLateral) {
		super(comprimentoLateral);}

	@Override
	public int numeroDeLados() {
		return 3; //substituindo o retorno 0 da classe base
	}

	@Override
	public double area() {
		double area; //variável local que recebe o retorno da fórmula
        area = Math.pow(comprimentoLateral, 2)*Math.sqrt(3)/4;
        return area; //substituindo o retorno 0 da classe base
        }
}
