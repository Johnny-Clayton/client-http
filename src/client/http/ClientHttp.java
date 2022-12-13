package client.http;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

public class ClientHttp {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe url: ");
		String url = sc.nextLine();
		
		try {
			
			URI endereco = URI.create(url);
			
			HttpClient client = HttpClient
				.newHttpClient();
			
			HttpRequest request = HttpRequest
				.newBuilder(endereco)
				.GET()
				.build();
			
			HttpResponse<String> response = client
				.send(request, BodyHandlers.ofString());
			
			String body = response.body();
			
			System.out.println(body);
			
		} catch (IOException | InterruptedException ex) {
            throw new RuntimeException(ex);
        }
	}
}
