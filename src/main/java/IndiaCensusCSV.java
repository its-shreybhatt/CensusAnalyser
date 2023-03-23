import com.opencsv.bean.CsvBindByName;

public class IndiaCensusCSV {
    @CsvBindByName(column = "City", required = true)
    public String state;

    @CsvBindByName(column = "Pollution", required = true)
    public int population;

    @CsvBindByName(column = "Area", required = true)
    public int areaInSqKm;

    @CsvBindByName(column = "Dense", required = true)
    public int densityPerSqKm;

    @Override
    public String toString() {
        return "IndiaCensusCSV{" +
                "state='" + state + '\'' +
                ", population=" + population +
                ", areaInSqKm=" + areaInSqKm +
                ", densityPerSqKm=" + densityPerSqKm +
                '}';
    }
}
