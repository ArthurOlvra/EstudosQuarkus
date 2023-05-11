package com.arthuroliveira.reserva;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import com.arthuroliveira.cliente.Cliente;

@RegisterRestClient(baseUri = "http://localhost:6060/Reserva")
public interface ReservaService {
    

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String newReserva(Cliente cliente);
}