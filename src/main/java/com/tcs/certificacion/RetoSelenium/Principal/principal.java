package com.tcs.certificacion.RetoSelenium.Principal;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tcs.certificacion.RetoSelenium.Test.registro;


public class principal extends registro {


	// Principal
		
		@FindBy(xpath="(//a[@class='dropdown-toggle go-text-right'])[3]")
		private WebElement myAccount;
		@FindBy(xpath="(//a[@class='go-text-right'])[14]")
		private WebElement singUp;
		@FindBy(xpath="(//a[@class='go-text-right'])[13]")
		private WebElement login;
		
		//Formulario del login
		@FindBy(xpath="//input[@name='firstname']")
		private WebElement firstName;
		@FindBy(xpath="//input[@name='lastname']")
		private WebElement lastName;
		@FindBy(xpath="//input[@name='phone']")
		private WebElement mobileNumber;
		@FindBy(xpath="//input[@name='email']")
		private WebElement email;
		@FindBy(xpath="//input[@name='password']")
		private WebElement password;
		@FindBy(xpath="//input[@name='confirmpassword']")
		private WebElement confirmpassword;
		@FindBy(xpath="//button[@class='signupbtn btn_full btn btn-action btn-block btn-lg']")
		private WebElement bottonConfirmacion;
		
		//Boton fligth
		@FindBy(xpath="(//a[@class='text-center'])[2]")
		private WebElement bottonFligth;
				
		//Seleccionar vuelo ida
		@FindBy(xpath="(//span[@class='select2-chosen'])[6]")
		private WebElement enterCityClick;
		@FindBy(xpath="(//input[@class='select2-input'])[9]")
		private WebElement enterCityText;
		
		//Seleccionar vuelo vuelta
		@FindBy(xpath="(//span[@class='select2-chosen'])[7]")
		private WebElement enterAirportClick;
		@FindBy(xpath="(//input[@class='select2-input'])[9]")
		private WebElement enterAirportText;
		
		//Seleccionar round trip
		@FindBy(xpath="(//ins[@class='iCheck-helper'])[2]")
		private WebElement roundTrip;
		
		//Fecha ida
		@FindBy(xpath="//input[@name='departure']")
		private WebElement fechaIda;
		
		//Fecha vuelta
		@FindBy(xpath="//input[@name='arrival']")
		private WebElement fechaVuelta;
		
		//Número Personas
		@FindBy(xpath="//input[@name='totalManualPassenger']")
		private WebElement numeroPersonas;
		
		//Adulto
		@FindBy(xpath="//select[@name='madult']")
		private WebElement desplegaAdultos;
		@FindBy(xpath="//select[@name='madult']/option[@value=2]")
		private WebElement numeroAdultos;
				
		//Niño
		@FindBy(xpath="//select[@name='mchildren']")
		private WebElement desplegaNinos;
		@FindBy(xpath="//select[@name='mchildren']/option[@value=2]")
		private WebElement numeroNinos;
				
		//Infant
		@FindBy(xpath="//select[@name='minfant']")
		private WebElement desplegaInfant;
		@FindBy(xpath="//select[@name='minfant']/option[@value=2]")
		private WebElement numeroInfants;
		
		@FindBy(xpath="//button[@id='sumManualPassenger']")
		private WebElement botonPersonas;
		
		//Boton search
		@FindBy(xpath="//button[@class='btn-primary btn btn-lg btn-block pfb0']")
		private WebElement botonSearch;
		
		//Seleccionar menor valor
		@FindBy(xpath="(//label[@class='panel-body tl'])[1]")
		private WebElement cualquierObjeto;
		
		@FindBy(xpath="//table[@id='load_data']/tbody/tr/td[@class='wow fadeIn p-10-0 animated animated']/div/p/span[@class='strong']")
		private WebElement listPrecios;
		
		@FindBy(xpath="//table[@id='load_data']/tbody/tr/td[@class='wow fadeIn p-10-0 animated animated']/div/p/button")
		private WebElement listBotones;
		
		//Confirmar vuelo
		
		@FindBy (xpath="//a[@id='guesttab']")
		private WebElement bottonBookAsAGuest;
		
		@FindBy(xpath="//input[@name='firstname']")
		private WebElement confimFirstName;
		
		@FindBy(xpath="//input[@name='lastname']")
		private WebElement confirmLastName;
		
		@FindBy(xpath="//input[@name='email']")
		private WebElement confirmEmail;
		
		@FindBy(xpath="//input[@name='confirmemail']")
		private WebElement confirmConfEmail;
		
		@FindBy(xpath="//input[@name='phone']")
		private WebElement confirmMobile;
		
