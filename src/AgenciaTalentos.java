public class AgenciaTalentos {
    private Cliente[] clientes;
    private final int MAX_CLIENTES;
    private int numeroClientes;

    public AgenciaTalentos(int max_clientes) {
        MAX_CLIENTES = max_clientes;
        clientes = new Cliente[MAX_CLIENTES];
    }

    private int validarMaxClientes(int max_clientes) {
        int num_max_clientes;
        if (max_clientes < 1 ) {
            num_max_clientes = 10;
        }  else {
            num_max_clientes = max_clientes;
        }
        return num_max_clientes;
    }

    public Cliente buscarCliente(int id){
        Cliente cliente = null;
        for (int i = 0; cliente == null && i < MAX_CLIENTES; i++) {
            if (clientes[i] != null && clientes[i].getId() == id) {
                cliente = clientes[i];
            }
        }
        return cliente;
    }

    private int buscarPrimerHuecoLibre(){
        int primerHuecoLibre = -1;
        for (int i = 0 ; primerHuecoLibre == -1 && i < MAX_CLIENTES; i++){
            if (clientes[i] == null){
                primerHuecoLibre = i;
            }
        }
        return primerHuecoLibre;
    }

    public boolean registrarCliente(Cliente cliente){
        boolean clienteRegistradoCorrectamente = false;
        int primerHuecoLibre = 0;
        if (buscarCliente(cliente.getId()) == null){
            clienteRegistradoCorrectamente = true;
        }
        if (clienteRegistradoCorrectamente){
            primerHuecoLibre = buscarPrimerHuecoLibre();
        }
        if (primerHuecoLibre != -1){
            clientes[primerHuecoLibre] = cliente;
            numeroClientes++;
        } else {
            clienteRegistradoCorrectamente = false;
        }
        return  clienteRegistradoCorrectamente;
    }

    public String mostrarClientes(){
        StringBuilder sb = new StringBuilder();
        for(Cliente c : clientes){
            if (c != null){
                sb.append(c.toString());
            }
        }
        return sb.toString();
    }



    public int contarClientes(){
        int contadorClientes = 0 ;
        for(Cliente c : clientes){
            if (c != null){
                contadorClientes += 1;
            }
        }
        return contadorClientes;
    }
}
