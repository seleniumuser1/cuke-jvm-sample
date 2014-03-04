package net.webservicex;

import flows.webserviceClients.currencyConvertor.net.webservicex.ObjectFactory;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.0.0-milestone2
 * 2014-03-04T23:08:42.625+05:30
 * Generated source version: 3.0.0-milestone2
 * 
 */
@WebService(targetNamespace = "http://www.webserviceX.NET", name = "GlobalWeatherHttpGet")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface GlobalWeatherHttpGet {

    /**
     * Get all major cities by country name(full / part).
     */
    @WebResult(name = "string", targetNamespace = "http://www.webserviceX.NET", partName = "Body")
    @WebMethod(operationName = "GetCitiesByCountry")
    public java.lang.String getCitiesByCountry(
        @WebParam(partName = "CountryName", name = "CountryName", targetNamespace = "http://www.webserviceX.NET")
        java.lang.String countryName
    );

    /**
     * Get weather report for all major cities around the world.
     */
    @WebResult(name = "string", targetNamespace = "http://www.webserviceX.NET", partName = "Body")
    @WebMethod(operationName = "GetWeather")
    public java.lang.String getWeather(
        @WebParam(partName = "CityName", name = "CityName", targetNamespace = "http://www.webserviceX.NET")
        java.lang.String cityName,
        @WebParam(partName = "CountryName", name = "CountryName", targetNamespace = "http://www.webserviceX.NET")
        java.lang.String countryName
    );
}
