import com.opencsv.bean.CsvBindByName;

public class IndiaCodeScv {

    @CsvBindByName(column = "SrNo", required = true)
    public int SrNo;

//    @CsvBindByName(column = "State", required = true)
//    public String State;
//
//    @CsvBindByName(column = "Name", required = true)
//    public String Name;

    @CsvBindByName(column = "State_Name", required = true)
    public String State_Name;

    @CsvBindByName(column = "TIN", required = true)
    public int TIN;

    @CsvBindByName(column = "StateCode", required = true)
    public String StateCode;
}
