package encore.ctrl.view;

public class View {
	private String path;
	private boolean isSend;
	
	public View() {
		super();
	}
	
	public View(String path, boolean isSend) {
		super();
		this.path = path;
		this.isSend = isSend;
	}
	
	public String getPath() {
		return path;
	}
	
	public void setPath(String path) {
		this.path = path;
	}
	
	public boolean isSend() {
		return isSend;
	}
	
	public void setSend(boolean isSend) {
		this.isSend = isSend;
	}
	
}
