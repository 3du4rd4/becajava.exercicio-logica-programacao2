package logipro2;
import java.util.Scanner;

public class LogiPro {
	public static void main(String[] args) {
	Scanner entradasalario = new Scanner(System.in);
	Scanner entradareajuste = new Scanner(System.in);
	
	
	System.out.print("Digite o valor do salario:");
	double salario = entradasalario.nextDouble();
	
	System.out.print("Digite o valor do reajuste:");
	double reajuste = entradareajuste.nextDouble();
	
	double atualizado = salario / 100 * reajuste + salario;
	
	System.out.println(atualizado);
	
	
	
	}
}
