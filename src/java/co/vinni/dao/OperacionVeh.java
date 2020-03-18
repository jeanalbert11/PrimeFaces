/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.vinni.dao;

import co.vinni.dto.Vehiculo;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

/**
 *
 * @author Sala 30
 */
public class OperacionVeh {
    
    public int crear(Vehiculo dato){
        Conexion c = new Conexion();
        Connection con = c.conectarse();
        // SQL
        // Statement
        // PreparedStatement
        // CallableStatement  
        
        return 0;
    }
    public int editar(Vehiculo dato){
        return 0;
    }
    public int borrar(Vehiculo dato){
        return 0;
    }
    public int borrar(String pk){
        return 0;
    }
    public Vehiculo consulta(String pk){
        return null;
    }
    public List<Vehiculo> consulta(){
        return null;
    }
    
}
