package com.example.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
@RestController
public class MainController {


    File fileHistoric=new File("C:\\Users\\svobp\\Desktop\\Open JDK\\ukol lekce 8\\historic.txt");
    File fileRomantic=new File("C:\\Users\\svobp\\Desktop\\Open JDK\\ukol lekce 8\\romantic.txt");
    File fileScifi=new File("C:\\Users\\svobp\\Desktop\\Open JDK\\ukol lekce 8\\scifi.txt");

    Scanner scannerHistoric =new Scanner(fileHistoric);
    Scanner scannerRomantic=new Scanner(fileRomantic);
    Scanner scannerScifi=new Scanner(fileScifi);

    public MainController() throws FileNotFoundException {
    }

    @GetMapping("/historic")
public File scannerHistoric() {
    return (fileHistoric);
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


