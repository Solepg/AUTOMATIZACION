package com.litethinking;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
      WebDriver driver = new ChromeDriver();
    
      driver.get("https://www.demoblaze.com");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

      WebElement Phones = driver.findElement(By.linkText("Phones"));
      Phones.click();
      WebElement Phones1 = driver.findElement(By.linkText("HTC One M9"));
      Phones1.click();
      WebElement Precio = driver.findElement(By.className("price-container"));
    
      System.out.println("HTC One M9: " + Precio.getText());
        
      if (Precio.getText().equals("$700 *includes tax")) {
        System.out.println("Prueba Exitosa!!");
      } 
      else 
      {
        System.out.println("Prueba Fallida");
      }

      WebElement salir = driver.findElement(By.id("nava"));
      salir.click();
   
      WebElement Phones2 = driver.findElement(By.linkText("Phones"));
      Phones2.click();
      try
        {
        WebElement Phones3 = driver.findElement(By.linkText("MacBook air"));
        Phones3.click();
        WebElement Precio4 = driver.findElement(By.className("price-container"));
        System.out.println("MacBook air: " + Precio4.getText());
        if (Precio4.getText().equals("$700 *includes tax")) {
        System.out.println("Prueba Exitosa!!");
        } else {
        System.out.println("Prueba Fallida");
        }
     
        }
      catch(Exception e)
        {
        System.out.println("Producto MacBook air no encontrado");
        }
    
      WebElement salir4 = driver.findElement(By.id("nava"));
      salir4.click();

      WebElement Laptops = driver.findElement(By.linkText("Laptops"));
      Laptops.click();
      WebElement Laptops1 = driver.findElement(By.linkText("MacBook Pro"));
      Laptops1.click();
      WebElement Precio1 = driver.findElement(By.className("price-container"));
    
      System.out.println("Precio MacBook Pro: " + Precio1.getText());
    
      if (Precio1.getText().equals("$1100 *includes tax")) {
      System.out.println("Prueba Exitosa!!");
      } 
      else {
      System.out.println("Prueba Fallida");
      }

      WebElement salir1 = driver.findElement(By.id("nava"));
      salir1.click();

      WebElement Laptops3 = driver.findElement(By.linkText("Laptops"));
      Laptops3.click();
      WebElement Laptops4 = driver.findElement(By.linkText("Dell i7 8gb"));
      Laptops4.click();
      WebElement Precio2 = driver.findElement(By.className("price-container"));
      
      System.out.println("Precio Dell i7 8gb: " + Precio2.getText());

      if (Precio2.getText().equals("$700 *includes tax")) {
      System.out.println("Prueba Exitosa!!");
      } 
      else {
      System.out.println("Prueba Fallida");
      }

      WebElement salir2 = driver.findElement(By.id("nava"));
      salir2.click();

      WebElement Monitors = driver.findElement(By.linkText("Monitors"));
      Monitors.click();
      WebElement Monitors1 = driver.findElement(By.linkText("ASUS Full HD"));
      Monitors1.click();
      WebElement Precio3 = driver.findElement(By.className("price-container"));
      
      System.out.println("Precio ASUS Full HD: " + Precio3.getText());

      if (Precio3.getText().equals("$230 *includes tax")) {
      System.out.println("Prueba Exitosa!!");
      } 
      else {
      System.out.println("Prueba Fallida");
      }

      WebElement salir3 = driver.findElement(By.id("nava"));
      salir3.click();

      driver.close();
      driver.quit();
 
    }
}