package br.com.unicsul.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    @Qualifier("appDescricao")
    private String appDescricao;

    @GetMapping("/")
    public String apresentacao()
    {
        return "index";
    }

    @GetMapping("/descricao")
    public String idade(){
        return appDescricao;
    }

    @GetMapping("/rota1/{nome}")
    public String rota1(@PathVariable String nome, ModelMap model) {
        model.addAttribute("nome", nome);
        return "boasVindas";
    }

    @GetMapping("/rota2/{peso}/{altura}")
    public String rota2(@PathVariable Double peso, @PathVariable Double altura, ModelMap model) {
        model.addAttribute("peso", peso);
        model.addAttribute("altura", altura);
        return "exibicao";
    }

    @GetMapping("/rota3/{altura}/{peso}")
    public String rota3(@PathVariable Double altura, @PathVariable Double peso, ModelMap model) {
        double imc = calcularIMC(altura, peso);
        String resultado = interpretarIMC(imc);
        model.addAttribute("altura", altura);
        model.addAttribute("peso", peso);
        model.addAttribute("imc", imc);
        model.addAttribute("resultado", resultado);
        return "imc";
    }

    private double calcularIMC(double altura, double peso) {
        return peso / (altura * altura);
    }

    private String interpretarIMC(double imc) {
        if (imc < 18.5) {
            return "Você está abaixo do peso.";
        } else if (imc >= 18.5 && imc < 24.9) {
            return "Você está com o peso normal.";
        } else {
            return "Você está acima do peso.";
        }
    }
}