package fr.studi.service;

import fr.studi.pojo.MyEntity;
import io.smallrye.mutiny.Uni;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class MyEntityService {


    public Uni<List<MyEntity>> getAllEntity(){
        return MyEntity.findAll().list();
    }
}
