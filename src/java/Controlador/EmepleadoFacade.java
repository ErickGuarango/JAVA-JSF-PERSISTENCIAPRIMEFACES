/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Emepleado;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ASUS TUF
 */
@Stateless
public class EmepleadoFacade extends AbstractFacade<Emepleado> {

    @PersistenceContext(unitName = "EjemploJsf5PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EmepleadoFacade() {
        super(Emepleado.class);
    }
    
}
