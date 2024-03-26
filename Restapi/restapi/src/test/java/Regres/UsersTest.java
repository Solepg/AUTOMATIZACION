package Regres;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import org.apache.http.HttpStatus;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import utils.JsonSchemaValidator;

@SuppressWarnings("unused")
public class UsersTest {

    HttpClient clienthttp; 

    @BeforeEach
    public void setup (){
        System.out.println("Inicio de la configuración de la prueba Rest Api");

        clienthttp = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_1_1)
            .connectTimeout(Duration.ofSeconds(10))
            .build();
    }

    /**
     * @throws URISyntaxException
     * @throws IOException
     * @throws InterruptedException
     */
    @Test
    public void usersRegres () throws URISyntaxException, IOException, InterruptedException{

        URIBuilder uri = new URIBuilder()
            .setScheme("https")
            .setHost("reqres.in")
            .setPath("api/users?")
            .addParameter("delay", "3")
            .addParameter("page","2")
            .addParameter("id","12");
          
        System.out.println("Endpoint "  + uri.build());

        HttpRequest request = HttpRequest.newBuilder()
            .GET()
            .uri(uri.build())
            .build(); 

        HttpResponse <String> response = clienthttp.send(request, HttpResponse.BodyHandlers.ofString());
        
        System.out.println("Response: " + response.body());

        assertEquals(HttpStatus.SC_OK, response.statusCode());
        assertTrue(response.body().contains("\"name\":\"honeysuckle\""));       
     
        String validationSchema =  JsonSchemaValidator.validateJsonAgainstSchema(response.body(), "RegresSchema.json");
        System.out.println("Resultado de la validacion del Schema: " + validationSchema);
 
        assertEquals("", validationSchema, "Resultado de la validacion del schema");
    }         
}
