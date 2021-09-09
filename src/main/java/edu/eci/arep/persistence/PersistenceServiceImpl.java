package edu.eci.arep.persistence;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.eci.arep.persistence.entity.ResponseCalculator;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PersistenceServiceImpl implements PersistenceService {

    ResponseCalculator resp;

    @Override
    public String getSin(String name){
        
        Double numero = Double.parseDouble(name);
        
        Double res = Math.sin(numero);
        
        resp = new ResponseCalculator();
        
        resp.setRespuesta(res);
        
        ObjectMapper mapper = new ObjectMapper();
        String json ="";
        try {
            json = mapper.writeValueAsString(resp);
        } catch (JsonProcessingException ex) {
            Logger.getLogger(PersistenceServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return json;
    }
    
    @Override
    public String getCos(String name){
        
        Double numero = Double.parseDouble(name);
        
        Double res = Math.cos(numero);
        
        resp = new ResponseCalculator();
        
        resp.setRespuesta(res);
        
        ObjectMapper mapper = new ObjectMapper();
        String json ="";
        try {
            json = mapper.writeValueAsString(resp);
        } catch (JsonProcessingException ex) {
            Logger.getLogger(PersistenceServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return json;
    }
    
    @Override
    public String getTan(String name){
        
        Double numero = Double.parseDouble(name);
        
        Double res = Math.tan(numero);
        
        resp = new ResponseCalculator();
        
        resp.setRespuesta(res);
        
        ObjectMapper mapper = new ObjectMapper();
        String json ="";
        try {
            json = mapper.writeValueAsString(resp);
        } catch (JsonProcessingException ex) {
            Logger.getLogger(PersistenceServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return json;
    }

}
