package constants.enums;

public enum Countries {

    BEN("Benin"),
    BFA("Burkina Faso"),
    BGR("Bulgary"),
    BRA("Brazil"),
    CIV("Cote d'ivoire"),
    COL("Colombia"),
    CPV("Cape Verde"),
    CZE("Czech Republic"),
    DEU("Germany"),
    DOM("Dominican Republic"),
    ESP("Spain"),
    FRA("France"),
    GBR("United Kingdom"),
    GEO("Georgia"),
    GIN("Guinea"),
    GNB("Guinea-Bissau"),
    GRC("Greece"),
    HTI("Haiti"),
    MDA("Moldova"),
    MLI("Mali"),
    MRT("Mauritania"),
    PHL("Philippines"),
    PRT("Portugal"),
    SEN("Senegal"),
    TGO("Togo"),
    USA("United States"),
    VNM("Vietnam");

    private final String countryName;

    Countries(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }
}