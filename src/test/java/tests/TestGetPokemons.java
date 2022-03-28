package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import apis.PokeApi;

public class TestGetPokemons {

    @Test
    public void test_get_normal_pokemons() {
        PokeApi pokeApi = new PokeApi();
        for (String pokemon_type : pokeApi.getNormalPokemons()) {
            System.out.println(pokemon_type);
            Assert.assertNotNull(pokemon_type);
        }
    }
}
