package com.example.search.documento;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocumentoRepository extends ElasticsearchRepository<Documento, String> {

    Documento findByCodigo(String codigo);

    List<Documento> findByDescricao(String descricao);
}
