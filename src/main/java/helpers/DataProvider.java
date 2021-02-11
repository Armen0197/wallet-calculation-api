package helpers;

import constants.enums.FromCountries;
import constants.enums.TopCountries;

import java.util.Random;

import static constants.Constants.*;
import static constants.enums.Countries.*;

public class DataProvider {

    @org.testng.annotations.DataProvider(name = COUNTRY_WITH_NAMES_DATA_PROVIDER)
    public Object[][] dataProviderMethod() {
        return new Object[][]{
                {BEN.getCountryName(), BEN.toString()}, {COL.getCountryName(), COL.toString()},
                {USA.getCountryName(), USA.toString()}, {CPV.getCountryName(), CPV.toString()},
                {DOM.getCountryName(), DOM.toString()}, {GEO.getCountryName(), GEO.toString()},
                {BFA.getCountryName(), BFA.toString()}, {BGR.getCountryName(), BGR.toString()},
                {BRA.getCountryName(), BRA.toString()}, {CIV.getCountryName(), CIV.toString()},
                {CZE.getCountryName(), CZE.toString()}, {DEU.getCountryName(), DEU.toString()},
                {ESP.getCountryName(), ESP.toString()}, {FRA.getCountryName(), FRA.toString()},
                {GBR.getCountryName(), GBR.toString()}, {GRC.getCountryName(), GRC.toString()}
        };
    }

    @org.testng.annotations.DataProvider(name = COUNTRY_DATA_PROVIDER)
    public Object[][] dataProviderCountry() {
        return new Object[][]{
                {BEN.toString()}, {BFA.toString()}, {BGR.toString()}, {COL.toString()}, {GBR.toString()},
                {GRC.toString()}, {USA.toString()}, {BRA.toString()}, {CIV.toString()}, {CPV.toString()},
                {CZE.toString()}, {DEU.toString()}, {DOM.toString()}, {ESP.toString()}, {FRA.toString()},
                {GEO.toString()}, {GIN.toString()}, {GNB.toString()}, {HTI.toString()}, {MDA.toString()},
                {MLI.toString()}, {MRT.toString()}, {PHL.toString()}, {PRT.toString()}, {SEN.toString()},
                {TGO.toString()}, {VNM.toString()}
        };
    }

    @org.testng.annotations.DataProvider(name = FROM_COUNTRY_DATA_PROVIDER)
    public Object[][] dataProviderFromCountry() {
        return new Object[][]{
                {FromCountries.AND.toString()}, {FromCountries.AUT.toString()}, {FromCountries.BEL.toString()},
                {FromCountries.CYP.toString()}, {FromCountries.DEU.toString()}, {FromCountries.ESP.toString()},
                {FromCountries.EST.toString()}, {FromCountries.FIN.toString()}, {FromCountries.FRA.toString()},
                {FromCountries.GBR.toString()}, {FromCountries.GRC.toString()}, {FromCountries.IRL.toString()},
                {FromCountries.ITA.toString()}, {FromCountries.LTU.toString()}, {FromCountries.LUX.toString()},
                {FromCountries.LVA.toString()}, {FromCountries.MCO.toString()}, {FromCountries.MLT.toString()},
                {FromCountries.MNE.toString()}, {FromCountries.NLD.toString()}, {FromCountries.PRT.toString()},
                {FromCountries.SMR.toString()}, {FromCountries.SVK.toString()}, {FromCountries.SVN.toString()},
                {FromCountries.SWE.toString()}, {FromCountries.VAT.toString()}
        };
    }

    @org.testng.annotations.DataProvider(name = TOP_COUNTRY_DATA_PROVIDER)
    public Object[][] dataProviderTopCountry() {
        return new Object[][]{
                {TopCountries.BRA.toString()}, {TopCountries.COL.toString()}
        };
    }

    /**
     * Method generates a random positive number in a given range.
     */
    public static double getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("Max must be greater than min.");
        }
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
}