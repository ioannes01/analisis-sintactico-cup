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
public class AST_Expression_Ssig_Simple extends AST_Expression{

    public AST_Term N_Term;

    public AST_Expression_Ssig_Simple() {
    }

    public AST_Expression_Ssig_Simple(AST_Term N_Term) {
        this.N_Term = N_Term;
    }

    @Override
    public Object visit(visitor v){
        return v.visit_AST_Expression_Ssig_Simple(this);
    }


}
