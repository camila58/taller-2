package com.ufro.cl.talle_recuperativ.controladores;

import com.ufro.cl.talle_recuperativ.modelo.Horario;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HorarioControlador {
    Horario hor = Horario.getHorario();
    int dia=0;
    int peroiodo=0;

    @GetMapping("/")
    public String getHorario(){
        return "/horarioPag";
    }

    @PostMapping("/seleccionar")
    public void seleccionarHorario(){
        System.out.println("");
    }

}
