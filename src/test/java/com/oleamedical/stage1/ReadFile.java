package com.oleamedical.stage1;
import org.junit.jupiter.api.Test;

import java.io.*;



public class ReadFile {

    public static void main(String[] args) {
        // Création d’un fileReader pour lire le fichier
        try (InputStream stream = ReadFile.class.getResourceAsStream("/stage-1.lic");
            // Création d’un bufferedReader qui utilise le fileReader
            InputStream reader = new BufferedInputStream(stream)) {

            // une fonction à essayer pouvant générer une erreur
            byte[] c =  reader.readAllBytes();

            String a = new String(c);
            String[] array = a.split("_");

            System.out.println("La première partie du code est : " + array[0]);
            System.out.println("La deuxième partie du code est : " + array[1]);
            System.out.println("La troisième partie du code est : " + array[2]);
            System.out.println("La quatrième partie du code est : " + array[3]);
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }
}
