/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stack;

import java.util.Stack;
/**
 *
 * @author VANIA
 */
public class Stack {
     public static void main(String arg[]) {

            String cadenano = "(Cadena no equilibrada en paréntesis(()()()))))";

            String cadenasi = "(Cadena equilibrada en parentesis())";

            System.out.println("Verificacion equilibrado en paréntesis para cadenano:");

            System.out.println(verificaParentesis(cadenano));

            System.out.println("Verificacion equilibrado en paréntesis para cadenasi:");

            System.out.println(verificaParentesis(cadenasi));

    }

 

    public static boolean verificaParentesis(String cadena)  {

        Stack<String> pila = new Stack<>();       int i = 0;

            while (i<cadena.length()) {  // Recorremos la expresión carácter a carácter

                if(cadena.charAt(i)=='(') {pila.push("(");} // Si el paréntesis es de apertura apilamos siempre                               

                else if  (cadena.charAt(i)==')') {  // Si el paréntesis es de cierre actuamos según el caso

                            if (!pila.empty()){ pila.pop(); } // Si la pila no está vacía desapilamos

                            else { pila.push(")"); break; } // La pila no puede empezar con un cierre, apilamos y salimos

                }

                i++;

            }

            if(pila.empty()){ return true; } else { return false; }

    }
}
