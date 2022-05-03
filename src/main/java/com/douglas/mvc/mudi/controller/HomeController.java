package com.douglas.mvc.mudi.controller;

import com.douglas.mvc.mudi.model.Pedido;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model) {
        Pedido pedido = new Pedido();
        pedido.setNomeProduto("Xiaomi Redmi Note 11");
        pedido.setUrlImagem("https://m.media-amazon.com/images/I/41F0O3dOn+L._AC_SX569_.jpg");
        pedido.setUrlProduto("https://www.amazon.com.br/Xiaomi-Redmi-Note-11-Graphite/dp/B09QSB4N2C?ref_=Oct_d_obs_d_16243803011&pd_rd_w=YbKZE&pf_rd_p=574d7dde-c8d1-436d-a7fc-f2654a8c3190&pf_rd_r=MZNY49TSHR308TN88SWP&pd_rd_r=7569162c-3970-4fc3-9751-c1b086c04c6f&pd_rd_wg=IDm0x&pd_rd_i=B09QSB4N2C");
        pedido.setDescricao("Uma descrição qualquer para esse pedido");

        List<Pedido> pedidos = Arrays.asList(pedido);
        model.addAttribute("pedidos", pedidos);
        return "home";
    }
}
