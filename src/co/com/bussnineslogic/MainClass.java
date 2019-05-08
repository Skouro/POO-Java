package co.com.bussnineslogic;

import co.com.beans.Aprendiz;
import co.com.beans.Competencia;
import co.com.beans.Ficha;
import co.com.beans.ProgramaFormacion;

import javax.swing.*;
import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        ProgramaFormacion programaFormacion = new ProgramaFormacion(); // creamos un programa de formacion

        // Competencias
        Competencia basesDeDatos = new Competencia("1", "3 mese", "Bases de datos", "Normalizar bases de datos");

        Competencia java = new Competencia("", "3 mese", "Inicio de la programacion con Java", "Conocer los conceptos basicos  de la programacíon con Java ");
        // Listas de competencias

        ArrayList<Competencia> competencias = new ArrayList<Competencia>();

        competencias.add(basesDeDatos);
        competencias.add(java);

        programaFormacion.setCompetencias(competencias);

        // Aprendices
        Aprendiz daniel = new Aprendiz(3, "Daniel", "Amaya Ruiz", "464565645"); // Crear un aprendiz

        Aprendiz esteban = new Aprendiz(1, "Esteban", "Estrada", "23423442"); // Crear un aprendiz

        Aprendiz mariana = new Aprendiz(2, "Mariana", "Estrada", "238942304"); // Crear un aprendiz
        // Lista de aprendices
        ArrayList<Aprendiz> aprendices = new ArrayList<Aprendiz>();
        aprendices.add(esteban);
        aprendices.add(daniel);

        Ficha adsi = new Ficha("1598765", programaFormacion, aprendices); // Crear una adsi

        for (Competencia competencia :
                adsi.getProgramaFormacion().getCompetencias()) {
            System.out.println(String.format("%s das", competencia.getNombre()));
        }

//        for (Aprendiz ap :
//                adsi.getAprendices()) {
//            System.out.println("ap = " + ap.getNombres());
//        }
//
//        aprendices.add(mariana);
//
//        System.out.println("------------------");
//
//        for (Aprendiz ap :
//                adsi.getAprendices()) {
//            System.out.println("ap = " + ap.getNombres());
//        }

//        JOptionPane.showMessageDialog(null, String.format(" %o %s %s %s", daniel.getId(), daniel.getNombres(), daniel.getApellidos(), daniel.getTelefono()));
    }
}
