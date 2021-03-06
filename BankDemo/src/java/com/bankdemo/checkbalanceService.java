/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bankdemo;

import java.io.StringWriter;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXB;

/**
 * REST Web Service
 *
 * @author LAB
 */
@Path("checkbalance")
public class checkbalanceService {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of checkbalanceService
     */
    public checkbalanceService() {
    }

    /**
     * Retrieves representation of an instance of com.bankdemo.checkbalanceService
     * @return an instance of java.lang.String
     */
     @GET
    @Path("{accountNumber}") //parameter
    @Produces(MediaType.APPLICATION_XML)
    public String getXml(@PathParam("accountNumber") String accountNumber) {
        
        //connect db
        //select account number
        //get balance
        
        
        //String message = "Balance of account number " + accountNumber + "is" 0.0;
        String message = "0.0";
        StringWriter writer = new StringWriter();
        JAXB.marshal(message, writer); //mashall as XML
        return writer.toString();
    
    }

    

    /**
     * PUT method for updating or creating an instance of checkbalanceService
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
}
