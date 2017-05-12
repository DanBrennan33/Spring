import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

public class Circle implements Shape {

	private Point center;
	@Autowired
	private MessageSource messageSource;
	
	@Override
	public void draw() {
		System.out.println(this.messageSource.getMessage("drawing.circle", null, "Default Drawing Message", null));
		System.out.println(this.messageSource.getMessage("drawing.point", new Object[] {center.getX(), center.getY()}, "Default Point Center", null));
		System.out.println(this.messageSource.getMessage("greeting", null, "Default Greeting", null));
	}
	
	public MessageSource getMessageSource() {
		return messageSource;
	}
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	
}
