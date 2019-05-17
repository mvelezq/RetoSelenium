package com.tcs.certificacion.RetoSelenium.Test;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import com.tcs.certificacion.RetoSelenium.Principal.principal;



public class registro {
		
	protected WebDriver driver;
		
		@Before
		
		public void iniciarNavegador() {
				
			ChromeOptions opt = new ChromeOptions();
			opt.setPageLoadStrategy(PageLoadStrategy.NONE);
			driver=new ChromeDriver(opt);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.phptravels.net");
		}
		
		@Test
		
		public void llenarRegistro() throws Exception {
			
			
			principal principal = new principal();
			PageFactory.initElements(driver, principal);
				
			//Pagina de inicio
			principal.bottonaccount();
			principal.bottonsingup();
			
			//Registro
			principal.firstName();
			principal.lastName();
			principal.mobileNumber();
			principal.email();
			principal.password();
			principal.confirmpassword();
			principal.bottonConfirmacion();
			
			//Boton fligth
			Thread.sleep(3000);
			principal.bottonFligth();
			
			//Seleccionar vuelo ida
			
			principal.enterCity();
			principal.enterCity1();
			
			//Seleccionar vuelo vuelta
			
			principal.enterAirport();
			principal.enterAirport1();
			
			//Seleccionar Round Trip
			principal.roundTrip();
			
			//Seleccionar fecha ida
			principal.fechaIda();
			
			//Seleccionar fecha Vuelta
			principal.fechaVuelta();
			
			//Número Personas
			principal.numeroPersonas();
			Thread.sleep(5000);
			//Adulto
			principal.numeroAdultos();
				
			//Niños
			principal.numeroNiños();
						
			//Infantes
			principal.numeroInfant();
			
			principal.botonPersonas();
			//Boton Search
			Thread.sleep(3000);
			principal.botonSearch();
					
			//Seleccionar Menor valor
			principal.menorValor(driver);
			
			//Confirmar vuelo
			
			principal.confirmarVuelo(driver);
			
			//factura
			
			principal.compararFecha();
			principal.tomarFactura();
			
					
			}
			
	}

	

