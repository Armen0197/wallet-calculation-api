package constants;

public class Constants {

    //Constants
    private static final String BASE_URL = "https://stage-wallet-api.rock-west.net/api/v1/wallet/8efe48b1-5988-498c-8e57-1d5c8874eb70/payment-remit-info";
    private static final String METHOD_VALUE = "c5ad5236-4019-4ca3-a4fc-b20432ca8f5d";
    private static final String ASSET_CODE = "PURPLE";

    // JSON paths
    private static final String COUNTRY = "remit.country.%s.country_name";
    private static final String TOP_COUNTRY = "remit.top_country.%s.country_name";
    private static final String FORM_COUNTRY = "remit.from_country.%s.country_name";
    private static final String DESTINATION_AMOUNT = "charges.DestinationAmount";
    private static final String RATE = "charges.Rate";
    private static final String TOTAL_CHARGES = "charges.TotalCharges";
    private static final String CODE = "code";
    private static final String CHOICES = "beneficiary_fields.purpose.choices[0]";
    private static final String ADDRESS = "points[0].address";

    //Data providers
    public static final String COUNTRY_WITH_NAMES_DATA_PROVIDER = "country_with_names_data_provider";
    public static final String COUNTRY_DATA_PROVIDER = "country_data-provider";
    public static final String FROM_COUNTRY_DATA_PROVIDER = "from_country_data-provider";
    public static final String TOP_COUNTRY_DATA_PROVIDER = "top_country_data-provider";

    public static String getBaseUrl() {
        return BASE_URL;
    }

    public static String getCountry() {
        return COUNTRY;
    }

    public static String getTopCountry() {
        return TOP_COUNTRY;
    }

    public static String getFormCountry() {
        return FORM_COUNTRY;
    }

    public static String getMethodValue() {
        return METHOD_VALUE;
    }

    public static String getAssetCode() {
        return ASSET_CODE;
    }

    public static String getDestinationAmount() {
        return DESTINATION_AMOUNT;
    }

    public static String getRate() {
        return RATE;
    }

    public static String getTotalCharges() {
        return TOTAL_CHARGES;
    }

    public static String getCode() {
        return CODE;
    }

    public static String getChoices() {
        return CHOICES;
    }

    public static String getAddress() {
        return ADDRESS;
    }

    private Constants() {
        throw new UnsupportedOperationException("Error: Unable to create object.");
    }
}