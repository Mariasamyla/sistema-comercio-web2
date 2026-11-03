package br.com.fatec.sistemacomercioweb.controller;

import br.com.fatec.sistemacomercioweb.model.Cliente;
import br.com.fatec.sistemacomercioweb.service.ClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/clientes")
public class ClienteController {
    private final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("clientes", service.listar());
        return "clientes/lista";
    }

    @GetMapping("/novo")
    public String novo(Model model) {
        model.addAttribute("cliente", new Cliente());
        return "clientes/formulario";
    }

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Cliente cliente) {
        service.cadastrar(cliente);
        return "redirect:/clientes";
    }
}