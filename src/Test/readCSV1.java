/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ryan
 */
public class readCSV1 {

    public static void main(String[] args) {
        String fileName = "src/DataJawa.csv";
        File file = new File(fileName);
        try {
            Scanner inputStream = new Scanner(file);
//            inputStream.useDelimiter(",");
            while (inputStream.hasNext()) {
                String data = inputStream.next();
//               data.replaceAll("\\s", "");
//               data.split(",");
                System.out.println(data + " ");
            }
            inputStream.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(readCSV1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
