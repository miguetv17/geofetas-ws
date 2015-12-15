package com.geofertas.ws;

import com.geofertas.entities.Advertisement;
import com.geofertas.entities.User;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by whoami on 11/22/15.
 * Defines the web service interface
 */
@Path("/")
@Produces("application/json")
@Consumes("application/json")
@WebService(name = "geofertasService")
public interface GeofertasService {


    @GET
    @Produces({MediaType.APPLICATION_JSON})
    @Path("/test")
    String test();
    User authenticate(String username, String hashPassword);
    List<Advertisement> getAdvertisements(Double lat, Double lon);
    Boolean saveAdvertisement(Integer advertisementID, Integer userId);
    List<Advertisement> getSavedAdvertisements(Integer userID);
    User updateUser(User user);
    @POST
    @Path("/registerUser")
    User registerUser(String username, String lastname, String firstname, String email, String password, String authenticationType);
    Boolean resetPasword(Integer userID);




}
