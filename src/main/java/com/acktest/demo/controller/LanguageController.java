package com.acktest.demo.controller;

import com.acktest.demo.dto.LanguageDTO;
import com.acktest.demo.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/language")
public class LanguageController {

    @Autowired
    private LanguageService languageService;

    @GetMapping("")
    public List<LanguageDTO> languageList(){
        return languageService.languageList();
    }

    @GetMapping("/{language_id}")
    public LanguageDTO getLanguage(@PathVariable("language_id") int language_id) {
        return languageService.getLanguage(language_id);
    }

    @PostMapping("")
    public LanguageDTO addLanguage(@RequestBody LanguageDTO languageDTO){
        return languageService.addLanguage(languageDTO);
    }

    @PutMapping("/{language_id}")
    public void updateLanguage(@PathVariable("language_id") int language_id, @RequestBody LanguageDTO languageDTO){
        languageService.updateLanguage(languageDTO);
    }

    @DeleteMapping("/{language_id}")
    public void deleteLanguage(@PathVariable int language_id){
        languageService.deleteLanguage(language_id);
    }
}
