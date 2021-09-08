package Com.talent;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static org.hamcrest.Matcher.*;

public class SWApiTestWithRestAssured {

@Test
    public void requestAresourcesThenLinkReturn (){
        String body = RestAssured
                .given()
                .baseUri("https://swapi.dev/api")
                .and()
                .queryParam("format", "json")
                .when()
                .get("/")
                .then()
                .log().all()
                .and().assertThat().statusCode(is(equalsTo(200)));



}
