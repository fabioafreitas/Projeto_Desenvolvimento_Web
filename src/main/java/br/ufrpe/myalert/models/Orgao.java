package br.ufrpe.myalert.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "orgao")
public class Orgao {
    @Id
    private String id;
    private String uri;

    //TODO
}
