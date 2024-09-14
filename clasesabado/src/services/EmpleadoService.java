package services;

import models.Empleado;

import java.util.Scanner;

public class EmpleadoService {
    private Scanner sc;
    private Empleado empleado;
    private Empleado listaEmpleados[];

    public EmpleadoService() {
        this.sc = new Scanner(System.in);
        crearListaEmpleados();
    }
    public void crearListaEmpleados(){
        System.out.println("Ingrese la cantidad de empleados");
        int cantidad = sc.nextInt();
        listaEmpleados = new Empleado[cantidad];
    }
    public void menu(){
        int seleccion;
        do {
            System.out.println("------MENU------");
            System.out.println("1. Crear empleado.");
            System.out.println("2. Modificar empleado.");
            System.out.println("3. Buscar empleado.");
            System.out.println("4. Listar empleados.");
            System.out.println("0. Salir");
            System.out.println("Ingrese el valor del menú");
            seleccion=sc.nextInt();
            switch (seleccion){
                case 1 -> crearEmpleado();
                case 2 -> modificarEmpleado();
                case 3 -> buscarEmpleado();
                case 4 -> listarEmpleado();
                default -> {
                    seleccion=0;
                    System.out.println("Gracias por usar este menú");
                }
            }
        }while (seleccion != 0);
    }
    private void crearEmpleado(){
        System.out.println("-----Crear empleados-----");
        for (int i = 0; i < listaEmpleados.length; i++) {
            System.out.println("Ingrese el codigo");
            String codigo = sc.next();
            System.out.println("ingrese el nombre del empleado");
            String nombre = sc.next();
            System.out.println("Ingrese las horas trabajadas");
            int horas = sc.nextInt();
            System.out.println("Ingrese el valor de la hora");
            double valor = sc.nextDouble();
            empleado = new Empleado(codigo,nombre,horas,valor,calcularSueldo(horas,valor));
        }
    }
    private void modificarEmpleado(){}
    private void buscarEmpleado(){}
    private void listarEmpleado(){
        System.out.println("-----Listar empleados-----");
        for (int i = 0; i < listaEmpleados.length; i++) {
            empleado=listaEmpleados[i];
            System.out.println(empleado.getCodigo() + " | " + empleado.getNombreEmp() + " | " + empleado.getSueldo());
        }
    }
    private double calcularSueldo(int horas, double valorHora){
        return horas*valorHora;}
}
