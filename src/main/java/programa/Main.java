package programa;

import entidades.Produto;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.println("Dados do produto:");
				System.out.print("Código de barras: ");
				int codProd = sc.nextInt();
				
				sc.nextLine();
				
				System.out.print("Nome do produto: ");
				String nomeProd = sc.nextLine();
				
				System.out.print("Marca do produto: ");
				String marcaProd = sc.nextLine();
				
				System.out.print("Quantidade do produto: ");
				int qtdProd = sc.nextInt();
				
				System.out.print("Data de cadastro: ");
				LocalDate dataCad = LocalDate.parse(sc.nextLine(), formatter);
				
			    Produto produto = new Produto(codProd, nomeProd, marcaProd, qtdProd, dataCad);
				System.out.println("Produto cadastrado!");
				
				System.out.println(produto);
				
				break;
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
		
		}
		
	}
}
