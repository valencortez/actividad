package act.example.actividad224.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class actHolaMundo {

    @GetMapping("/hola")
    public String holamundo (){
        return " BUENOS DIAS ESTRELLITAS LA TIERRA LES DICE HOLA!!";
    }


}
