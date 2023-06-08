package ec.edu.uce.git.srv;

public class Test {
    persona p1 = new persona("David", 25);
    public void saludo() {

        System.out.println("Hola Mundo, mi primer git clone");
        System.out.println("Nuevo aporte, git Actualizado");
        System.out.println("la edad de"+p1.getNombre()+" es "+p1.getEdad());
    }



}
