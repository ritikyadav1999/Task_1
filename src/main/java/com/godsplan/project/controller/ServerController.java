package com.godsplan.project.controller;


import com.godsplan.project.model.Server;
import com.godsplan.project.service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ServerController {

    @Autowired
    private ServerService service;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Server createServer(@RequestBody Server server){
        return service.addServer(server);
    }

    @GetMapping("/getAll")
    public List<Server> getServer(){
        return service.getAllServer();
    }

    @GetMapping("/name/{name}")
    public List<Server> getServerByName(@PathVariable String name){
        return service.getByServerName(name);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteServer(@PathVariable String id){
        return service.deleteServer(id);
    }





}
