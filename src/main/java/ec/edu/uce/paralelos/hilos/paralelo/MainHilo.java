package ec.edu.uce.paralelos.hilos.paralelo;

import java.util.Arrays;


public class MainHilo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long tiempoInicial = System.currentTimeMillis();
		
		CajeroHilo cajero1 = new CajeroHilo(" Edison",Arrays.asList(2,2,3,4,5));
		CajeroHilo cajero2 = new CajeroHilo(" Carlos",Arrays.asList(1,2,2,3));
		CajeroHilo cajero3 = new CajeroHilo(" Luis",Arrays.asList(2,3,2,3,4));
		GestotAtencionHilo gestor1 = new GestotAtencionHilo(cajero1, tiempoInicial);
		GestotAtencionHilo gestor2 = new GestotAtencionHilo(cajero2, tiempoInicial);
		GestotAtencionHilo gestor3 = new GestotAtencionHilo(cajero3, tiempoInicial);
		
		gestor1.start();//procesar
		gestor2.start();
		gestor3.start();
		
		long tiempoFinal = System.currentTimeMillis();
		
		long tiempoTranscurrido = (tiempoFinal-tiempoInicial)/1000;
		System.out.println(tiempoTranscurrido + " seg ");

	}

}
