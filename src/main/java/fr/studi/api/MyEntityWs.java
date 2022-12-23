package fr.studi.api;

import fr.studi.pojo.MyEntity;
import fr.studi.service.MyEntityService;
import io.smallrye.mutiny.Uni;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/hello")
public class MyEntityWs {

    @Inject
    MyEntityService myEntityService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<List<MyEntity>> getAllMyEntity() {
        return myEntityService.getAllEntity();
    }
}