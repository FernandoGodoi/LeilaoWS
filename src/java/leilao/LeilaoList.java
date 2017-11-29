/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leilao;

import com.google.gson.Gson;
import com.sun.org.apache.bcel.internal.generic.L2D;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Fernando
 */
@Path("leilao")
public class LeilaoList {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of LeilaoList
     */
    

    public LeilaoList() {
    }

    /**
     * Retrieves representation of an instance of leilao.LeilaoList
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        Gson g = new Gson();
        ArrayList<Produto> lista = new ArrayList<>();
        Produto p = new Produto("PC","Intel I7 7200", 2000);
        lista.add(p);
        p = new Produto("PC","Intel I5 7200U", 2500);
        lista.add(p);              
        return  g.toJson(lista); 
    }

    /**
     * PUT method for updating or creating an instance of LeilaoList
     *
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
       
    }
}
