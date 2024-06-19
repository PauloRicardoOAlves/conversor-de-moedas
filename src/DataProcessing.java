import com.google.gson.Gson;
import models.Response;

public class DataProcessing {
    public static double ProcessingResponse(String data) {
        Gson gson = new Gson();

        Response response = gson.fromJson(data, Response.class);

        return response.getConversion_rate();
    }
}