package SpringCore.ConsIjwithPrim;

public class Teacher 
{
private  String subject;
private  int experience;

public Teacher(String subject, int experience) {
	super();
	this.subject = subject;
	this.experience = experience;
}
@Override
public String toString() {
	return "Teacher [subject=" + subject + ", experience=" + experience + "]";
}


}
