package mobile.fip.simfut.data;

import java.util.List;

import mobile.fip.simfut.domain.Match;
import retrofit2.Call;
import retrofit2.http.GET;

public interface MatchesApi {

    @GET("matches.json")
    Call<List<Match>> getMatches();
}
