package Main;

import Clase.Angajat;
import Clase.Aplicant;
import Clase.interfaces.AplicantReader;
import Clase.readers.AngajatReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Aplicant> listaAngajati;
        AplicantReader angajatReader=new AngajatReader("angajati.txt");


        try {
            listaAngajati = angajatReader.read();
            for(Aplicant angajat:listaAngajati)
                System.out.println(angajat.toString());
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
