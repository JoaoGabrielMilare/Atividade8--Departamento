package com.example.Departamentos.Controller;

import com.example.Departamentos.Model.Departamento;
import com.example.Departamentos.Services.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departamentos")
public class DepartamentoController {

    @Autowired
    private DepartamentoService service;

    @PostMapping
    public Departamento criarDepartamento(@RequestBody Departamento departamento) {
        return service.criarDepartamento(departamento);
    }

    @GetMapping
    public List<Departamento> listarDepartamentos() {
        return service.listarDepartamentos();
    }

    @GetMapping("/{id}")
    public Departamento buscarPorId(@PathVariable Long id) {
        return service.buscarDepartamentoPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletarPorId(@PathVariable Long id) {
        service.deletarDepartamentoPorId(id);
    }
}
