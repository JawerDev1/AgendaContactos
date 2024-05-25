package com.Proyecto6;

import java.util.HashMap;

public class Agenda {

    private static HashMap<String, Contacto> contactos = new HashMap<>();

    public static void agregarContacto(Contacto contacto){
        contactos.put(contacto.getNombre(), contacto);
        System.out.println("Contacto agregado.");
    }

    public static void eliminarContacto(String nombre){
        contactos.remove(nombre);
        System.out.println("Contacto eliminado.");
    }

    public static Contacto buscarContacto(String nombre){
        return contactos.get(nombre);
    }

    public static void actualizarTelefono(String nombre, String telefono){
        Contacto contacto = contactos.get(nombre);
        if (contacto != null){
            contacto.setTelefono(telefono);
            System.out.println("Telefono actualizado.");
        }else {
            System.out.println("El contacto no existe.");
        }
    }

    public static void imprimirContacto(){
        for (Contacto contacto : contactos.values()){
            System.out.println(contacto.getNombre() + " - " + contacto.getTelefono());
        }
    }


}
