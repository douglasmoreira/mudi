package com.douglas.mvc.mudi.controller;

import com.douglas.mvc.mudi.model.Pedido;
import com.douglas.mvc.mudi.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private PedidoRepository pedidoRepository;

    @GetMapping("/home")
    public String home(Model model) {

        List<Pedido> pedidos = pedidoRepository.recuperaTodosPedidos();

        model.addAttribute("pedidos", pedidos);
        return "home";
    }
}
