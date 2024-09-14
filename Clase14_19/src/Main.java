public class Main {
    public static void main(String[] args){
        //Añadir al otro codigo


    }

    public class EmpleadoService{
        private void  crearEmpleado(){
            System.out.println(" CRREAR EMPLEADO ");
            System.out.println(" Ingrese el codigo");
            String codigo = sc.nextInt();


            Empleado empleadoEncontrado;
            for (Empleado empleado : listaEmpleados){
                if (codigo.equals(empleado.getCodigo())){
                    //metodo que visualice al empleado encontrado:  tarea
                    empleadoEncontrado = empleado;
                    break;
                }
            }

        }
    }
}
//Linea 76 tambien se modifico
