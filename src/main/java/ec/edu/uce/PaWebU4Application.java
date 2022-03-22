package ec.edu.uce;

import java.util.concurrent.CompletableFuture;

import org.apache.commons.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

import ec.edu.uce.service.IProcesamientoFacultadService;
import ec.edu.uce.service.ProcesamientoFacultadServiceImpl;

@SpringBootApplication
@EnableAsync
public class PaWebU4Application implements CommandLineRunner{
	
	private static final Logger LOG = LoggerFactory.getLogger(PaWebU4Application.class);

	
	@Autowired
	private IProcesamientoFacultadService facultadService;
	
	

	public static void main(String[] args) {
		SpringApplication.run(PaWebU4Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		long inicio = System.currentTimeMillis();
//		//Procesamiento asincrono, pero si manejo de respuesta por cada hilo
////		Integer valor1 = this.facultadService.calcularDeuda("1631962", 4);
////		Integer valor2 = this.facultadService.calcularDeuda("2695481", 4);
////		Integer valor3 = this.facultadService.calcularDeuda("0194522", 4);
////		Integer valor4 = this.facultadService.calcularDeuda("9746130", 4);
//		//Procesamiento asincrono, pero si manejo de respuesta por cada hilo
//		CompletableFuture<Integer> valor1 = this.facultadService.calcularDeudaFuture("1631962", 4);
//		CompletableFuture<Integer> valor2 = this.facultadService.calcularDeudaFuture("2695481", 4);
//		CompletableFuture<Integer> valor3 = this.facultadService.calcularDeudaFuture("0194522", 4);
//		CompletableFuture<Integer> valor4 = this.facultadService.calcularDeudaFuture("9746130", 4);
//
//		//sentenia que espera que terminen de procesar todos los hilos
//		CompletableFuture.allOf(valor1,valor2, valor3,valor4).join();
//
//		//esperar que se procesen todos los hilos
//		LOG.info("TOTAL: " + (valor1.get() +valor2.get() +valor3.get()+valor4.get()));
//		long tFinal = System.currentTimeMillis();
//		long tiempoTranscurrido = (tFinal- inicio)/1000;
//		
//		LOG.info(tiempoTranscurrido + " seg"); 
	}

}
