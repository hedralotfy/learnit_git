package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class Course implements Subject {

    private String name;
    private String availability;
    
    List<Observer> students;
    // Constructor
    public Course(String name) {
        this.name = name;
        students = new ArrayList<Observer>();
    }


    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Setter for availability
    public void setAvailable(boolean available) {
    	availability = name + (available? " is available." : " is not available.");
    	notifyAllSubscribers();
    }


	@Override
	public void register(Observer observer) {
		students.add(observer);
		
	}


	@Override
	public void unregister(Observer observer) {
		students.remove(observer);
		
	}


	@Override
	public void notifyAllSubscribers() {
		for(Observer observer : students) {
			observer.update(availability);
		}
		
	}
    
}
