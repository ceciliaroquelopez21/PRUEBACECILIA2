package pe.com.bcp.techcases.testautomation.ui.steps;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import org.junit.jupiter.api.Assertions;
import pe.com.bcp.techcases.testautomation.ui.actors.DefaultUser;

import java.util.logging.Level;
import java.util.logging.Logger;


public class DemoQAStepDefinitions {

    @Steps
    private DefaultUser jhon;

    /**
     * Si envias las credenciales por DataTables, esribe el código necesario para definir el nuevo Step y la recepcion
     * de los datos de la tabla de datos. Utilizar dataTables da mayor flexibilidad para el ingreso de datos de prueba.
     */

    @Dado("el usuario {user}")
    public void a(DefaultUser user) {
        Logger.getLogger(this.getClass().getName())
                .log(Level.INFO, "El usuario {0}", user);
    }

    @Cuando("visita la pagina {page}")
    public void visits(Class<PageObject> page) {
        jhon.goToPage(page);
    }

    @Cuando("completa {string} con {string}")
    public void fillsWith(String field, String value) {
        jhon.fillsField(field, value);
    }

    @Cuando("hace clic en {string}")
    public void clicksOn(String elementName) throws IllegalAccessException {
        jhon.clicksOn(elementName);
    }

    @Entonces("en la pagina debería mostrarse")
    public void thePageSays(String text) throws IllegalAccessException {
        Assertions.assertTrue(jhon.isAbleToSee(text),
                "El mensaje esperado '" + text + "' no se ha mostrado.");
    }


}