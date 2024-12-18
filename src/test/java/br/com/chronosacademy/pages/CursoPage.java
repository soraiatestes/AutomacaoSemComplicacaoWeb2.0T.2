package br.com.chronosacademy.pages;

import br.com.chronosacademy.maps.Cursomap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CursoPage {
    private WebDriver driver;
    private Cursomap cursomap;

    public CursoPage(WebDriver driver) {
        this.driver = driver;
        cursomap = new Cursomap();
        PageFactory.initElements(driver, cursomap);
    }
    public String getTitulo2() {
        return cursomap.h2Titulo.getText();
    }
}
