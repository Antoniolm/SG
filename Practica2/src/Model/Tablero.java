/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.media.j3d.BranchGroup;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.vecmath.Color3f;
import javax.vecmath.Vector3f;

/**
 *
 * @author LENOVO
 */
public class Tablero extends BranchGroup{
    
    public Tablero(Color3f color,Color3f color2){
         Tabla vertical=new Tabla(color);
         Tabla horizontal=new Tabla(color2);
         
         
         TransformGroup translacionverti=new TransformGroup();
         Vector3f vector=new Vector3f(0.0f,14.0f,1.0f);
         Transform3D trans=new Transform3D();
         trans.setTranslation(vector);
         translacionverti.setTransform(trans);
         
         TransformGroup rotacion=new TransformGroup();
         Transform3D rotacionx=new Transform3D();
         rotacionx.rotX(Math.PI/2);
         rotacion.setTransform(rotacionx);
         
         
         TransformGroup translacion=new TransformGroup();
         vector=new Vector3f(0.0f,0.0f,13.0f);
         trans=new Transform3D();
         trans.setTranslation(vector);
         translacion.setTransform(trans);
         
         
         
         
         
         rotacion.addChild(vertical);
         translacionverti.addChild(rotacion);
         translacion.addChild(horizontal);
         this.addChild(translacion);
         this.addChild(translacionverti);
         
    }
    
    
}