package lab3;


public class ReportService {
    private String output = "";
    
    public void addOutputDataToString(String data){
        output += data;
    }
    
    public void outputReport(){
        System.out.println(output);
    }
}
