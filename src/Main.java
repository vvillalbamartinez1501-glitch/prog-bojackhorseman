public class Main {
    public static void main(String[] args){
        Cliente cliente1 = new Cliente("BoJack Horseman", "Actor", 25);

        Cliente cliente2 = new Cliente("Mr. Peanutbutter", "Actor y Presentador", 3);

        Cliente cliente3 = new Cliente("Sarah Lynn", "Cantante y Actriz", 18);

        Cliente cliente4 = new Cliente("Todd Chavez", "Emprendedor", 1);

        Cliente cliente5 = new Cliente("Margo Martindale", "Actriz de carácter", 8);

        AgenciaTalentos agenciaMissCaroline = new AgenciaTalentos(10);

        agenciaMissCaroline.registrarCliente(cliente3);
        agenciaMissCaroline.registrarCliente(cliente2);
        agenciaMissCaroline.registrarCliente(cliente5);
        agenciaMissCaroline.registrarCliente(cliente1);
        agenciaMissCaroline.registrarCliente(cliente4);
        agenciaMissCaroline.registrarCliente(cliente1);

        System.out.println(agenciaMissCaroline.mostrarClientes());

        agenciaMissCaroline.ordenarClientes();
        System.out.println(agenciaMissCaroline.mostrarClientes());


    }
}
