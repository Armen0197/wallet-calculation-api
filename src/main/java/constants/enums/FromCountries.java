package constants.enums;

public enum FromCountries {

    AND("Andorra"),
    AUT("Austria"),
    BEL("Belgium"),
    CYP("Cyprus"),
    DEU("Germany"),
    ESP("Spain"),
    EST("Estonia"),
    FIN("Finland"),
    FRA("France"),
    GBR("United Kingdom"),
    GRC("Greece"),
    IRL("Ireland"),
    ITA("Italy"),
    LTU("Lithuania"),
    LUX("Luxembourg"),
    LVA("Latvia"),
    MCO("Monaco"),
    MLT("Malta"),
    MNE("Montenegro"),
    NLD("Netherlands (the)"),
    PRT("Portugal"),
    SMR("San Marino"),
    SVK("Slovakia"),
    SVN("Slovenia"),
    SWE("Sweden"),
    VAT("Vatican");

    private final String countryName;

    FromCountries(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }
}