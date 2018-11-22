package Codigo1;

import java.util.ArrayList;
import java.util.Scanner;

import Codigo1.GestorMesa;
import Codigo1.Mesa;
import Codigo1.Reserva;

public class Main {

	public static void main(String[] args) {

		Mesa mesa=new Mesa(1, 4);
		Mesa mesa1=new Mesa(2, 4);
		Mesa mesa2=new Mesa(3, 2);
		Mesa mesa3=new Mesa(4, 4);
		Mesa mesa4=new Mesa(5, 2);
		Mesa mesa5=new Mesa(6, 6);
		ArrayList<Mesa> ListaMesas = new ArrayList<Mesa>();
		
		ListaMesas.add(mesa);
		ListaMesas.add(mesa1);
		ListaMesas.add(mesa2);
		ListaMesas.add(mesa3);
		ListaMesas.add(mesa4);
		ListaMesas.add(mesa5);
		
		
		
		GestorMesa GMesa= new GestorMesa(ListaMesas);
		JefeSala jf = new JefeSala();
		jf.hacerReserva(GMesa);
		
		
		

	}

}
