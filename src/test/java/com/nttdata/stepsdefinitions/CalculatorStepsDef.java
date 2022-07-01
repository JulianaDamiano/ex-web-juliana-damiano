package com.nttdata.stepsdefinitions;

import com.nttdata.steps.CalculatorSteps;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculatorStepsDef {

    private WebDriver driver;
    private Scenario scenario;


    private CalculatorSteps calculatorSteps(WebDriver driver) {
        return new CalculatorSteps(driver);
    }

    @Before(order=0)
    public void setUp(){
        //setUp
        System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\Git carpeta\\ex-web-juliana-damiano\\drivers\\chromedriver.exe");
        //Crear el driver
        driver= new ChromeDriver();
        //max
        driver.manage().window().maximize();
    }
    //Esto se ejecuta antes de la prueba
    @Before(order=1)
    public void setScenario(Scenario scenario){
        this.scenario=scenario;
    }

    @After
    public void quitDriver(){
        driver.quit();
        //Para cerrar el driver
    }

    @Dado("que me encuentro en la pagina de Basic Calculator")
    public void que_me_encuentro_en_la_pagina_de_basic_calculator() {
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
        screenShot();
    }
    @Cuando("ingreso First number {string}, Second number {string}, selecciono el operation {string}")
    public void ingresoFirstNumberSecondNumberSeleccionoElOperation(String numbera, String numberb, String operador) {

        CalculatorSteps calculSteps =new CalculatorSteps(driver);
        calculSteps.firstNumber(numbera);
        calculSteps.secondNumber(numberb);
        calculSteps.operador(operador);
        calculSteps.calcular();
        screenShot();
    }
    @Entonces("valido que debería aparecer el resultado")
    public void valido_que_debería_aparecer_el_resultado() {
        //int resultado = calculatorSteps(driver);
        //prueba: validar que al menos existe un item
        screenShot();
    }

    public void screenShot(){
        byte[] evidencia=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        this.scenario.attach(evidencia,"image/png","evidencias");
    }



}
