package edu.eci.arep.persistence;

import edu.eci.arep.nanospark.components.NanoSparkException;
import edu.eci.arep.persistence.entity.ResponseCalculator;

public interface PersistenceService {

    String getSin(String name) throws NanoSparkException;
    String getCos(String name) throws NanoSparkException;
    String getTan(String name) throws NanoSparkException;
    
}
