package Clase.readers;

import Clase.Angajat;
import Clase.Aplicant;
import Clase.interfaces.AplicantReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatReader extends AplicantReader {

    public AngajatReader(String fileName) {
        super(fileName);
    }

    @Override
    public List<Aplicant> read() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        scanner.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<>();

        while (scanner.hasNext()) {
            Angajat angajat=new Angajat();
            super.readAplicant(scanner,angajat);
            int salariu = scanner.nextInt();
            String ocupatie = scanner.next();
            angajat.setOcupatie(ocupatie);
            angajat.setSalariu(salariu);
            angajati.add(angajat);
        }
        scanner.close();
        return angajati;
    }
}
