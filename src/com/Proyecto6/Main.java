package com.Proyecto6;

public class Main {

    public static void main(String[] args) {
        //Crear algunos contactos
        Contacto contacto1 = new Contacto("Jhon", "324111232");
        Contacto contacto2 = new Contacto("Jawer", "321334134");
        Contacto contacto3 = new Contacto("Juan", "312221332");

        //Agregar contactos a la agenda
        Agenda.agregarContacto(contacto1);
        Agenda.agregarContacto(contacto2);
        Agenda.agregarContacto(contacto3);

        //Buscar contacto
       Contacto contactoEncontrado = Agenda.buscarContacto("Jhon");
       System.out.println("Telefono de " + contactoEncontrado.getNombre() + " - " + contactoEncontrado.getTelefono());

        //Actializar el telefono
        Agenda.actualizarTelefono("Jhon", "43231312");

        //Eliminar contacto
        Agenda.eliminarContacto("Jawer");

        Agenda.imprimirContacto();

    }
}
