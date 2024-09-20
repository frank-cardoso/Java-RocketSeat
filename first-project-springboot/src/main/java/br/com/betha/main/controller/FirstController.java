package br.com.betha.main.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/fisrtMethod")
public class FirstController {

    @GetMapping("/fisrtMethod/{id}")
    public String fisrtMethod(@PathVariable String id) {
        return "O paramétro é " + id;
    }

    @GetMapping("/methodQueryParams")
    public String methodQueryParams(@RequestParam String id) {
        return "O paramétro com methodQueryParams é " + id;
    }

    @GetMapping("/methodQueryParams2")
    public String methodQueryParams2(@RequestParam Map<String, String> allParams) {
        return "O paramétro com methodQueryParams2 é" + allParams.entrySet();
    }

    @PostMapping("/methodBodyParams")
    public String methodBodyParams(@RequestBody Usuario usuario) {
        return "username: " + usuario.username();
    }

    @PostMapping("/methodHeaders")
    public String methodBodyParams(@RequestHeader("name") String name) {
        return "methodHeaders: " + name;
    }

    @PostMapping("/methodListHeaders")
    public String methodListHeaders(@RequestHeader Map<String, String> headers){
        return "methodHeaders: " + headers.entrySet();
    }

    @GetMapping("/methodResponseEntity/{id}")
    public ResponseEntity<Object> methodResponseEntity(@PathVariable Long id) {
        var usuario = new Usuario("João");

        if (id > 5) {
            return ResponseEntity.status(HttpStatus.OK).body(usuario);
        }
        return ResponseEntity.badRequest().body("Giovanni vai ter que rebolar pros cria por comprar 50 milhoes de pods");
    }

    record Usuario(String username){}
}
