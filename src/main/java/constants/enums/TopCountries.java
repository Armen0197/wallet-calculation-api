package constants.enums;

public enum TopCountries {

    BRA("Brazil"),
    COL("Colombia");

    private final String countryName;

    TopCountries(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }
}