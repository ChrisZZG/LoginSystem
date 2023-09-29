/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginform.Persistencia;

import com.mycompany.loginform.Logica.User;
import java.util.List;

/**
 *
 * @author crist
 */
public class ControladoraPersistencia {
    
    //Instance UserJpaController
    UserJpaController userJpa = new UserJpaController();

    public List<User> findUsers() {

        return userJpa.findUserEntities();
    }
    
    
}
