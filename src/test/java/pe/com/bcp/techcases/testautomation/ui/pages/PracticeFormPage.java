package pe.com.bcp.techcases.testautomation.ui.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.logging.Level;
import java.util.logging.Logger;

@DefaultUrl("page:demoqa.page")
public class PracticeFormPage extends PageObject {

    private String fieldsXpath = "//input[contains(@placeholder,'%s')]";

    /**
     * Metodo que completa los campos del formulario con el valor enviado
     * @param elementName Nombre del campo que se muestra en el formulario
     * @param value Valor a completar dentro de los campos del formulario
     */
    public void fills(String elementName, String value) {
        Logger.getLogger(this.getClass().getName())
                        .log(Level.INFO, "Fills {0} in {1}",
                                new Object[]{elementName, value});

        getDriver().findElement(By.xpath(String.format(fieldsXpath, elementName)));

    }
}