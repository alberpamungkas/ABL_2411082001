package com.alber.produk.controller;

import com.alber.produk.entity.Produk;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/produk")
public class ProdukController {
    @GetMapping
    public List<Produk> getAllProduk() {
        List<Produk> produkList = new ArrayList<>();
        produkList.add(new Produk(1, "Mouse", 100000.0, "merk 1"));
        produkList.add(new Produk(2, "Keyboard", 200000.0, "merk 2"));
        return produkList;
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Produk> getProdukById(@PathVariable("id") int id) {
        if (id == 1) {
            Produk produk = new Produk(1, "Mouse", 100000.0, "merk 1");
            return ResponseEntity.ok(produk);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Produk> createProduk(@RequestBody Produk produk) {
        // Implementation for creating a new produk
        return ResponseEntity.ok(produk);
    }
}
