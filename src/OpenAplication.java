
import java.io.IOException;


public class OpenAplication {
    public static void ExecuteProgram() throws IOException{
        Runtime r = Runtime.getRuntime();
        
        Process p = null;
        String location = "C:\\Users\\Jorge\\Desktop\\Semestre 2016 B\\Visual Boy Advance 1.8.0 By darkflag301\\VisualBoyAdvance.exe";
        try{
            p = r.exec(location);
            while(true){
                if(p.isAlive()){
                    System.out.println("El proceso esta corriendo");
                }
                else{
                    System.out.println("El proceso ha terminado.");
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Error al ejecutar");
        }
    }
    
    
    public static void main(String argv[]) throws IOException{
        ExecuteProgram();
    }
    
}
