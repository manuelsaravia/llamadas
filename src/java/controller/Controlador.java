/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.Conexion;
import util.ServicioEmail;

/**
 *
 * @author Manuel
 */
public class Controlador {

    private Conexion c;
    private Connection co;

    /**
     * Metodo que establece la conexion con la base de datos
     */
    private void conectar() {
        //String bd = "reinouni_0001";
        this.c = new Conexion();
        //this.c.setDireccion();
        //this.c.setBaseDatos(bd);
        this.c.conectar();
        this.co = this.c.getConexion();
        System.out.println("Conecto");

    }

    /**
     * Metodo que finaliza la conexion con la base de datos
     */
    private void desconectar() {
        try {
            this.co.close();
            this.co = null;
            this.c.desconectar();
            System.out.println("desconecto");
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /*
    public String agregarRegistrador(Registrador p) {
        String mensaje = "";
        this.conectar();
        try {
            this.co.setAutoCommit(false);
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        RegistradorDao ud = new RegistradorDao(this.co);
        mensaje = ud.agregarRegistrador(p);
        System.out.println(mensaje + "controlller");
        if (mensaje.equals("error")) {
            try {
                co.rollback();
                mensaje = "Ha ocurrido un error a la hora de registrar, Verifique los datos";
            } catch (SQLException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                ServicioEmail e = new ServicioEmail("piipsoft@gmail.com", "babas3185231745");
                e.enviarEmail(p.getCorreo(), "Bienvenido", "Bienvenido a RINHO, Sus datos para acceso al sistema seran:\n Documento: \n" + (long) p.getCedula() + " y Contraseña: " + p.getContrasenia() + "\n");
                //e.enviarEmail("asistencia@tucomunidadcolombia.co", "Nuevo Registro", "El usuario "+user.getNombre()+" "+user.getApellido()+" se ha registrado en el sistema");
                co.commit();
            } catch (SQLException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.desconectar();

        return mensaje;
    }*/
    
}