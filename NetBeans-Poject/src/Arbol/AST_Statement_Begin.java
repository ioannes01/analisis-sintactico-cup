/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Arbol;
import Visitor.*;

/**
 *
 * @author lidier
 */
public abstract class AST_Statement_Begin extends AST_Statement{

    public AST_Statement_Begin() {
    }

    public abstract Object visit(visitor v);

    

}
