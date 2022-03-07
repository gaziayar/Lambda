package get_http_request.day08;

import base_url.JsonPlaceHolderBaseUrl;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class GetRequest20 extends JsonPlaceHolderBaseUrl {
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
    public void test20(){
        //1- url olustur
        spec04.pathParams("parametrebir","todos","parametreiki",2);

        //2- expected data olustur
        HashMap<String,Object> expectedData=new HashMap<>();
        expectedData.put("statusCode",200);
        expectedData.put("completed",false);
        expectedData.put("userId",1);
        expectedData.put("via","1.1 vegur");
        expectedData.put("title","quis ut nam facilis et officia qui");
        expectedData.put("Server","cloudflare");

        //3- Request ve response}/
        Response response=given().spec(spec04).when().get("/{parametrebir}/{parametreiki}");
        response.prettyPrint();

        // 4- Dogrulama
        // 1.yol machers ile
        response.
                then().
                assertThat().
                statusCode((Integer) expectedData.get("statusCode")).
                headers("via",equalTo(expectedData.get("via")),
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
