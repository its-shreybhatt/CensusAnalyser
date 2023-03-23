import org.junit.Assert;
import org.junit.Test;

public class StateCodeTest {

    public static final String INDIA_STATE_CODE_DATA = "./src/test/resources/IndiaStateCode.csv";

    @Test
    public void givenCodeData_CheckNumberOfRecords_AndPassTheTest()  {
        try {
            IndianCodeCensus indianStateCode = new IndianCodeCensus();
            int numOfRecords = indianStateCode.loadIndiaCensusData(INDIA_STATE_CODE_DATA);
            Assert.assertEquals(37, numOfRecords);
        } catch (CensusAnalyserException e) {
            throw new CensusAnalyserException(e.getMessage(), CensusAnalyserException.ExceptionType.CODE_FILE_PROBLEM);
        }
    }
}
