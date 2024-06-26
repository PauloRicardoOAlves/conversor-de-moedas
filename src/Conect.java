import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conect {

    private String inputCurrency;
    private String outputCurrency;

    public double conect (String inputCurrency, String outputCurrency){

        String url = "https://v6.exchangerate-api.com/v6/665f09940188c6bc198aa5f3/pair/" + inputCurrency + "/" + outputCurrency;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .join();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            double rate = DataProcessing.ProcessingResponse(response.body());
            return rate;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
