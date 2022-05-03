import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URI;


import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

public class MyHandler implements HttpHandler {
	private String root = "C:\\Users\\qnftk\\Desktop\\java22\\2022school\\Like-lion\\portfolio_html";
	
	@Override
	public void handle(HttpExchange exchange) {
		String requestMethod = exchange.getRequestMethod();
		if (requestMethod.equalsIgnoreCase("GET")){
			Headers responseHeaders = exchange.getResponseHeaders();

			responseHeaders.set("Content-Type", "text/html; text/css; charset=UTF-8");
			URI uri = exchange.getRequestURI();
			System.out.println(uri.getPath());
			
			
		
			OutputStream responseBody = exchange.getResponseBody();
			
			
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(root + uri.getPath()), "UTF8"));
				
				exchange.sendResponseHeaders(200, 0);
				
				String words= "";
				String str;
				while((str = br.readLine()) != null){
					words += str+ "\n";
					System.out.println(str);
					
				}
				
				byte[] bytes = words.getBytes("utf-8");
				responseBody.write(bytes);
				
				br.close();
			
				responseBody.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
