package org.example;

import org.example.models.Usuario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Programa en prueva");

            String fecha = "2025-12-02";
            SimpleDateFormat fechaForma = new SimpleDateFormat("yyyy-MM-dd");
            Date fechaApertura = fechaForma.parse(fecha);
            Usuario usuario = new Usuario(5, "Pablo", "pablo@gmail.com", "22Ed", "Basico", fechaApertura);

            System.out.println(usuario.getNombre() + usuario.getTipoUsuario());
        }catch (Exception exception){
            System.out.println("Error.");
        }
    }
}