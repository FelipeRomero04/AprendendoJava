package ExerciciosHttpClient;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;


public class Ex001 {
    private static final int TIMEOUT = 3;
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("https://httpbin.org/get"))
                .header("Accept", "application/xml")
                .timeout(Duration.ofSeconds(TIMEOUT))
                .build();

        HttpClient client= HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(TIMEOUT))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        System.out.println(response.statusCode());
    }
}
