public class Encaps{

	public static void main(String []args){
	
		Student Madhav = new Student();
		Madhav.setRollNumber(101);
		Madhav.setPhoneNumber(7559205988L);
		Madhav.setAddress("Vadgaon Sheri");
		Madhav.setFullName("Madhav Shashikant Mali");
		Madhav.display();
	
	}

}

class Student{

	int rno;
	long phno;
	String addr;
	String fullnm;
	
	Student(){
		rno=0;
		phno=0;
		addr=null;
		fullnm=null;
	}
	
	void setRollNumber(int rno){
		this.rno=rno;
	}
	int getRollNumber(){
		return rno;
	}
	
	void setPhoneNumber(long phno){
		this.phno=phno;
	}
	long getPhoneNumber(){
		return phno;
	}
	
	void setAddress(String addr){
		this.addr=addr;
	}
	String getAddress(){
		return addr;
	}
	
	void setFullName(String fullnm){
		this.fullnm=fullnm;
	}
	String getFullName(){
		return fullnm;
	}
	
	void display(){
	
		System.out.println("Full Name : "+this.getFullName());
		System.out.println("Address : "+this.getAddress());
		System.out.println("Roll Number : "+this.getRollNumber());
		System.out.println("Phone Number : "+this.getPhoneNumber());
	
	}

}
