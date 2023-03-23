import com.opencsv.bean.CsvBindByName;

public class IndiaCodeCSV {

    @CsvBindByName(column = "No", required = true)
    public int SrNo;

    @CsvBindByName(column = "StateName", required = true)
    public String State_Name;

    @CsvBindByName(column = "TINNumb", required = true)
    public int TIN;

    @CsvBindByName(column = "Code", required = true)
    public String StateCode;
}
