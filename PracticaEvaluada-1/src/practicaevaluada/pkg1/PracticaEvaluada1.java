/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaevaluada.pkg1;

import javax.swing.JOptionPane;
/**
 *
 * @author Aulas Heredia
 */
public class PracticaEvaluada1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Variables
        String ConvertidorPersonas;
        String ConvertidorSalario;
        int CantidadEmpleados;
        double Salario;
        

        //Solicita los datos y los convierte
        System.out.println("Bienvenidos");
        ConvertidorPersonas = JOptionPane.showInputDialog("Digite la cantidad de empleados deseada");
        CantidadEmpleados = Integer.parseInt(ConvertidorPersonas);
        System.out.println("La cantidad de empleados es" + CantidadEmpleados);

        ConvertidorSalario = JOptionPane.showInputDialog("Digite el salario de cada uno");
        Salario = Double.parseDouble(ConvertidorSalario);
        System.out.println("El salario es" + Salario);

    }

}
