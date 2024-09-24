package Exerc_01.applicantion;

import Exerc_01.entities.Employee;
import Exerc_01.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
	/*Uma empresa possui funcionários próprios e terceirizados. Para cada funcionário,
	* deseja-se registrar nome, horas trabalhadas e valor por hora. Funcionários terceirizado
	* possuem ainda uma despesa adicional.
	 O pagamento dos funcionários corresponde ao valor da hora multiplicado pelas horas
	 trabalhadas, sendo que os funcionários terceirizados ainda recebem um bônus correspondentea
	 110% de sua despesa adicional.
	 Fazer um programa para ler os dados de N funcionários (N fornecido pelo usuário) e armazená-los
	 em uma lista. Depois de ler todos os dados, mostrar nome e pagamento de cada funcionário na
	 mesma ordem em que foram digitados.*/

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> empl= new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n=sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #"+i+" data:");
			System.out.print("Outsourced (y/n)? ");
			char outSourced=sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name=sc.nextLine();
			System.out.print("Hours: ");
			Integer hours=sc.nextInt();
			System.out.print("Value per hour: ");
			Double valuerHour=sc.nextDouble();
			if (outSourced=='y') {
				System.out.print("Additional charge: ");
				Double additionalCharge=sc.nextDouble();
				Employee emplo= new OutsourcedEmployee(name, hours, valuerHour, additionalCharge);
				empl.add(emplo);
			}else {
				Employee emplo = new Employee(name, hours, valuerHour);
				empl.add(emplo);
			}
		}
		System.out.println("");
		System.out.println("PAYMENTS:");
		for (Employee employee : empl) {
			System.out.println(employee.getName()+" - $ "+employee.payment());
		}
		sc.close();
		}
		
	}

