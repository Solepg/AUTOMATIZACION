
    import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
    import org.junit.jupiter.api.BeforeEach;
    import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
    
    /*  
    Ingresar a una plataforma de correo electronico
        1. Enviar un correo electronico
        2. Eliminar un correo
        3. Abrir un correo electronico
    Cerrar la sesion del correo electronico
    */

public class EmailTest {
         
    public class GoogleTest {
     
        WebDriver driver;
     
        @BeforeEach 
            public void setupScenario(){
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
        public void Enviarcorreoelectronico(){
            System.out.println("--------------------------");
            System.out.println("Enviar un correo electronico");
        }
       
        @Test
        public void Eliminacorreoelectronico(){
            System.out.println("---------------------------");
            System.out.println("Eliminar Correo electronico");
        }
     
        @Test
        public void Abrircorreoelectronico(){
            System.out.println("--------------------");
            System.out.println("Abrir Correo Electronico");
                       
        }
     
        @AfterEach
        public void cerrarNavegador(){
            driver.quit();
        }
    }   
}
