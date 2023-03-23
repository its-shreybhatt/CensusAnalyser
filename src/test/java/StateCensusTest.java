import org.junit.Assert;
import org.junit.Test;

public class StateCensusTest {

    public static final String INDIA_STATE_CENSUS_DATA = "./src/test/resources/IndiaStateCensusData.csv";
    public static final String WRONG_CENSUS_DATA = ".//main/resources/IndiaStateCensusData.csv";
    public static final String CORRECT_STATE_CENSUS_DATA = "./src/test/resources/IndiaStateCensusData.txt";

    @Test
    public void givenCensusData_CheckNumberOfRecords_AndPassTheTest()  {
        try {
            IndianStateCensus indianStateCensus = new IndianStateCensus();
            int numOfRecords = indianStateCensus.loadIndiaCensusData(INDIA_STATE_CENSUS_DATA);
            Assert.assertEquals(29, numOfRecords);
        } catch (CensusAnalyserException e) {
            throw new CensusAnalyserException(e.getMessage(), CensusAnalyserException.ExceptionType.CENSUS_FILE_PROBLEM);
        }
    }

    @Test
    public void givenWrongCensusData_CheckForThePath_ShouldThrowException()  {
        try{
            IndianStateCensus indianStateCensus = new IndianStateCensus();
            indianStateCensus.loadIndiaCensusData(WRONG_CENSUS_DATA);
        }catch (CensusAnalyserException e){
            Assert.assertEquals(CensusAnalyserException.ExceptionType.CENSUS_FILE_PROBLEM,e.type);
        }
    }

    @Test
    public void givenCensusData_CheckNumberOfRecords_ShouldThrowException()  {
        try{
            IndianStateCensus indianStateCensus = new IndianStateCensus();
            indianStateCensus.loadIndiaCensusData(CORRECT_STATE_CENSUS_DATA);
        }catch (CensusAnalyserException e){
            Assert.assertEquals(CensusAnalyserException.ExceptionType.CENSUS_FILE_PROBLEM,e.type);
        }
    }
}