		@FindBy(xpath="//input[@name='address']")
		private WebElement confirmAddress;
		
		@FindBy(xpath="//a[@class='select2-choice']")
		private WebElement selectCountry;
		
		@FindBy(xpath="//input[@class='select2-input']")
		private WebElement insertCountry;
				
		@FindBy(xpath="//button[@name='guest']")
		private WebElement botonConfirmarReserva;
		
		@FindBy(xpath="//button[@name='logged']")
		private WebElement botonConfirmReserLogged;
		
		
		//Factura
		
		@FindBy(xpath="(//td[@style='padding-top: 20px;']/table/tbody/tr/td)[4]")
		private WebElement primeraFechaFactura;
		
		@FindBy(xpath="(//div[@style='background:#ffffff;']/table/tbody/tr/td)[7]")
		private WebElement segundaFechaFactura;
		
		@FindBy(xpath="//*[@id='printablediv']")
		private WebElement factuVuelo;
		
		private String consfechaIda="2019-02-16";
		private String consfechaVuelta="2019-02-29";
		
		//Pagina principal
		public void bottonaccount() {
			myAccount.click();
			
		}
		public void bottonsingup() {
			singUp.click();
		}
			
		public void bottonLogin() {
			login.click();
		}
		//Registro
		public void firstName() {
			firstName.sendKeys("Miguel");
		}
		public void lastName() {
			lastName.sendKeys("Velez");
		}
		public void mobileNumber() {
			mobileNumber.sendKeys("3001234567");
		}
		public void email() {
			email.sendKeys("mvelez@bancolombia.com");
		}
		public void password() {
			password.sendKeys("123456");
		}
		public void confirmpassword() {
			confirmpassword.sendKeys("123456");
		}
		public void bottonConfirmacion() {
			bottonConfirmacion.click();
		}
		
		//Boton fligth
		
		public void bottonFligth() {
			bottonFligth.click();
		}

		//Seleccionar vuelo ida
	
		public void enterCity() throws InterruptedException {
			enterCityClick.click();
			
		}
		
		public void enterCity1() throws AWTException, InterruptedException {
			alt_tab();
			enterCityText.sendKeys("Miami");
			Thread.sleep(2000);
			alt_tab();
			Thread.sleep(2000);
			enter();
//			EnterCityText.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			alt_tab();
		}
		
		//Seleccionar vuelo vuelta
		public void enterAirport() throws InterruptedException {
			enterAirportClick.click();
			
		}
		
		public void enterAirport1() throws AWTException, InterruptedException {
			alt_tab();
			enterAirportText.sendKeys("Tarama");
			Thread.sleep(2000);
			alt_tab();
			Thread.sleep(2000);
			enter();
			Thread.sleep(2000);
			alt_tab();
		}
		
		//Alt tab
		
		public void alt_tab() throws AWTException, InterruptedException {
		
		    Robot robot = new Robot();
		    robot.keyPress(KeyEvent.VK_ALT);
		    robot.keyPress(KeyEvent.VK_TAB);
		    robot.keyRelease(KeyEvent.VK_TAB);
		    robot.keyRelease(KeyEvent.VK_ALT);
		    Thread.sleep(3000);
		    robot.keyPress(KeyEvent.VK_ALT);
		    robot.keyPress(KeyEvent.VK_TAB);
		    robot.keyRelease(KeyEvent.VK_TAB);
		    robot.keyRelease(KeyEvent.VK_ALT);		
		    
		}
		public void enter() throws AWTException {
	
		    Robot robot = new Robot();
		    robot.delay(100);
		    robot.keyPress(KeyEvent.VK_ENTER);
		}
		
		//Seleccionar Round Trip
		
		public void roundTrip() {
			roundTrip.click();		
		}
		
		//Seleccionar fecha ida
		
		public void fechaIda() {
			fechaIda.click();
			fechaIda.sendKeys(consfechaIda);
		}
		
		//Seleccionar fecha vuelta
		
		public void fechaVuelta() {
			fechaVuelta.click();
			fechaVuelta.sendKeys(consfechaVuelta);
		}	
		
		//Número Personas
		
		public void numeroPersonas() {
			numeroPersonas.click();
		}
		
		//Adulto
		
		public void numeroAdultos() {
		
			desplegaAdultos.click();
			numeroAdultos.click();
		}
		
		//Niños
		
		public void numeroNiños() {
			desplegaNinos.click();
			numeroNinos.click();
		}
		
		//Infantes
		
		public void numeroInfant() {
			desplegaInfant.click();
			numeroInfants.click();
		}
		
		public void botonPersonas() {
			botonPersonas.click();
		}
		
