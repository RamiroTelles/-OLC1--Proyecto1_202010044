
package proyecto1;


import com.mycompany.proyecto1.igu.Pantalla;
import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
//import java.util.ArrayList;

import structuras.arbol;
import structuras.automata;
import structuras.tran;
import java.util.ArrayList;
import structuras.fallos;

public class Proyecto1 {

    public static void main(String[] args) throws IOException {
       Pantalla panta = new Pantalla();
       panta.setVisible(true);
       panta.setLocationRelativeTo(null);
       
       
//       arbol a1 = new arbol("i");
//       arbol a2 = new arbol("n");
//       arbol a3 = new arbol("t");
//       arbol a4 = new arbol(".");
//       arbol a5 = new arbol(".");
//       a4.añadirHijo(a1);
//       a4.añadirHijo(a2);
//       a5.añadirHijo(a4);
//       a5.añadirHijo(a3);
//       
//       a5.imprimirInOrder(a5);

//        automata a1 = new automata();
//        
//        a1.setEstadoInicial("4");
//        a1.addEstadoFinal("9");
//        
//        a1.addTransicion("4", "epsilon", "0");
//        a1.addTransicion("4", "epsilon", "2");
//        
//        a1.addTransicion("0", "a", "1");
//        a1.addTransicion("2", "b", "3");
//        
//        a1.addTransicion("1", "epsilon", "8");
//        a1.addTransicion("3", "epsilon", "8");
//        
//        a1.addTransicion("8", "epsilon", "6");
//        a1.addTransicion("8", "epsilon", "9");
//        
//        a1.addTransicion("6", "c", "7");
//        a1.addTransicion("7", "epsilon", "6");
//        
//        a1.addTransicion("7", "epsilon", "9");
//        
//        System.out.println("------------------");
//        
//        a1.cambiarEstadoFinal("72");
//        
//        System.out.println("nuevo estado final");
        
//        
//        arbol or1 = new arbol("|");
//        or1.añadirHijo(new arbol("a"));
//        or1.añadirHijo(new arbol("b"));
//        
//        arbol cl1 = new arbol("*");
//        cl1.añadirHijo(new arbol("c"));
//        
//        arbol er1 = new arbol(".");
//        er1.añadirHijo(or1);
//        er1.añadirHijo(cl1);
//
//
//        System.out.println("-----------");
//        System.out.println("-----------");
//        
//        automata a1=er1.generarAutomata(er1,0);
//        
//        //generarGrafo(a1,"grafo1");
//        
//        System.out.println("-----------");
//        System.out.println("-----------");
     
    }
    

    
    
    
    
}