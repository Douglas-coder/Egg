package POOExercises.Retos.Gym.Servicios;

import POOExercises.Retos.Gym.Cliente;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;

public class ServicioCliente extends Cliente {

    ArrayList<Cliente> clientes = new ArrayList<>();


    public void registarCliente(Cliente cliente) {
        setId((int) Math.random() * 50);
        clientes.add(cliente);
    }


    public ArrayList<Cliente> obtenerClientes() {
        return clientes;
    }


    public Optional<Cliente> actualizarCliente(int id, String nombre, int edad, double altura, double peso, String objetivo) {

        for (Cliente cliente : clientes) {
            if (Objects.equals(cliente.getId(), id)) {
                cliente.setNombre(nombre);
                cliente.setEdad(edad);
                cliente.setAltura(altura);
                cliente.setPeso(peso);
                cliente.setObjetivo(objetivo);
                return Optional.of(cliente);
            }
        }

        return Optional.empty();

    }


    public boolean eliminarCliente(int id) {
        for (Cliente cliente : clientes) {
            if (Objects.equals(cliente.getId(), id)) {
                clientes.remove(cliente);
                return true;
            }
        }

        return false;

    }

}
