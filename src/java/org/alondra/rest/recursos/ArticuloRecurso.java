
package org.alondra.rest.recursos;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.alondra.rest.modelo.Articulo;

@Path("/articulos")
public class ArticuloRecurso {
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Articulo getArticulos(){
        Articulo articulo = new Articulo(1,"Mi primer articulo","Este es el contenido", "Alondra");
        return articulo;
        
    }
}
