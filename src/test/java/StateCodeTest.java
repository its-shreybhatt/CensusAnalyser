import org.junit.Assert;
import org.junit.Test;

public class StateCodeTest {

    public static final String INDIA_STATE_CODE_DATA = "./src/test/resources/IndiaStateCode.csv";
    public static final String WRONG_CODE_DATA = ".//main/resources/IndiaStateCode.csv";
    public static final String CORRECT_STATE_CODE_DATA = "./src/test/resources/IndiaStateCode.txt";
    public static final String DELIMETER_STATE_CENSUS_DATA = ".,src,test,resources,IndiaStateCode.csv";
    @Test
    public void givenCodeData_CheckNumberOfRecords_AndPassTheTest() {
        try {
            IndianCodeCensus indianStateCode = new IndianCodeCensus();
            int numOfRecords = indianStateCode.loadIndiaCodeData(INDIA_STATE_CODE_DATA);
            Assert.assertEquals(37, numOfRecords);
        } catch (CensusAnalyserException e) {
            throw new CensusAnalyserException(e.getMessage(), CensusAnalyserException.ExceptionType.CODE_FILE_PROBLEM);
        }
    }

    @Test
    public void givenWrongCodeData_CheckForThePath_ShouldThrowException() {
        try {
            IndianCodeCensus indianStateCode = new IndianCodeCensus();
            indianStateCode.loadIndiaCodeData(WRONG_CODE_DATA);
        } catch (CensusAnalyserException e) {
            Assert.assertEquals(CensusAnalyserException.ExceptionType.CODE_FILE_PROBLEM, e.type);
        }
    }

    @Test
    public void givenCodeData_CheckNumberOfRecords_ShouldThrowException() {
        try {
            IndianCodeCensus indianStateCode = new IndianCodeCensus();
            indianStateCode.loadIndiaCodeData(CORRECT_STATE_CODE_DATA);
        } catch (CensusAnalyserException e) {
            Assert.assertEquals(CensusAnalyserException.ExceptionType.CODE_FILE_PROBLEM, e.type);
        }
    }

    @Test
    public void givenCodeData_WithIncorrectDelimiter_ShouldThrowException() {
        try {
            IndianCodeCensus indianStateCode = new IndianCodeCensus();
            indianStateCode.loadIndiaCodeData(DELIMETER_STATE_CENSUS_DATA);
        } catch (CensusAnalyserException e) {
            Assert.assertEquals(CensusAnalyserException.ExceptionType.CODE_FILE_PROBLEM, e.type);
        }
    }
}
