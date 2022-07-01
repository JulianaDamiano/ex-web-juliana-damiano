package com.nttdata.steps;

import com.nttdata.page.CalculatorPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CalculatorSteps {

    private WebDriver driver;

    //constructor

    public CalculatorSteps (WebDriver driver) {
        this.driver=driver;
    }

    /**
     * Escribir el primer numero
     *
     **/

    public void firstNumber(String numbera) {
        WebElement userInputElement =driver.findElement(CalculatorPage.firstInput);
        userInputElement.sendKeys(numbera);
    }

    /**
     * Escribir el segundo numero
     *
     * */

    public void secondNumber(String numberb){
        this.driver.findElement(CalculatorPage.secondInput).sendKeys(numberb);
    }

    /**
     * Hacer click en la lista de operadores
     */

    public void operador(String operador){
        this.driver.findElement(CalculatorPage.operatorList).sendKeys(operador);


    }

    public void calcular(){
        this.driver.findElement(CalculatorPage.calcularButton).click();


    }

    public void respuesta(){
        this.driver.findElement(CalculatorPage.respuesta).getText();
    }

}
