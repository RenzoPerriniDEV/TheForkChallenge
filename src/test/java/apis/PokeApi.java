package apis;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import java.util.ArrayList;
import java.util.List;
import static io.restassured.RestAssured.when;

public class PokeApi {

    public static String pokemons_url = "https://pokeapi.co/api/v2/pokemon?limit=30";
    public static Response response;
    List<String> pokemon_types_response = new ArrayList<>();
    List<String> pokemons_name= new ArrayList<>();

    public List<String> getNormalPokemons() {
        List<String> normal_pokemons= new ArrayList<>();
        response =
                when().
                        get(pokemons_url).
                        then().
                        contentType(ContentType.JSON).
                        extract().response();
        List<String> urls = response.path("results.url");
        for (String url : urls) {
            response =  when().
                    get(url).
                    then().
                    contentType(ContentType.JSON).
                    extract().response();
            pokemon_types_response = response.path("types.type.name");
            pokemons_name = response.path("forms.name");
            for (String pokemon_type : pokemon_types_response) {
                if(pokemon_type.contains("normal")) {
                    normal_pokemons.add(pokemons_name.toString());
                }
            }
        }
        return normal_pokemons;
    }
}
