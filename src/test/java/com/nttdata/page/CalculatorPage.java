package com.nttdata.page;

import org.openqa.selenium.By;

public class CalculatorPage {
    public static By firstInput = By.id("number1Field");
    public static By secondInput = By.id("number2Field");
    public static By operatorList =By.id("selectOperationDropdown");
    public static By calcularButton= By.id("calculateButton");

    public static By respuesta =By.id("numberAnswerField");
}
