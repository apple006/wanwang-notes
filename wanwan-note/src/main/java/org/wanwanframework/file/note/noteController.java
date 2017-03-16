package org.wanwanframework.file.note;

import org.wanwanframwork.file.Log;

/**
 * Controller
 * @author coco
 *
 */
public class noteController {

	private String content;
	
	public noteController() {
		
	}
	
	public void init() {
		Log.log("content:" + content);
	}
	
	public static void main(String[] args) {
		noteController controller = new noteController();
		controller.init();
	}
}