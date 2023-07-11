package com.example.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
@RestController
public class MainController {


    File fileHistoric = new File("C:\\Users\\svobp\\Desktop\\Open JDK\\ukol lekce 8\\historic.txt");
    File fileRomantic = new File("C:\\Users\\svobp\\Desktop\\Open JDK\\ukol lekce 8\\romantic.txt");
    File fileScifi = new File("C:\\Users\\svobp\\Desktop\\Open JDK\\ukol lekce 8\\scifi.txt");




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

     Scanner scannerRomantic;
    { scannerRomantic= new Scanner(fileRomantic);}

    public String importFromFile2(String fileRomantic)
            throws FileNotFoundException
    {String text= "romantic";
        try (Scanner scannerRomantic=new Scanner(new BufferedReader(new FileReader(fileRomantic)))){
            while(scannerRomantic.hasNextLine());
            {
                text=scannerRomantic.nextLine();
            }
        }catch(FileNotFoundException e){
            throw new FileNotFoundException("Nepodařilo se najít soubor"+fileRomantic);
        }return text;
    }


    Scanner scannerScifi;{
       scannerScifi =new Scanner(fileScifi);}

    public String importFromFile3(String fileScifi)
            throws FileNotFoundException
    {String text ="scifi";
        try (Scanner scannerScifi = new Scanner(new BufferedReader(new FileReader(fileHistoric)))) {
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


    Scanner scannerHistoric;

    {
        scannerHistoric = new Scanner(fileHistoric);
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



