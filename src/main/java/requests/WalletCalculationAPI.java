package requests;

import constants.Constants;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class WalletCalculationAPI {

    public Response getCountries() {
        return given()
                .when()
                .get(Constants.getBaseUrl())
                .then()
                .log().all()
                .extract().response();
    }

    /**
     * @param toCountry     : one of remit.country keys (Use all)
     * @param transType     : one of transaction types (Use all)
     * @param amount        : input the amount from 50 to 1000 (Use 100)
     * @param serviceLevel  : one of remit.service_level (Use 1)
     * @param depositMethod : c5ad5236-4019-4ca3-a4fc-b20432ca8f5d (constant)
     * @param assetCode     : PURPLE (constant)
     * @return new Response()
     */
    public Response calculatedCountries(String toCountry, String transType, double amount, final int serviceLevel,
                                        String depositMethod, String assetCode) {
        return given()
                .when()
                .queryParam("to_country", toCountry)
                .queryParam("trans_type", transType)
                .queryParam("amount", amount)
                .queryParam("service_level", serviceLevel)
                .queryParam("deposit method", depositMethod)
                .queryParam("asset_code", assetCode)
                .get(Constants.getBaseUrl())
                .then()
                .log().ifValidationFails()
                .extract().response();
    }
}