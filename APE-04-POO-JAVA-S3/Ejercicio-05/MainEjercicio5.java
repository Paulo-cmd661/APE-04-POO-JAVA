public class MainEjercicio5 {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Adrián", "1800000001");
        Usuario u2 = new Usuario("Ariel", "1800000002");
        Libro libro = new Libro("Fundamentos de Programación");

        Prestamo p1 = new Prestamo(u1, libro);
        Prestamo p2 = new Prestamo(u2, libro);

        p1.registrar(); // éxito
        p2.registrar(); // falla: mismo libro
    }
}
