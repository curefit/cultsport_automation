
package com.cultsport.utils;

public class Adapters {

	public static final String LOGS_FILE_PATH = System.getProperty("user.dir") + "/logs/";
	public static final String REPORT_FILE_PATH = System.getProperty("user.dir") + "/report/";
	public static final String SCREENSHOT_FILE_PATH = System.getProperty("user.dir") + "/report/screenshots/";
	public static final String SCREENRECORD_FILE_PATH = System.getProperty("user.dir") + "/report/screenrecords/";
	public static final String LOGCAT_FILE_PATH = System.getProperty("user.dir") + "/report/logcatlogs/";

	// Waits
	public enum WaitTime {
		ONE_SEC(1000), TWO_SEC(2000), THREE_SEC(3000), FIVE_SEC(5000), TEN_SEC(5000), FIVE100_MILISEC(500),
		ONE100_MILISEC(100), THREE100_MILISEC(300);

		private final long duration;

		public long getDuration() {
			return duration;
		}

		private WaitTime(long value) {
			this.duration = value;
		}
	}

	public static final String SWIPE_RIGHT = "SWIPE_RIGHT";
	public static final String SWIPE_LEFT = "SWIPE_LEFT";
	public static final String SWIPE_UP = "SWIPE_UP";
	public static final String SWIPE_DOWN = "SWIPE_DOWN";
	public static final String SWIPE = "SWIPE";
	public static final String DRAG = "DRAG";
	public static final String LONGPRESS_SWIPE = "LONGPRESS_SWIPE";
}
