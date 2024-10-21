package Entities;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Instrutor {

    private String[] cursos;

    public Instrutor(String[] cursos){
        this.cursos = cursos;
    }

    public String[] getCursos() {
        return cursos;
    }

    public void setCursos(String[] cursos) {
        this.cursos = cursos;
    }

    public void cadastro(Set<Aluno> set, Scanner sc, int quantity){
        for (int i = 0; i < quantity; i++){
            int id = sc.nextInt();
            set.add(new Aluno(id));
        }
    }

    public void totalAlunos(Set<Aluno> a, Set<Aluno> b, Set<Aluno> c){
        Set<Aluno> totalSet = new HashSet<>();
        totalSet.addAll(a);
        totalSet.addAll(b);
        totalSet.addAll(c);
        System.out.println("Total Students: " + totalSet.size());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Arrays.deepHashCode(this.cursos);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Instrutor other = (Instrutor) obj;
        return Arrays.deepEquals(this.cursos, other.cursos);
    }

    
}
