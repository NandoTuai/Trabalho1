//PACOTE
package Principal;

//IMPORTES
import java.util.Scanner;
import java.text.DecimalFormat;
import SubClasses.Quadrado;
import SubClasses.TrianguloEquilatero;

//CLASSE PRINCIPAL
public class Principal {
	
//MÉTODO PRINCIPAL
	public static void main(String[] args) {
		
		//CRIANDO OBJECTO E VARIÁVEL PARA CAPTURA DO COMPRIMENTO LATERAL
		Scanner SC = new Scanner(System.in);
		double comprimentoLateralQuadrado,comprimentoLateralTriangulo;
		
		//INTERAGINDO OU INSTRUINDO  E CAPTANDO OS DADOS DO USUÁRIO
		System.out.println("Cálculo da área do Triângulo Equilátero \ne do Quadrado");
		System.out.println("--------------------------------------------");
		System.out.print("Informe o Comprimento Lateral do Triângulo: ");
		comprimentoLateralTriangulo = SC.nextDouble();
		System.out.print("Informe o Comprimento Lateral do Quadrado: ");
		comprimentoLateralQuadrado = SC.nextDouble();
		SC.close();
		
		//CRIANDO OS OBJECTOS E IMPRIMINDO A ÁREA DOS POLÍGONOS
		TrianguloEquilatero trianguloEquilatero = new TrianguloEquilatero(comprimentoLateralTriangulo);
		Quadrado quadrado = new Quadrado (comprimentoLateralQuadrado);
		
		System.out.println();
		System.out.println("RESULTADOS");
		System.out.println("--------------------------------------------");
		System.out.printf("Área do triangulo: %.2f",trianguloEquilatero.area());
		System.out.println();
		System.out.println("Área do quadrado: "+quadrado.area());
		
		//DETALHES DO CALCULO PARA O USUÁRIO
		double ladoTriAoQuadrado = Math.pow(comprimentoLateralTriangulo, 2);
		double ladoQuadAoQuadrado = Math.pow(comprimentoLateralQuadrado, 2);
		double RaizDe3 = Math.sqrt(3);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.println();
		
		System.out.println("Fórmula e Exemplo a ser seguido");
		System.out.println("--------------------------------------------");
		
		System.out.println(">>>>Triângulo<<<<");
		System.out.println("Fórmula: Área=l²*√3/4");
		System.out.printf("Exemplo: Área"
							+"="
							+ladoTriAoQuadrado
							+"*"
							+ df.format(RaizDe3)
							+"/4="
							+df.format(trianguloEquilatero.area()));
		
		System.out.println();
		System.out.println();
		
		System.out.println(">>>>Quadrado<<<<");
		System.out.println("Fórmula: Área=l²");
		System.out.println("Exemplo: Área"+"="
							+comprimentoLateralQuadrado
							+"*"
							+comprimentoLateralQuadrado
							+"="
							+ladoQuadAoQuadrado);

		
		
		
	}

}
