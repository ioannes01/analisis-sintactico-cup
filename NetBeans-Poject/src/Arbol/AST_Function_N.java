/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Arbol;

/**
 *
 * @author lidier
 */
public class AST_Function_N extends AST_Function{

    public String name;
    public AST_Block N_Block;

    public AST_Function_N() {
    }

    public AST_Function_N(String name, AST_Block N_Block) {
        this.name = name;
        this.N_Block = N_Block;
    }




}
