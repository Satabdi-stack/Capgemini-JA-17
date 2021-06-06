package lab8;

import java.io.File;

public class FileProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File sm_source=new File("C:\\Users\\HP\\Desktop\\capgeminicode\\LabBookCapgemini\\src\\lab8\\source.txt"); // initializing Satabdi's source file
		File sm_target=new File("C:\\Users\\HP\\Desktop\\capgeminicode\\LabBookCapgemini\\src\\lab8\\target.txt"); // initializing Satabdi's target file
		CopyDataThread cdt = new CopyDataThread(sm_source,sm_target);
		cdt.start();
	}

}
