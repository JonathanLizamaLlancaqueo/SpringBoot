package ufro.com.holaMundo.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ufro.com.holaMundo.modelo.Persona;

import java.util.ArrayList;

@Controller
public class Controlador {
    /*Método que muestra la pagina en localHost:8080/index*/
    @GetMapping("/index")
    public String index(Model modelo) {
        var saludar = "hola mundo con thymeleaf";
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Jonathan",23,1.59,"18.223.192-2"));
        personas.add(new Persona("Anastasia",26,1.70,"17.124.931-1"));
        personas.add(new Persona("Jeison",20,1.67,"22.333.921-6"));
        personas.add(new Persona("Tamara",20,1.55,"20.221.748-3"));
        modelo.addAttribute("mensaje", saludar);  // mandamos el atributo al index para luego ser mostrado en la vista
        modelo.addAttribute("titulo","pagina web");
        // pasamos las personas al index.html para luego ser mostradas
        modelo.addAttribute("personas",personas);
        return "index";
    }
}

