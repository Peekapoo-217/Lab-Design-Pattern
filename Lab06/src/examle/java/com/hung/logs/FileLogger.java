package examle.java.com.hung.logs;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileLogger implements Logger {
	private static final String FILE_NAME = "history.txt";

	@Override
	public void log(String message) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
			String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
			writer.write("[" + timestamp + "] Executed: " + message);
			writer.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
