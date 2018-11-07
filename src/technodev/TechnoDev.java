/*
    DESAFIO

    - Tienes que programar un botón sin la ayuda de Netbeans, 
    preferentemente con borde verde y que diga "feck you" se debe mostrar 
    en un JFrame.

    PLUS

    - Puedes hacer que el fondo del JFrame sea de un color oscuro
    - Descubre lo que son los <editor-fold> y usalos para ordenar variables y
    metodos
    
    * Programar un segundo boton, 10 pixeles abajo del primero, con borde
    rojo

    NORMAS

    - Puedes mirar la clase ejemplo.java PERO no puedes modificarla.
    - Solo la clase TechnoDev.java puede ser modificada.
    - No puedes copiar y pegar directamente, si es necesario reescribir codigo.
    Hazlo, pero nada de copy-paste
    - Para referirse a esta misma clase "this."
    - El codigo debe estar en ingles
    - El codigo debe estar tabulado
    - El codigo debe estar ordenado (por secciones)
    
    Todo lo que necesitas, lo tiene la clase ejemplo.java, no es necesario
    buscar información externa.

    RECOMENDACIONES

    - Lee todo
    - Conoce tu espacio de trabajo, analiza las herramientas que tienes.
    - Experimenta con lo que quieras
    - Si quieres añadir más contenido a este programa, será apreciado y te
    va a convenir
    - Resolver este ejercicio es conveniente para entender la logica de
    programación, la autonomia y entender cómo hacer lo que quieras.
    - En un programa real tienes estos 2 metodos para programar, los 2 están
    bien (yo trabajo sin la ayuda de Netbeans, osea, cómo esta clase)
    - Prueba con las recomendaciones que te da Netbeans
    
*/

package technodev;

import javax.swing.*;
import org.netbeans.lib.awtextra.AbsoluteLayout;

//safsafsafsafsafsa NUEVO

public class TechnoDev extends JFrame{
    
    public TechnoDev(){
        initFrame();
        initContent();
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new TechnoDev().setVisible(true);
        });
    }
    
    public void initFrame(){
        this.setTitle("Hola locos");
        this.setSize(1280, 720);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void initContent(){
        bt = new JButton();
        this.getContentPane().setLayout(new AbsoluteLayout());
    }
    
    private JButton bt;
    
}
