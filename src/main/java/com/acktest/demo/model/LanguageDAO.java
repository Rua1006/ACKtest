package com.acktest.demo.model;

import com.acktest.demo.dto.LanguageDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LanguageDAO {

    @Autowired
    SqlSession sqlSession;

    public List<LanguageDTO> languageList(){
        return sqlSession.selectList("language.languageList");
    }

    public LanguageDTO getLanguage(int language_id){
        return sqlSession.selectOne("language.getLanguage", language_id);
    }

    public LanguageDTO addLanguage(LanguageDTO languageDTO){
        sqlSession.insert("language.addLanguage", languageDTO);
        return languageDTO;
    }

    public void updateLanguage(LanguageDTO languageDTO){
        sqlSession.update("language.updateLanguage", languageDTO);
    }

    public void deleteLanguage(int language_id){
        sqlSession.delete("language.deleteLanguage", language_id);
    }

}
