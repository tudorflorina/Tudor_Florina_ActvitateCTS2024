package Clase.readers;

import Clase.Aplicant;
import Clase.Elev;
import Clase.interfaces.AplicantReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElevReader extends AplicantReader {

    public ElevReader(String fileName) {
        super(fileName);
    }

    @Override
    public List<Aplicant> read() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        scanner.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<>();

        while (scanner.hasNext()) {
            Elev elev=new Elev();
            super.readAplicant(scanner,elev);
            int clasa = scanner.nextInt();
            String tutore = scanner.next();
            elev.setTutore(tutore);
            elev.setClasa(clasa);
            elevi.add(elev);
        }

        scanner.close();
        return elevi;
    }
}
