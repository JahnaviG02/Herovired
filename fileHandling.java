import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        

        String[] arr ={
            "India is a strong nation",
            "India is a democratic soil",
            
        };
        
        try{
            File myObj = new File("test.txt");
            myObj.createNewFile();
            Scanner sc = new Scanner(myObj);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
                FileWriter writer = new FileWriter("test.txt");
            for(String str : arr){
                writer.write(str+"\n");
            }
            writer.close();
        
            }
            sc.close();
        }catch(Exception e){
            e.printStackTrace();
        }
       
    }
}