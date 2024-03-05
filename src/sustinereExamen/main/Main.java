package sustinereExamen.main;

import sustinereExamen.classes.Student;
import sustinereExamen.classes.SustinereExamen;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(123, "Pop Denis", "popdenis24@stud.ase.ro", 3);
        Student student2 = new Student(124, "Tudor Florina", "tudorflorina20@stud.ase.ro", 2);
        Student student3 = new Student(125, "Tudor Mihai Andrei", "mihaiandrei29@stud.ase.ro", 1);
        Student student4 = new Student(126, "Gigel Gheprghe", "gigelgheprghe24@stud.ase.ro", 3);

        SustinereExamen examenPoo = new SustinereExamen("Programare Orientata Obiect");
        SustinereExamen examenCTS = new SustinereExamen("Calitate si Testare Software");

        examenPoo.inregistrareStudent(student1);
        examenPoo.inregistrareStudent(student2);
        examenPoo.inregistrareStudent(student1);
        examenPoo.inregistrareStudent(student3);
        examenPoo.inregistrareStudent(student4);
        examenPoo.inregistrareStudent(student2);
    }
}
