package com.acktest.demo.service;

import com.acktest.demo.dto.LanguageDTO;
import com.acktest.demo.model.LanguageDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageService {

    @Autowired
    LanguageDAO languageDAO;

    public List<LanguageDTO> languageList(){
        return languageDAO.languageList();
    }

    public LanguageDTO getLanguage(int language_id){
        return languageDAO.getLanguage(language_id);
    }

    public LanguageDTO addLanguage(LanguageDTO languageDTO){
        return languageDAO.addLanguage(languageDTO);
    }

    public void updateLanguage(LanguageDTO languageDTO){
        languageDAO.updateLanguage(languageDTO);
    }

    public void deleteLanguage(int language_id){
        languageDAO.deleteLanguage(language_id);
    }
}
