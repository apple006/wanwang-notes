package org.wanwanframework.file.note;

import org.wanwanframwork.file.Log;

/**
 * Controller
 * @author coco
 *
 */
public class NoteController {

	private String content;
	
	public NoteController() {
		
	}
	
	public void init() {
		Log.log("content:" + content);
	}
	
	public static void main(String[] args) {
		NoteController controller = new NoteController();
		controller.init();
	}
}