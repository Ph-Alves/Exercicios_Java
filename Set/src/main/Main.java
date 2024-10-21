package main;

import Entities.Aluno;
import Entities.Instrutor;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String[] cursos = {"A", "B", "C"};
        Instrutor instrutor = new Instrutor(cursos);
        Set<Aluno> a = new HashSet<>();
        Set<Aluno> b = new HashSet<>();
        Set<Aluno> c = new HashSet<>();
        System.out.printf("How many students for course A?");
        int quantity = sc.nextInt();
        instrutor.cadastro(a, sc, quantity);
        System.out.printf("How many students for course B?");
        quantity = sc.nextInt();
        instrutor.cadastro(b, sc, quantity);
        System.out.printf("How many students for course C?");
        quantity = sc.nextInt();
        instrutor.cadastro(c, sc, quantity);

        instrutor.totalAlunos(a,b,c);

    }
}
