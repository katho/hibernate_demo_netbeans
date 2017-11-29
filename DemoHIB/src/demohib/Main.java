/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demohib;

import com.demo.hib.Usuario;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author catarino
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
	Session session = sessionFactory.openSession();
	Transaction tr = session.beginTransaction();
	Usuario user = new Usuario();
	user.setNombreUsuario("Katarino");
	
	session.save(user);
	tr.commit();
	System.out.println("Se guardó satisfactoriamente");
	sessionFactory.close();
    }
    
}
