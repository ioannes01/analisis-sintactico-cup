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
public class AST_Constant_Simple extends AST_Constant {

    public AST_Constant_Def N_Constant_Def;



    public AST_Constant_Simple() {
    }

    public AST_Constant_Simple(AST_Constant_Def N_Constant_Def) {
        this.N_Constant_Def = N_Constant_Def;
    }

    @Override
    public Object visit(visitor v){
        return v.visit_AST_Constant_Simple(this);
    }





}
