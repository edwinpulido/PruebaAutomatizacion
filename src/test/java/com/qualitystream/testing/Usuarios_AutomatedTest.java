package com.qualitystream.testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.Theory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usuarios_AutomatedTest {

	private WebDriver driver;
	By UserIdentification = By.name("identification");
	By UserName = By.name("name");
	By UserLastName = By.name("lastname");
	By UserEmail = By.name("email");
	By UserPhone = By.name("phone");
	By ButtonRegister = By.name("registrar");

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromeDriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:4200/");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
	
	@Test // validación campo cedula 
	public void registerUser() throws InterruptedException {

		/* Ingreso de datos registro usuario */

		driver.findElement(UserIdentification).sendKeys("");

		driver.findElement(UserName).sendKeys("Pedro");

		driver.findElement(UserLastName).sendKeys("Pulido");

		driver.findElement(UserEmail).sendKeys("camila@gmail.com");

		driver.findElement(UserPhone).sendKeys("3205846845");

		driver.findElement(ButtonRegister).click();
		Thread.sleep(2000);

		Alert alert = driver.switchTo().alert();
		String printRegister = alert.getText();

		/*Validación de campos ingresados*/  

		if (printRegister.equals("Debe ingresar un número de identificación")) {
			alert.accept();
			System.out.print("Validación de Cedula correcta");
		} else {
			System.out.print("No se presento el escenario Cedula\n");
		}

		if (printRegister.equals("Debe ingresar un nombre")) {
			System.out.print("Validación de Nombres correctos\n");
			alert.accept();
		} else {
			System.out.print("No se presento el escenario Nombres\n");
		}

		if (printRegister.equals("Debe ingresar los apellidos")) {
			System.out.print("Validación de Apellidos correcta\n");
			alert.accept();
		} else {
			System.out.print("No se presento el escenario Apellidos\n");
		}

		if (printRegister.equals("El email ingresado no es valido")) {
			System.out.print("Validación de Email correcta\n");
			alert.accept();
		} else {
			System.out.print("No se presento el escenario Email\n");
		}

		if (printRegister.equals("Debe ingresar un número de telefono")) {
			alert.accept();
			System.out.print("Validación de Telefono correcto\n");
		} else {
			System.out.print("No se presento el escenario Telefono\n");
		}

		/* Validación de usuarios registrados */

		if (printRegister.equals("usuario registrado exitosamente")) {
			alert.accept();
			System.out.print("EL usuario fue registrado\n");
		} else {
			System.out.print("No se presento el escenario registro exitoso\n");
		}
		if (printRegister.equals("el documento ingresado ya existe")) {
			alert.accept();
			System.out.print("El usuario no fue ingresado debido a que ya existe el mismo documento\n");
		} else {
			System.out.print("No se presento el escenario numero de documento duplicado\n");
		}

		if (printRegister.equals("el correo ingresado ya existe")) {
			alert.accept();
			System.out.print("El usuario no fue ingresado debido a que ya existe el mismo Correo\n");
		} else {
			System.out.print("No se presento el escenario correo duplicado\n");
		}

	}
	
	@Test // validación campo nombre
	public void registerUser2() throws InterruptedException {

		/* Ingreso de datos registro usuario */

		driver.findElement(UserIdentification).sendKeys("78151556");

		driver.findElement(UserName).sendKeys("");

		driver.findElement(UserLastName).sendKeys("Pulido");

		driver.findElement(UserEmail).sendKeys("camila@gmail.com");

		driver.findElement(UserPhone).sendKeys("3205846845");

		driver.findElement(ButtonRegister).click();
		Thread.sleep(2000);

		Alert alert = driver.switchTo().alert();
		String printRegister = alert.getText();

		/*Validación de campos ingresados*/  

		if (printRegister.equals("Debe ingresar un número de identificación")) {
			alert.accept();
			System.out.print("Validación de Cedula correcta");
		} else {
			System.out.print("No se presento el escenario Cedula\n");
		}

		if (printRegister.equals("Debe ingresar un nombre")) {
			System.out.print("Validación de Nombres correctos\n");
			alert.accept();
		} else {
			System.out.print("No se presento el escenario Nombres\n");
		}

		if (printRegister.equals("Debe ingresar los apellidos")) {
			System.out.print("Validación de Apellidos correcta\n");
			alert.accept();
		} else {
			System.out.print("No se presento el escenario Apellidos\n");
		}

		if (printRegister.equals("El email ingresado no es valido")) {
			System.out.print("Validación de Email correcta\n");
			alert.accept();
		} else {
			System.out.print("No se presento el escenario Email\n");
		}

		if (printRegister.equals("Debe ingresar un número de telefono")) {
			alert.accept();
			System.out.print("Validación de Telefono correcto\n");
		} else {
			System.out.print("No se presento el escenario Telefono\n");
		}

		/* Validación de usuarios registrados */

		if (printRegister.equals("usuario registrado exitosamente")) {
			alert.accept();
			System.out.print("EL usuario fue registrado\n");
		} else {
			System.out.print("No se presento el escenario registro exitoso\n");
		}
		if (printRegister.equals("el documento ingresado ya existe")) {
			alert.accept();
			System.out.print("El usuario no fue ingresado debido a que ya existe el mismo documento\n");
		} else {
			System.out.print("No se presento el escenario numero de documento duplicado\n");
		}

		if (printRegister.equals("el correo ingresado ya existe")) {
			alert.accept();
			System.out.print("El usuario no fue ingresado debido a que ya existe el mismo Correo\n");
		} else {
			System.out.print("No se presento el escenario correo duplicado\n");
		}

	}
	
	@Test // validación campo apellidos
	public void registerUser3() throws InterruptedException {

		/* Ingreso de datos registro usuario */

		driver.findElement(UserIdentification).sendKeys("12587464");

		driver.findElement(UserName).sendKeys("Mario");

		driver.findElement(UserLastName).sendKeys("");

		driver.findElement(UserEmail).sendKeys("camila@gmail.com");

		driver.findElement(UserPhone).sendKeys("3205846845");

		driver.findElement(ButtonRegister).click();
		Thread.sleep(2000);

		Alert alert = driver.switchTo().alert();
		String printRegister = alert.getText();

		/*Validación de campos ingresados*/  

		if (printRegister.equals("Debe ingresar un número de identificación")) {
			alert.accept();
			System.out.print("Validación de Cedula correcta");
		} else {
			System.out.print("No se presento el escenario Cedula\n");
		}

		if (printRegister.equals("Debe ingresar un nombre")) {
			System.out.print("Validación de Nombres correctos\n");
			alert.accept();
		} else {
			System.out.print("No se presento el escenario Nombres\n");
		}

		if (printRegister.equals("Debe ingresar los apellidos")) {
			System.out.print("Validación de Apellidos correcta\n");
			alert.accept();
		} else {
			System.out.print("No se presento el escenario Apellidos\n");
		}

		if (printRegister.equals("El email ingresado no es valido")) {
			System.out.print("Validación de Email correcta\n");
			alert.accept();
		} else {
			System.out.print("No se presento el escenario Email\n");
		}

		if (printRegister.equals("Debe ingresar un número de telefono")) {
			alert.accept();
			System.out.print("Validación de Telefono correcto\n");
		} else {
			System.out.print("No se presento el escenario Telefono\n");
		}

		/* Validación de usuarios registrados */

		if (printRegister.equals("usuario registrado exitosamente")) {
			alert.accept();
			System.out.print("EL usuario fue registrado\n");
		} else {
			System.out.print("No se presento el escenario registro exitoso\n");
		}
		if (printRegister.equals("el documento ingresado ya existe")) {
			alert.accept();
			System.out.print("El usuario no fue ingresado debido a que ya existe el mismo documento\n");
		} else {
			System.out.print("No se presento el escenario numero de documento duplicado\n");
		}

		if (printRegister.equals("el correo ingresado ya existe")) {
			alert.accept();
			System.out.print("El usuario no fue ingresado debido a que ya existe el mismo Correo\n");
		} else {
			System.out.print("No se presento el escenario correo duplicado\n");
		}

	}
	@Test // validación campo correo vacio
	public void registerUser4() throws InterruptedException {

		/* Ingreso de datos registro usuario */

		driver.findElement(UserIdentification).sendKeys("12587464");

		driver.findElement(UserName).sendKeys("Mario");

		driver.findElement(UserLastName).sendKeys("Pulido");

		driver.findElement(UserEmail).sendKeys("");

		driver.findElement(UserPhone).sendKeys("3205846845");

		driver.findElement(ButtonRegister).click();
		Thread.sleep(2000);

		Alert alert = driver.switchTo().alert();
		String printRegister = alert.getText();

		/*Validación de campos ingresados*/  

		if (printRegister.equals("Debe ingresar un número de identificación")) {
			alert.accept();
			System.out.print("Validación de Cedula correcta");
		} else {
			System.out.print("No se presento el escenario Cedula\n");
		}

		if (printRegister.equals("Debe ingresar un nombre")) {
			System.out.print("Validación de Nombres correctos\n");
			alert.accept();
		} else {
			System.out.print("No se presento el escenario Nombres\n");
		}

		if (printRegister.equals("Debe ingresar los apellidos")) {
			System.out.print("Validación de Apellidos correcta\n");
			alert.accept();
		} else {
			System.out.print("No se presento el escenario Apellidos\n");
		}

		if (printRegister.equals("El email ingresado no es valido")) {
			System.out.print("Validación de Email correcta\n");
			alert.accept();
		} else {
			System.out.print("No se presento el escenario Email\n");
		}

		if (printRegister.equals("Debe ingresar un número de telefono")) {
			alert.accept();
			System.out.print("Validación de Telefono correcto\n");
		} else {
			System.out.print("No se presento el escenario Telefono\n");
		}

		/* Validación de usuarios registrados */

		if (printRegister.equals("usuario registrado exitosamente")) {
			alert.accept();
			System.out.print("EL usuario fue registrado\n");
		} else {
			System.out.print("No se presento el escenario registro exitoso\n");
		}
		if (printRegister.equals("el documento ingresado ya existe")) {
			alert.accept();
			System.out.print("El usuario no fue ingresado debido a que ya existe el mismo documento\n");
		} else {
			System.out.print("No se presento el escenario numero de documento duplicado\n");
		}

		if (printRegister.equals("el correo ingresado ya existe")) {
			alert.accept();
			System.out.print("El usuario no fue ingresado debido a que ya existe el mismo Correo\n");
		} else {
			System.out.print("No se presento el escenario correo duplicado\n");
		}

	}
	
	@Test // validación campo telefono
	public void registerUser5() throws InterruptedException {

		/* Ingreso de datos registro usuario */

		driver.findElement(UserIdentification).sendKeys("12587464");

		driver.findElement(UserName).sendKeys("Mario");

		driver.findElement(UserLastName).sendKeys("Pulido");

		driver.findElement(UserEmail).sendKeys("mario@gmail.com");

		driver.findElement(UserPhone).sendKeys("");

		driver.findElement(ButtonRegister).click();
		Thread.sleep(2000);

		Alert alert = driver.switchTo().alert();
		String printRegister = alert.getText();

		/*Validación de campos ingresados*/  

		if (printRegister.equals("Debe ingresar un número de identificación")) {
			alert.accept();
			System.out.print("Validación de Cedula correcta");
		} else {
			System.out.print("No se presento el escenario Cedula\n");
		}

		if (printRegister.equals("Debe ingresar un nombre")) {
			System.out.print("Validación de Nombres correctos\n");
			alert.accept();
		} else {
			System.out.print("No se presento el escenario Nombres\n");
		}

		if (printRegister.equals("Debe ingresar los apellidos")) {
			System.out.print("Validación de Apellidos correcta\n");
			alert.accept();
		} else {
			System.out.print("No se presento el escenario Apellidos\n");
		}

		if (printRegister.equals("El email ingresado no es valido")) {
			System.out.print("Validación de Email correcta\n");
			alert.accept();
		} else {
			System.out.print("No se presento el escenario Email\n");
		}

		if (printRegister.equals("Debe ingresar un número de telefono")) {
			alert.accept();
			System.out.print("Validación de Telefono correcto\n");
		} else {
			System.out.print("No se presento el escenario Telefono\n");
		}

		/* Validación de usuarios registrados */

		if (printRegister.equals("usuario registrado exitosamente")) {
			alert.accept();
			System.out.print("EL usuario fue registrado\n");
		} else {
			System.out.print("No se presento el escenario registro exitoso\n");
		}
		if (printRegister.equals("el documento ingresado ya existe")) {
			alert.accept();
			System.out.print("El usuario no fue ingresado debido a que ya existe el mismo documento\n");
		} else {
			System.out.print("No se presento el escenario numero de documento duplicado\n");
		}

		if (printRegister.equals("el correo ingresado ya existe")) {
			alert.accept();
			System.out.print("El usuario no fue ingresado debido a que ya existe el mismo Correo\n");
		} else {
			System.out.print("No se presento el escenario correo duplicado\n");
		}

	}
	@Test // validación campo correo invalido
	public void registerUser6() throws InterruptedException {

		/* Ingreso de datos registro usuario */

		driver.findElement(UserIdentification).sendKeys("12587464");

		driver.findElement(UserName).sendKeys("Mario");

		driver.findElement(UserLastName).sendKeys("Pulido");

		driver.findElement(UserEmail).sendKeys("mariogmailcom");

		driver.findElement(UserPhone).sendKeys("3205897458");

		driver.findElement(ButtonRegister).click();
		Thread.sleep(2000);

		Alert alert = driver.switchTo().alert();
		String printRegister = alert.getText();

		/*Validación de campos ingresados*/  

		if (printRegister.equals("Debe ingresar un número de identificación")) {
			alert.accept();
			System.out.print("Validación de Cedula correcta");
		} else {
			System.out.print("No se presento el escenario Cedula\n");
		}

		if (printRegister.equals("Debe ingresar un nombre")) {
			System.out.print("Validación de Nombres correctos\n");
			alert.accept();
		} else {
			System.out.print("No se presento el escenario Nombres\n");
		}

		if (printRegister.equals("Debe ingresar los apellidos")) {
			System.out.print("Validación de Apellidos correcta\n");
			alert.accept();
		} else {
			System.out.print("No se presento el escenario Apellidos\n");
		}

		if (printRegister.equals("El email ingresado no es valido")) {
			System.out.print("Validación de Email correcta\n");
			alert.accept();
		} else {
			System.out.print("No se presento el escenario Email\n");
		}

		if (printRegister.equals("Debe ingresar un número de telefono")) {
			alert.accept();
			System.out.print("Validación de Telefono correcto\n");
		} else {
			System.out.print("No se presento el escenario Telefono\n");
		}

		/* Validación de usuarios registrados */

		if (printRegister.equals("usuario registrado exitosamente")) {
			alert.accept();
			System.out.print("EL usuario fue registrado\n");
		} else {
			System.out.print("No se presento el escenario registro exitoso\n");
		}
		if (printRegister.equals("el documento ingresado ya existe")) {
			alert.accept();
			System.out.print("El usuario no fue ingresado debido a que ya existe el mismo documento\n");
		} else {
			System.out.print("No se presento el escenario numero de documento duplicado\n");
		}

		if (printRegister.equals("el correo ingresado ya existe")) {
			alert.accept();
			System.out.print("El usuario no fue ingresado debido a que ya existe el mismo Correo\n");
		} else {
			System.out.print("No se presento el escenario correo duplicado\n");
		}

	}
	@Test // validación registro exitoso
	public void registerUser7() throws InterruptedException {

		/* Ingreso de datos registro usuario */

		driver.findElement(UserIdentification).sendKeys("12587464");

		driver.findElement(UserName).sendKeys("Mario");

		driver.findElement(UserLastName).sendKeys("Pulido");

		driver.findElement(UserEmail).sendKeys("mario@gmail.com");

		driver.findElement(UserPhone).sendKeys("3205897458");

		driver.findElement(ButtonRegister).click();
		Thread.sleep(2000);

		Alert alert = driver.switchTo().alert();
		String printRegister = alert.getText();

		/*Validación de campos ingresados*/  

		if (printRegister.equals("Debe ingresar un número de identificación")) {
			alert.accept();
			System.out.print("Validación de Cedula correcta");
		} else {
			System.out.print("No se presento el escenario Cedula\n");
		}

		if (printRegister.equals("Debe ingresar un nombre")) {
			System.out.print("Validación de Nombres correctos\n");
			alert.accept();
		} else {
			System.out.print("No se presento el escenario Nombres\n");
		}

		if (printRegister.equals("Debe ingresar los apellidos")) {
			System.out.print("Validación de Apellidos correcta\n");
			alert.accept();
		} else {
			System.out.print("No se presento el escenario Apellidos\n");
		}

		if (printRegister.equals("El email ingresado no es valido")) {
			System.out.print("Validación de Email correcta\n");
			alert.accept();
		} else {
			System.out.print("No se presento el escenario Email\n");
		}

		if (printRegister.equals("Debe ingresar un número de telefono")) {
			alert.accept();
			System.out.print("Validación de Telefono correcto\n");
		} else {
			System.out.print("No se presento el escenario Telefono\n");
		}

		/* Validación de usuarios registrados */

		if (printRegister.equals("usuario registrado exitosamente")) {
			alert.accept();
			System.out.print("EL usuario fue registrado\n");
		} else {
			System.out.print("No se presento el escenario registro exitoso\n");
		}
		if (printRegister.equals("el documento ingresado ya existe")) {
			alert.accept();
			System.out.print("El usuario no fue ingresado debido a que ya existe el mismo documento\n");
		} else {
			System.out.print("No se presento el escenario numero de documento duplicado\n");
		}

		if (printRegister.equals("el correo ingresado ya existe")) {
			alert.accept();
			System.out.print("El usuario no fue ingresado debido a que ya existe el mismo Correo\n");
		} else {
			System.out.print("No se presento el escenario correo duplicado\n");
		}

	}
	@Test // alidación cedula duplicada
	public void registerUser8() throws InterruptedException {

		/* Ingreso de datos registro usuario */

		driver.findElement(UserIdentification).sendKeys("12587464");

		driver.findElement(UserName).sendKeys("Marta");

		driver.findElement(UserLastName).sendKeys("Pulido");

		driver.findElement(UserEmail).sendKeys("marta@gmail.com");

		driver.findElement(UserPhone).sendKeys("3205897458");

		driver.findElement(ButtonRegister).click();
		Thread.sleep(2000);

		Alert alert = driver.switchTo().alert();
		String printRegister = alert.getText();

		/*Validación de campos ingresados*/  

		if (printRegister.equals("Debe ingresar un número de identificación")) {
			alert.accept();
			System.out.print("Validación de Cedula correcta");
		} else {
			System.out.print("No se presento el escenario Cedula\n");
		}

		if (printRegister.equals("Debe ingresar un nombre")) {
			System.out.print("Validación de Nombres correctos\n");
			alert.accept();
		} else {
			System.out.print("No se presento el escenario Nombres\n");
		}

		if (printRegister.equals("Debe ingresar los apellidos")) {
			System.out.print("Validación de Apellidos correcta\n");
			alert.accept();
		} else {
			System.out.print("No se presento el escenario Apellidos\n");
		}

		if (printRegister.equals("El email ingresado no es valido")) {
			System.out.print("Validación de Email correcta\n");
			alert.accept();
		} else {
			System.out.print("No se presento el escenario Email\n");
		}

		if (printRegister.equals("Debe ingresar un número de telefono")) {
			alert.accept();
			System.out.print("Validación de Telefono correcto\n");
		} else {
			System.out.print("No se presento el escenario Telefono\n");
		}

		/* Validación de usuarios registrados */

		if (printRegister.equals("usuario registrado exitosamente")) {
			alert.accept();
			System.out.print("EL usuario fue registrado\n");
		} else {
			System.out.print("No se presento el escenario registro exitoso\n");
		}
		if (printRegister.equals("el documento ingresado ya existe")) {
			alert.accept();
			System.out.print("El usuario no fue ingresado debido a que ya existe el mismo documento\n");
		} else {
			System.out.print("No se presento el escenario numero de documento duplicado\n");
		}

		if (printRegister.equals("el correo ingresado ya existe")) {
			alert.accept();
			System.out.print("El usuario no fue ingresado debido a que ya existe el mismo Correo\n");
		} else {
			System.out.print("No se presento el escenario correo duplicado\n");
		}

	}
	
	@Test // validación correo duplicado
	public void registerUser9() throws InterruptedException {

		/* Ingreso de datos registro usuario */

		driver.findElement(UserIdentification).sendKeys("589456895");

		driver.findElement(UserName).sendKeys("Mario");

		driver.findElement(UserLastName).sendKeys("Pulido");

		driver.findElement(UserEmail).sendKeys("mario@gmail.com");

		driver.findElement(UserPhone).sendKeys("3205897458");

		driver.findElement(ButtonRegister).click();
		Thread.sleep(2000);

		Alert alert = driver.switchTo().alert();
		String printRegister = alert.getText();

		/*Validación de campos ingresados*/  

		if (printRegister.equals("Debe ingresar un número de identificación")) {
			alert.accept();
			System.out.print("Validación de Cedula correcta");
		} else {
			System.out.print("No se presento el escenario Cedula\n");
		}

		if (printRegister.equals("Debe ingresar un nombre")) {
			System.out.print("Validación de Nombres correctos\n");
			alert.accept();
		} else {
			System.out.print("No se presento el escenario Nombres\n");
		}

		if (printRegister.equals("Debe ingresar los apellidos")) {
			System.out.print("Validación de Apellidos correcta\n");
			alert.accept();
		} else {
			System.out.print("No se presento el escenario Apellidos\n");
		}

		if (printRegister.equals("El email ingresado no es valido")) {
			System.out.print("Validación de Email correcta\n");
			alert.accept();
		} else {
			System.out.print("No se presento el escenario Email\n");
		}

		if (printRegister.equals("Debe ingresar un número de telefono")) {
			alert.accept();
			System.out.print("Validación de Telefono correcto\n");
		} else {
			System.out.print("No se presento el escenario Telefono\n");
		}

		/* Validación de usuarios registrados */

		if (printRegister.equals("usuario registrado exitosamente")) {
			alert.accept();
			System.out.print("EL usuario fue registrado\n");
		} else {
			System.out.print("No se presento el escenario registro exitoso\n");
		}
		if (printRegister.equals("el documento ingresado ya existe")) {
			alert.accept();
			System.out.print("El usuario no fue ingresado debido a que ya existe el mismo documento\n");
		} else {
			System.out.print("No se presento el escenario numero de documento duplicado\n");
		}

		if (printRegister.equals("el correo ingresado ya existe")) {
			alert.accept();
			System.out.print("El usuario no fue ingresado debido a que ya existe el mismo Correo\n");
		} else {
			System.out.print("No se presento el escenario correo duplicado\n");
		}

	}

}
