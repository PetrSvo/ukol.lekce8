package com.example.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
@RestController
public class MainController {


    File fileHistoric=new File("C:\\Users\\svobp\\Desktop\\Open JDK\\ukol lekce 8\\historic.txt");
    File fileRomantic=new File("C:\\Users\\svobp\\Desktop\\Open JDK\\ukol lekce 8\\romantic.txt");
    File fileScifi=new File("C:\\Users\\svobp\\Desktop\\Open JDK\\ukol lekce 8\\scifi.txt");

    Scanner scannerHistoric =new Scanner(fileHistoric);

    while (scannerHistoric.hasNextLine()) {
        String record =scannerHistoric.nextLine();
        System.out.println(record);
    }
    Scanner scannerRomantic=new Scanner(fileRomantic);

    while (scannerRomantic.hasNextLine()) {
        String record =scannerRomantic.nextLine();
        System.out.println(record);
    }
    Scanner scannerScifi=new Scanner(fileScifi);

    while (scannerScifi.hasNextLine()) {
        String record =scannerScifi.nextLine();
        System.out.println(record);
    }



    public MainController() throws FileNotFoundException {
    }

    @GetMapping("/historic")
    public scannerHistoric.hasNextLine()){
    return (scannerHistoric.nextLine());
}
    @GetMapping("/romantic")
    public File scannerRomantic() {
        return (fileRomantic);
    }

    @GetMapping("/scifi")
    public File scannerScifi() {
        return (fileScifi);


}
}


