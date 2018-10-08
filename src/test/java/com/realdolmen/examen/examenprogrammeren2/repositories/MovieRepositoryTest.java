package com.realdolmen.examen.examenprogrammeren2.repositories;


import com.realdolmen.examen.examenprogrammeren2.domain.Movie;
import com.realdolmen.examen.examenprogrammeren2.exceptions.NoQueryPossibleException;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.mockito.Mock;

public class MovieRepositoryTest {
    
    //20 : tracht alle methoden die hieronder beschreven zijn in te vullen zodat ze slagen. Tips kan je vinden in de methoden zelf.
    private static String URL = "jdbc:mysql://localhost:3306/movie_db_test?autoReconnect=true&useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    
    @Mock
    private MovieRepository repository;
    
    @Before
    public void init() {
        repository = new MovieRepository(URL);
    }
    
    @Test
    //TODO maak een test voor MovieRepository.find()
    public void findTestSucces() throws Exception {
        //geeft foutmelding Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:2.12.4:test (default-cli) on project ExamenProgrammeren2GwennySemeese: Unable to generate classpath
        repository = new MovieRepository();
        assertFalse(repository.find("select * from movies").isEmpty());
    }
    
    @Test
    //TODO maak een test voor MovieRepository.find()
    public void findTestWrongQueryThrowsNoQueryPossibleException() throws Exception{
        //geeft foutmelding Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:2.12.4:test (default-cli) on project ExamenProgrammeren2GwennySemeese: Unable to generate classpath
        repository = new MovieRepository();
        assertFalse(repository.find("select tieel from movies").isEmpty());       
    }
}