		//Boton Search
		
		public void botonSearch() {
			botonSearch.click();
		}		
		 
		//Seleccionar Menor valor vuelo
		
		public void revelarPagina() throws AWTException, InterruptedException {
			Thread.sleep(12000);
			Robot robotBajar = new Robot();
			robotBajar.keyPress(KeyEvent.VK_END);
			robotBajar.keyPress(KeyEvent.VK_PAGE_UP);
			Thread.sleep(2000);
			robotBajar.keyPress(KeyEvent.VK_PAGE_UP);
			Thread.sleep(2000);
			robotBajar.keyPress(KeyEvent.VK_PAGE_UP);
			Thread.sleep(2000);
			robotBajar.keyPress(KeyEvent.VK_PAGE_UP);
			Thread.sleep(2000);
			robotBajar.keyPress(KeyEvent.VK_PAGE_UP);
			Thread.sleep(2000);
			robotBajar.keyPress(KeyEvent.VK_PAGE_UP);
			Thread.sleep(2000);
			robotBajar.keyPress(KeyEvent.VK_PAGE_UP);
			Thread.sleep(2000);
			
		}
		
		
		public void menorValor(WebDriver driverWeb) throws AWTException, InterruptedException {
		
			revelarPagina();
			List<WebElement> listaPrecios = driverWeb.findElements(By.xpath("//table[@id='load_data']/tbody/tr/td[@class='wow fadeIn p-10-0 animated animated']/div/p/span[@class='strong']"));
			String primValor=listaPrecios
					.get(0).getText().replace("$", "").replace("€", "").replace("£", "");
			float pValor=Float.valueOf(primValor);
			int posicion=1;
			for (int i = 1; i < listaPrecios.size(); i++) {
			
				String precio=driverWeb
						.findElement(By.xpath("(//table[@id='load_data']/tbody/tr/td[@class='wow fadeIn p-10-0 animated animated']/div/p/span[@class='strong'])["+i+"]"))
						.getText().replace("$", "").replace("€", "").replace("£", "");
				float aValor=Float.valueOf(precio);
				
				if (pValor>aValor) {
					pValor=aValor;
					posicion=i;
				}
				
			}
			System.out.println("Menor Valor "+pValor);
			
			driverWeb.findElement(By.xpath("("
					+ "//table[@id='load_data']/tbody/tr/td[@class='wow fadeIn p-10-0 animated animated']/div/p/button)["+posicion+"]"))
			.click();
			

		
		}
		//Confirmación de vuelo
		public void confirmarVuelo(WebDriver driverConfirmar) throws AWTException, InterruptedException {

			Boolean isPresent = driverConfirmar.findElements(By.xpath("//a[@id='guesttab']")).size() > 0;
			if (isPresent.equals(true)) { 
				confimFirstName.sendKeys("Miguel");
				confirmLastName.sendKeys("Velez");
				confirmEmail.sendKeys("mvelez@bancolombia.com");
				confirmConfEmail.sendKeys("mvelez@bancolombia.com");
				confirmMobile.sendKeys("3001234567");
				confirmAddress.sendKeys("calle 33 # 33-23");
				botonConfirmarReserva.click();
			} else {
				System.out.println("No se encuentra el elemento");
				Robot robotfactura = new Robot();
				robotfactura.keyPress(KeyEvent.VK_END);
				Thread.sleep(2000);
				robotfactura.keyPress(KeyEvent.VK_PAGE_UP);
				botonConfirmReserLogged.click();
			}
				
		}
		
		public void compararFecha() throws AWTException, InterruptedException {
			
			revelarPagina();
			
			String primeraFechaFac=primeraFechaFactura.getText();
			String segundaFechaFac=segundaFechaFactura.getText();
			System.out.println("Primera fecha factura ----"+primeraFechaFac);
			System.out.println("Primera fecha ingresada ----"+consfechaIda);
			System.out.println("Segunda fecha factura ----"+segundaFechaFac);
			System.out.println("Segunda fecha ingresada----"+consfechaVuelta);
			
			if (primeraFechaFac.compareTo(consfechaIda)==0) {
				if (segundaFechaFac.compareTo(consfechaVuelta)==0) {
					System.out.println("Las Dos fechas son iguales");
				}else {
				System.out.println("Alguna de las fechas es distinta a la de la factura");
			} 
			}
				
		}
		
		public void tomarFactura() throws IOException {
			String facVuelo=factuVuelo.getText();
			FileWriter facturaTxt = new FileWriter("./Factura",true);
			facturaTxt.append(facVuelo);
			facturaTxt.close();
		}
	

}
