package com.example.project;
import javax.annotation.Resource;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component 
public class Circle implements Shape, ApplicationEventPublisherAware {

	private Point center;
	private ApplicationEventPublisher publisher;
	
	@Override
	public void draw() {
		System.out.println("Drawing Circle");
		System.out.println("Circle center = (" + center.getX() + ", " + center.getY() + ")");
		DrawEvent drawEvent = new DrawEvent(this);
		publisher.publishEvent(drawEvent);
	}
	
	public Point getCenter() {
		return center;
	}
	@Resource
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}
	
}
