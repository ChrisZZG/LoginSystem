/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginform.Logica;

import com.mycompany.loginform.Persistencia.ControladoraPersistencia;
import java.util.List;

/**
 *
 * @author crist
 */
public class Controladora {
    
    //Instance ControladoraPersistencia
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public String validation(String userName, String password) {
        
        String message = "";
        
        List<User> listUsers = controlPersis.findUsers();
        
        for(User user:listUsers){
            if(userName.equals(user.getUserName())){
                if(password.equals(user.getPassword())){
                    message = "WELCOME";
                    return message;
                }else{
                    message = "WRONG PASSWORD";
                    return message;
                }
            }else{
                message = "WRONG USER";
            }
        }
        
        return message;

    }
    
}
