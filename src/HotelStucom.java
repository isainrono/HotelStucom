import java.io.BufferedReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HotelStucom {
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String filename = "entrada1.txt";
		FileReader fr = new FileReader(filename);
		
		try {
			
			BufferedReader br = new BufferedReader(fr);
			
			String line;
			while((line = br.readLine()) != null){
				System.out.println(line);
				String[] datas = line.split(" ");
				
				switch(datas[0].toUpperCase()) {
					case "ROOM":
						AdminHotel.room(datas);
						break;
					case "WORKER":
						AdminHotel.request();
						break;
					case "RESERVATION":
						AdminHotel.leave();
						break;
					case "HOTEL":
						AdminHotel.reservation();
						break;
					default:
						System.out.println("esta petición no es correcta");
						break;
				}
			}
			
			
		} catch (Exception e) {
			System.out.println("Error leyendo fichero" + filename + " " + e.getMessage());
		} finally {
			fr.close();
		}
		
        
	}

}

// Runnable
