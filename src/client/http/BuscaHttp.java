package client.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;


public class BuscaHttp {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe url: ");
		String url = sc.nextLine();
		
		URL resPagina = new URL(url);

		// Lê o conteúdo da página HTML
		URL urlPagina = new URL(url);
		InputStream inputStream = urlPagina.openStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		StringBuilder pageContent = new StringBuilder();
		String line;
		while ((line = bufferedReader.readLine()) != null) {
		    pageContent.append(line);
		}

		String pageContentString = pageContent.toString();
		
		System.out.println(pageContentString);
	}

}
