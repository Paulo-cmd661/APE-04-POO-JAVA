public class Prestamo {
    private Usuario usuario;
    private Libro libro;

    public Prestamo(Usuario usuario, Libro libro) {
        this.usuario = usuario;
        this.libro = libro;
    }

    public void registrar() {
        if (libro.prestar()) {
            System.out.println("Préstamo exitoso: " + usuario.getNombre()
                    + " (CI " + usuario.getCedula() + ") se llevó \""
                    + libro.getTitulo() + "\".");
        } else {
            System.out.println("No disponible: " + usuario.getNombre()
                    + " no pudo llevarse \"" + libro.getTitulo()
                    + "\" porque ya está prestado.");
        }
    }
}
