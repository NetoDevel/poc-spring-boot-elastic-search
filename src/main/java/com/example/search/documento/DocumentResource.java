package com.example.search.documento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/documents")
public class DocumentResource {

    @Autowired
    private DocumentoService documentoService;

    @PostMapping
    public ResponseEntity<Documento> save(@RequestBody Documento documento) {
        return new ResponseEntity<>(documentoService.save(documento),
                HttpStatus.OK);
    }

    @PostMapping("/search")
    public ResponseEntity<List<Documento>> index(@RequestBody SearchParams searchParams) {
        return new ResponseEntity<>(documentoService.findByDescricao(searchParams.getText()),
                HttpStatus.OK);
    }


}


