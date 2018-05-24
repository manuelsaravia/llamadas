/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Manuel
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("SELECT f.idFacturaVenta, f.formaPago, e.nombre\n"
                    + "FROM facturaventa f, empleado e\n"
                    + "WHERE e.idEmpleado = f.idEmpleado\n"
                    + "AND f.idAdministrador ="+1+" and fecha \n"
                            + "BETWEEN CAST(\"" + "2016/07/10" + "\" AS DATE ) \n"
                            + "AND CAST(\"" + "2016/07/10" + "\" AS DATE) ;");
       
    }
    private static String cambiarFormato(String segundos) {
        System.out.println(segundos);
        int timeSec = Integer.parseInt(segundos);
        
        int m = timeSec / 60;
        int s = timeSec - (m*60) ;
        System.out.println(s);
        System.out.println(m);
        int h = 0;
        if (m > 59) {
            h = m / 60;
            m = m % 60;
        }
        String tiempo = h + ":" + m + ":" + s;
        return tiempo;
    }
    
}
