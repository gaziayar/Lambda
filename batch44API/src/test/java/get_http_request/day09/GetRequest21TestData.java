package get_http_request.day09;

import base_url.JsonPlaceHolderBaseUrl;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import test_data.JsonPlaceHolderTestData;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class GetRequest21TestData extends JsonPlaceHolderBaseUrl {
    /*
https://jsonplaceholder.typicode.com/todos/2
1) Status kodunun 200,
2) respose body'de,
         "completed": değerinin false
         "title": değerinin "quis ut nam facilis et officia qui"
         "userId" sinin 1 ve
    header değerlerinden
         "via" değerinin "1.1 vegur" ve
         "Server" değerinin "cloudflare" olduğunu test edin…
*/
    @Test
    public void test21(){

      // 1-Url olustur
      spec04.pathParams("1","todos","2",2);
      // 2-expected daata olustur
        JsonPlaceHolderTestData expectedDataObje=new JsonPlaceHolderTestData();
        HashMap<String,Object> expectedData = (HashMap<String, Object>) expectedDataObje.setUpTestData();
        System.out.println("Test Data'nin icindeki expectedData = " + expectedData);
// 3-Request ve Response
        Response response=given().spec(spec04).when().get("/{1}/{2}");
        response.prettyPrint();
        // 4-Dogrulama
        // 1-Machers ile

        response.then().assertThat().statusCode((Integer)expectedData.get("statusCode")). headers("via",equalTo(expectedData.get("via")),
                        "Server",equalTo(expectedData.get("Server")))
                .body("userId",equalTo(expectedData.get("userId")),
                        "title",equalTo(expectedData.get("title")),"completed",equalTo(expectedData.get("completed")));

        // 2.yol json ile
        JsonPath json= response.jsonPath();
        Assert.assertEquals(expectedData.get("statusCode"),response.statusCode());
        Assert.assertEquals(expectedData.get("via"),response.getHeader("via"));
        Assert.assertEquals(expectedData.get("Server"),response.getHeader("Server"));
        Assert.assertEquals(expectedData.get("userId"),json.getInt("userId"));
        Assert.assertEquals(expectedData.get("title"),json.getString("title"));

        // 3.yol De-serialization ile
        HashMap<String,Object>  actuelData=response.as(HashMap.class);
        Assert.assertEquals(expectedData.get("userId"),actuelData.get("userId"));
        Assert.assertEquals(expectedData.get("title"),actuelData.get("title"));
        Assert.assertEquals(expectedData.get("completed"),actuelData.get("completed"));
        System.out.println("actuelData = " + actuelData);








    }
}
