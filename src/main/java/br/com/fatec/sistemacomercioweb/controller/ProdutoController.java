package br.com.fatec.sistemacomercioweb.controller;

import br.com.fatec.sistemacomercioweb.model.Produto;
import br.com.fatec.sistemacomercioweb.service.ProdutoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/produtos") // Alterado para o plural para seguir o padrão de /clientes
public class ProdutoController {

    private final ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }

    @GetMapping
    public String listar(Model model) {
        // Alterado o atributo para "produtos" (plural) para ficar claro que é uma lista no HTML
        model.addAttribute("produtos", service.listar());
        return "produtos/lista"; // Direciona para templates/produtos/lista.html
    }

    @GetMapping("/novo")
    public String novo(Model model) {
        // Corrigido de 'new produto()' para 'new Produto()' com 'P' maiúsculo da classe
        model.addAttribute("produto", new Produto());
        return "produtos/formulario"; // Direciona para templates/produtos/formulario.html
    }

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Produto produto) {
        service.cadastrar(produto);
        return "redirect:/produtos"; // Redireciona de volta para a lista de produtos
    }
}
