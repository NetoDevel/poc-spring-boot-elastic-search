package com.example.search.documento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentoService {

    @Autowired
    private DocumentoRepository repository;

    public Documento findByCodigo(final String codigo) {
        return repository.findByCodigo(codigo);
    }

    public Documento save(final Documento s) {
        return repository.save(s);
    }

    public List<Documento> findByDescricao(String descricao) {
        return repository.findByDescricao(descricao);
    }

}
