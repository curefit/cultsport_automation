
package com.cultsport.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;

import com.cultsport.utils.Adapters.WaitTime;


public class CommonUtilities {

	static final String CONFIG_FILE_PATH = System.getProperty("user.dir") + "/src/test/resources/"
			+ "config.properties";
	public static Properties prop;

	public static void loadConfigPropertiesInSystem() {
		try {
			prop = new Properties();
			InputStream is = new FileInputStream(CONFIG_FILE_PATH);
			prop.load(is);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void cleanDirectory(String path) {
		File reportAndScreenshotDir = new File(path);
		try {
			FileUtils.cleanDirectory(reportAndScreenshotDir);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void deleteFile(String filePath) {
		try {
			Files.deleteIfExists(Paths.get(filePath));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String getCurrentDateTime(String format) {
		SimpleDateFormat formatter = new SimpleDateFormat(format);
		Date date = new Date();
		return formatter.format(date);
	}

	public static void wait(WaitTime time) {
		try {
			Thread.sleep(time.getDuration());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static String getReportFilePath() {

		if (System.getProperty("os.name").toLowerCase().contains("win")) {
			return System.getProperty("user.dir") + "\\Reports\\%s.html";
		} else if (System.getProperty("os.name").toLowerCase().contains("mac")) {
			return System.getProperty("user.dir") + "/Reports/%s.html";
		}
		return "";
	}
}
