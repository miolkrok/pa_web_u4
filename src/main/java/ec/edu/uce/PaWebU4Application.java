package ec.edu.uce;

import org.apache.commons.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.service.IProcesamientoFacultadService;
import ec.edu.uce.service.ProcesamientoFacultadServiceImpl;

@SpringBootApplication
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
		long inicio = System.currentTimeMillis();
		Integer valor1 = this.facultadService.calcularDeuda("1631962", 4);
		Integer valor2 = this.facultadService.calcularDeuda("2695481", 4);
		Integer valor3 = this.facultadService.calcularDeuda("0194522", 4);
		Integer valor4 = this.facultadService.calcularDeuda("9746130", 4);
		
		LOG.info("TOTAL: " + (valor1+valor2+valor3+valor4));
		long tFinal = System.currentTimeMillis();
		long tiempoTranscurrido = (tFinal- inicio)/1000;
		
		LOG.info(tiempoTranscurrido + " seg"); 
	}

}
