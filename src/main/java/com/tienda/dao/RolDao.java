/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.dao;

import com.tienda.domain.Categoria;
import com.tienda.domain.Rol;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author steve
 */
public interface RolDao extends CrudRepository<Rol,Long>{
    
    
    
}
