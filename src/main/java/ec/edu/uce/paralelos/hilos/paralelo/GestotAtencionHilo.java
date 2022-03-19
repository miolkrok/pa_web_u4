package ec.edu.uce.paralelos.hilos.paralelo;

import java.util.concurrent.TimeUnit;

import ec.edu.uce.paralelo.hilos.Cajero;

public class GestotAtencionHilo extends Thread{
	
	private CajeroHilo cajero;
	private long tiempoInicial;
	
	
	
	public GestotAtencionHilo(CajeroHilo cajero, long tiempoInicial) {
		super();
		this.cajero = cajero;
		this.tiempoInicial = tiempoInicial;
	}

	@Override
	public void run() {
		this.procesar(this.cajero, this.tiempoInicial);
	}
	
	public void procesar(CajeroHilo cajero, long tiempoInicial) {
		System.out.println("Inicia atender cajero" + cajero.getNombre());
		
		for(Integer tiempo : cajero.getClientes()) {
			this.atenderCliente(tiempo);
		}
		System.out.println(" Finaliza atender cajero:  " +cajero.getNombre());
		long tiempoTranscurrido = (System.currentTimeMillis()-tiempoInicial)/1000;
		System.out.println(tiempoTranscurrido + " seg de atencion por: " +cajero.getNombre());
	}
	
	private void atenderCliente(Integer tiempo) {
		System.out.println("Atendiendo al cliente: " +tiempo);
		System.out.println("Hilo: " +Thread.currentThread().getName());
		try {
			TimeUnit.SECONDS.sleep(tiempo);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	

}
}