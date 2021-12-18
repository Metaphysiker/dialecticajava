package dialectica;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.awt.Color;

import org.apache.commons.io.IOUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class Dialectica {

	static private int sizeOfFrame[] = { 600, 600 };
	static private int margins[] = { 25, 25, 25, 25 };

	static Font bigFont = new Font("Open Sans", Font.BOLD, 50);
	static Font smallFont = new Font("Monospaced", Font.PLAIN, 12);

	public static void main(String[] args) throws JSONException, MalformedURLException, IOException {

		// TODO Auto-generated method stub
		System.out.println("Dialectica Start");

		JFrame frame = new JFrame("dialectica - toolbox");
		frame.setSize(sizeOfFrame[0], sizeOfFrame[1]);

		JPanel panel = new JPanel();

		// title
		JLabel title;
		title = new JLabel("dialectica");
		title.setFont(bigFont);
		panel.add(title);
		
		// textfield
        JTextField textfieldDoi = new JTextField("Paul Programmierer", 15);
        panel.add(textfieldDoi);

		frame.add(panel);
		frame.setVisible(true);

		//JSONObject json = new JSONObject(
		//IOUtils.toString(new URL("http://api.crossref.org/works?filter=issn:1573-0883"), Charset.forName("UTF-8")));
		
		//System.out.println(json.toString());

		// String[] myStrings = { "One", "Two", "Three" };

		// DoiField.main(myStrings);

	}

}
