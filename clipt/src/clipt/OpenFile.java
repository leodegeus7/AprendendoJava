package clipt;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class OpenFile {
	JFileChooser fc = new JFileChooser();
	StringBuilder sb = new StringBuilder();
	
	public void chooseFile() throws IOException {
		if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
			File file = fc.getSelectedFile();
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {
				sb.append(sc.nextLine());
				sb.append("\n");
			}
			sc.close();
		}
		else {
			sb.append("No file selected");
		}
	}
}
