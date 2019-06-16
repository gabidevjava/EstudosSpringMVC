package br.com.casadocodigo.loja.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.casadocodigo.loja.models.Produto;

@Controller
public class ProdutosController {
	
	@RequestMapping("produtos/form")
	public String form() {
		return "produtos/form";
	}
	
	@RequestMapping("produtos")
	public String grava(Produto produto) {
		System.out.println(produto);
		
		return "produtos/ok";
	}
	
}
