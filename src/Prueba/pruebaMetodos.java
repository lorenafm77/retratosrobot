package Prueba;

import java.util.Scanner;

public class pruebaMetodos {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Elige un pelo, introduciendo un número de 1-4: ");
		System.out.println("Opción 1: WWWWWWWWW");
		System.out.println("Opción 2: \\\\\\//////");
		System.out.println("Opción 3: \"|||||||\"");
		System.out.println("Opción 4: |||||||||");
		
		int pelo = in.nextInt();
		
		System.out.println("Elige ojos, introduciendo un número de 1-4: ");
		System.out.println("Opción 1: |  o o  |");
		System.out.println("Opción 2: |-(· ·)-|");
		System.out.println("Opción 3: |-(o o)-|");
		System.out.println("Opción 4: | \\ / |");
		
		int ojos = in.nextInt();
	
		System.out.println("Elige orejas/nariz, introduciendo un número de 1-4: ");
		System.out.println("Opción 1: @ J @");
		System.out.println("Opción 2: { \" }");
		System.out.println("Opción 3: [ j ]");
		System.out.println("Opción 4: < - >");
		
		int oreja = in.nextInt();
		
		System.out.println("Elige boca, introduciendo un número de 1-4: ");
		System.out.println("Opción 1: | === |");
		System.out.println("Opción 2: |  -  |");
		System.out.println("Opción 3: | ___ |");
		System.out.println("Opción 4: | --- |");
		
		int boca = in.nextInt();
		
		System.out.println("Elige barbilla, introduciendo un número de 1-4: ");
		System.out.println("Opción 1: \\_______/");
		System.out.println("Opción 2: \\,,,,,,,/");
		System.out.println("Opción 3: \\......./");
		System.out.println("Opción 4: \\mmmmmmm/");
		
		int barbilla = in.nextInt();
			
		System.out.println("Tu robot es");
		System.out.println(dibujarPelo(pelo));
		System.out.println(dibujarOjos(ojos));
		System.out.println(dibujarOreja(oreja));
		System.out.println(dibujarBoca(boca));
		System.out.println(dibujarBarbilla(barbilla));

	}
	
	static String dibujarPelo(int pelo) {
		if (pelo == 1)
			return "WWWWWWWWW";
		else if (pelo == 2)	
			return "\\\\\\//////";
		else if (pelo == 3)	
			return "\"|||||||\"";
		else
			return "|||||||||";
	}
	
	static String dibujarOjos (int ojos) {
		if (ojos == 1)
			return "|  o o  |"; 
		else if (ojos == 2)	
			return "|-(· ·)-|";
		else if (ojos == 3)	
			return "|-(o o)-|";
		else
			return "|  \\ /  |";
	}
	
	static String dibujarOreja (int oreja) {
		if (oreja == 1)
			return " @ J @";
		else if (oreja == 2)	
			return " { \" }";
		else if (oreja == 3)	
			return " [ j ]";
		else
			return " < - >";
	}
	
	static String dibujarBoca (int boca) {
		if (boca == 1)
			return "| === |";
		else if (boca == 2)	
			return "|  -  |";
		else if (boca == 3)	
			return "| ___ |";
		else
			return "| --- |";
	}
	
	static String dibujarBarbilla (int barbilla) {
		if (barbilla == 1)
			return "\\_______/";
		else if (barbilla == 2)	
			return "\\,,,,,,,/";
		else if (barbilla == 3)	
			return "\\......./|";
		else
			return "\\mmmmmmm/";
	}

}
