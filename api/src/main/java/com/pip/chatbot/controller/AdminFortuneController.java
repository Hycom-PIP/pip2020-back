package com.pip.chatbot.controller;

import com.pip.chatbot.model.Currency;
import com.pip.chatbot.model.fortune.Symbol;
import com.pip.chatbot.payload.response.Response;
import com.pip.chatbot.service.fortune.CurrencyService;
import com.pip.chatbot.service.fortune.SymbolService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/fortune")
@AllArgsConstructor
public class AdminFortuneController {
    private final SymbolService symbolService;
    private final CurrencyService currencyService;

    @GetMapping(value = "/companies")
    public ResponseEntity<List<Symbol>> getAllCompanies() {
        return ResponseEntity
                .ok()
                .body(symbolService.getAllCompanies());
    }

    @DeleteMapping(value = "/symbols/{id}")
    public ResponseEntity<?> deleteSymbol(@PathVariable String id) {
        symbolService.deleteSymbol(id);
        return Response.SUCCESS;
    }

    @PostMapping(value = "/symbols")
    public ResponseEntity<Symbol> createSymbol(@RequestBody Symbol symbol) {
        return ResponseEntity.ok().body(symbolService.createSymbol(symbol));
    }

    @PutMapping(value = "/symbols")
    public ResponseEntity<Symbol> updateSymbol(@RequestBody Symbol symbol) {
        return ResponseEntity.ok().body(symbolService.updateSymbol(symbol));
    }

    @PostMapping(value = "/currencies")
    public ResponseEntity<String> createCurrency(@RequestBody Currency currency) {
        return ResponseEntity.ok().body("\"" + currencyService.create(currency.getName()) + "\"");
    }

    @DeleteMapping(value = "/currencies/{id}")
    public ResponseEntity<?> deleteCurrency(@PathVariable String id) {
        currencyService.delete(id);
        return Response.SUCCESS;
    }

    @GetMapping(value = "/currencies")
    public ResponseEntity<List<String>> getAllCurrencies() {
        return ResponseEntity
                .ok()
                .body(currencyService.getAll());
    }

}
