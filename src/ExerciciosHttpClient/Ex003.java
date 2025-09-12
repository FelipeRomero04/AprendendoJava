package ExerciciosHttpClient;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;

public class Ex003 {
    public static void main(String[] args) throws IOException, InterruptedException {

        Path path = Path.of("C:\\Users\\ferna\\OneDrive\\Documentos\\Java\\Estudos\\Aulas\\AprendendoJava\\src\\ExerciciosHttpClient\\archivesTest\\text.txt");
        if (!Files.exists(path)) {
            Files.createFile(path);
        }
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
                .build();

        HttpClient client = HttpClient.newBuilder()
                .build();

        HttpResponse<Path> response = client.send(request, HttpResponse.BodyHandlers.ofFile(path)); // converte a response e um file com o Json dentro
        String readFile = Files.readString(path);
        System.out.println(readFile);

    }
}

//Copiar sobre a API nio e httpClient
