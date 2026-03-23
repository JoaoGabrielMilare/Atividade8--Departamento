package com.example.Departamentos.Services;

import com.example.Departamentos.Model.Departamento;
import com.example.Departamentos.Repository.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartamentoService {

    @Autowired
    private DepartamentoRepository repository;

    public Departamento criarDepartamento(Departamento departamento) {
        return repository.save(departamento);
    }

    public List<Departamento> listarDepartamentos() {
        return repository.findAll();
    }

    public Departamento buscarDepartamentoPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deletarDepartamentoPorId(Long id) {
        repository.deleteById(id);
    }
}
