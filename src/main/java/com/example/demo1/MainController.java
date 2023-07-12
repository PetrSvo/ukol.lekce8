package com.example.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
@RestController
public class MainController {


   return importFromFile1("src/ukol/historic.txt");
   return importFromFile2("src/ukol/romantic.txt");
   return importFromFile3("src/ukol/scifi.txt");

      public String importFromFile1(String fileHistoric)
            throws FileNotFoundException
    {String text ="historic";
        try (Scanner scannerHistoric = new Scanner(new BufferedReader(new FileReader(fileHistoric)))) {
            while(scannerHistoric.hasNextLine())

            {
                text = scannerHistoric.nextLine();
            }
        } catch(FileNotFoundException e){
            throw new FileNotFoundException("Nepodarilo se nalést soubor" + fileHistoric);
        }
        return text;
    }





    public String importFromFile2(String fileRomantic)
            throws FileNotFoundException
    {String text ="romantic";
        try (Scanner scannerRomantic = new Scanner(new BufferedReader(new FileReader(fileRomantic)))) {
            while(scannerRomantic.hasNextLine())

            {
                text = scannerRomantic.nextLine();
            }
        } catch(FileNotFoundException e){
            throw new FileNotFoundException("Nepodarilo se nalést soubor" + fileRomantic);
        }
        return text;
    }



    public String importFromFile3(String fileScifi)
            throws FileNotFoundException
    {String text ="scifi";
        try (Scanner scannerScifi = new Scanner(new BufferedReader(new FileReader(fileScifi)))) {
            while(scannerScifi.hasNextLine())

            {
                text = scannerScifi.nextLine();
            }
        } catch(FileNotFoundException e){
            throw new FileNotFoundException("Nepodarilo se nalést soubor" + fileScifi);
        }
        return text;
    }
    public MainController() throws FileNotFoundException {
    }


    @GetMapping("/historic")
    public String scannerHistoric() throws FileNotFoundException {
    return importFromFile1("historic.txt");
}



 @GetMapping("/romantic")
   public String scannerRomantic() throws FileNotFoundException {
        return importFromFile2("romantic.txt");
 }



    @GetMapping("/scifi")
   public String scannerScifi() throws FileNotFoundException {
      return importFromFile3("scifi.txt");


}}



