package models;

public class Empleado {
    private String codigo;
    private String nombreEmp;
    private int horasTrab;
    private double valorHora;
    private double sueldo;

    public Empleado() {
        this.codigo="00000";
        this.nombreEmp="sin definir";
        this.horasTrab=0;
        this.valorHora=0;
        this.sueldo=0;
    }

    public Empleado(String codigo, String nombreEmp, int horasTrab, double valorHora, double sueldo) {
        this.codigo = codigo;
        this.nombreEmp = nombreEmp;
        this.horasTrab = horasTrab;
        this.valorHora = valorHora;
        this.sueldo = sueldo;
    }

    public String getNombreEmp() {
        return nombreEmp;
    }

    public void setNombreEmp(String nombreEmp) {
        this.nombreEmp = nombreEmp;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setHorasTrab(int horasTrab) {
        this.horasTrab = horasTrab;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getSueldo() {
        return sueldo;
    }

}
