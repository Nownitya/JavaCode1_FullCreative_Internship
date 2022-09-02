package marks;

public class StudentMarksheet {
    int maths;
    int sciences;
    int englishs;
    int hindis;

    public int sub(int math, int science,int english,int hindi) {
        maths = math;
        sciences = science;
        englishs = english;
        hindis = hindi;
		
        int add = maths + sciences + englishs + hindis;
        int per = (add * 100) / 400;
        
		
		return per;
    }



}