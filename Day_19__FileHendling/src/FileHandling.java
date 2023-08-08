import java.io.File;

public class FileHandling {
	
	public static void main(String[] args) {
		
		
		String dirPath="d://abc.txt";
		
		File dir= new File(dirPath);
		
		if(dir.exists()&& dir.isDirectory()) {
			File[] f1= dir.listFiles();
			
			if(f1 != null) {
				System.out.println("Existing Files :");
				
				for(File f2:f1) {
					if(f2.isFile()) {
						System.out.println("The directory is empty");
					}
				}
			}
			else {
				System.out.println("The directory is emthy ");
			}
		}
		else {
			System.out.println("The Directory does not existing....");
		}
	}

}
