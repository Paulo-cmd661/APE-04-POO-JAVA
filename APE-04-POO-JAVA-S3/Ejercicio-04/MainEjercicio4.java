public class MainEjercicio4 {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("Paulo", 500.0);
        Cuenta c2 = new Cuenta("Mateo", 100.0);

        System.out.println("--- Saldos iniciales ---");
        c1.mostrarSaldo();
        c2.mostrarSaldo();

        System.out.println("\n--- Transferencia válida ---");
        c1.transferir(c2, 200.0);

        System.out.println("\n--- Transferencia que falla ---");
        c1.transferir(c2, 1000.0);

        System.out.println("\n--- Saldos finales ---");
        c1.mostrarSaldo();
        c2.mostrarSaldo();
    }
}
