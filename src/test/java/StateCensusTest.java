import org.junit.Assert;
import org.junit.Test;

public class StateCensusTest {

    public static final String INDIA_STATE_CENSUS_DATA = "./src/test/resources/IndiaStateCensusData.csv";

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
}
