package walletcalculationtests;

import constants.enums.TransferType;
import helpers.DataProvider;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import constants.Constants;
import requests.WalletCalculationAPI;

import static constants.Constants.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class WalletCalculationTests {

    private WalletCalculationAPI walletCalculation;
    private Response response;

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = Constants.getBaseUrl();
        walletCalculation = new WalletCalculationAPI();
    }

    /**
     * @param countryName : Full country name
     * @param country : Country name (abbreviation)
     * You can change the dataProvider value to FROM_COUNTRY_DATA_PROVIDER or TOP_COUNTRY_DATA_PROVIDER and run tests for those countries.
     */
    @Test(dataProvider = COUNTRY_WITH_NAMES_DATA_PROVIDER, dataProviderClass = DataProvider.class)
    public void checkCountriesNames(String countryName, String country) {
        response = walletCalculation.getCountries();

        assertEquals(200, response.statusCode());
        assertEquals(countryName, response.jsonPath().getString(String.format(Constants.getCountry(), country)));
    }

    /**
     * @param country : Country name (abbreviation)
     * You can remove DataProvider.getRandomNumberInRange(50, 1000) method and use 100 for amount value.
     * You can change the dataProvider value to FROM_COUNTRY_DATA_PROVIDER or TOP_COUNTRY_DATA_PROVIDER and run tests for those countries.
     */
    @Test(priority = 1, dataProvider = COUNTRY_DATA_PROVIDER, dataProviderClass = DataProvider.class)
    public void calculationForAccount(String country) {
        response = walletCalculation.calculatedCountries(country, TransferType.ACCOUNT.getTransferType(),
                DataProvider.getRandomNumberInRange(50, 1000),
                1, Constants.getMethodValue(),
                Constants.getAssetCode());

        assertEquals(200, response.statusCode());
        assertEquals(response.jsonPath().getInt(Constants.getCode()), 200);
        assertEquals(response.jsonPath().getString(Constants.getChoices()), "1");

        assertTrue(response.jsonPath().getDouble(Constants.getDestinationAmount()) > 0);
        assertTrue(response.jsonPath().getDouble(Constants.getRate()) > 0);
        assertTrue(response.jsonPath().getDouble(Constants.getTotalCharges()) > 0);
    }

    /**
     * @param country : Country name (abbreviation)
     * You can remove DataProvider.getRandomNumberInRange(50, 1000) method and use 100 for amount value.
     * You can change the dataProvider value to FROM_COUNTRY_DATA_PROVIDER or TOP_COUNTRY_DATA_PROVIDER and run tests for those countries.
     */
    @Test(priority = 2, dataProvider = COUNTRY_DATA_PROVIDER, dataProviderClass = DataProvider.class)
    public void calculationForCashCollection(String country) {
        response = walletCalculation.calculatedCountries(country, TransferType.CASH_COLLECTION.getTransferType(),
                DataProvider.getRandomNumberInRange(50, 1000),
                1, Constants.getMethodValue(),
                Constants.getAssetCode());

        assertEquals(200, response.statusCode());
        assertEquals(response.jsonPath().getInt(Constants.getCode()), 200);
        assertEquals(response.jsonPath().getString(Constants.getChoices()), "1");

        assertTrue(response.jsonPath().getDouble(Constants.getDestinationAmount()) > 0);
        assertTrue(response.jsonPath().getDouble(Constants.getRate()) > 0);
        assertTrue(response.jsonPath().getDouble(Constants.getTotalCharges()) > 0);
    }

    /**
     * @param country : Country name (abbreviation)
     * You can remove @Ignore annotation and run this test.
     * You can remove DataProvider.getRandomNumberInRange(50, 1000) method and use 100 for amount value.
     * You can change the dataProvider value to FROM_COUNTRY_DATA_PROVIDER or TOP_COUNTRY_DATA_PROVIDER and run tests for those countries.
     */
    @Ignore("For the type of BANK_CARD, all tests are not passed for all countries")
    @Test(priority = 3, dataProvider = COUNTRY_DATA_PROVIDER, dataProviderClass = DataProvider.class)
    public void calculationForBankCard(String country) {
        response = walletCalculation.calculatedCountries(country, TransferType.BANK_CARD.getTransferType(),
                DataProvider.getRandomNumberInRange(50, 1000),
                1, Constants.getMethodValue(),
                Constants.getAssetCode());

        assertEquals(200, response.statusCode());
        assertEquals(response.jsonPath().getInt(Constants.getCode()), 200);
        assertEquals(response.jsonPath().getString(Constants.getChoices()), "1");

        assertTrue(response.jsonPath().getDouble(Constants.getDestinationAmount()) > 0);
        assertTrue(response.jsonPath().getDouble(Constants.getRate()) > 0);
        assertTrue(response.jsonPath().getDouble(Constants.getTotalCharges()) > 0);
    }
}