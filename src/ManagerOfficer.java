
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AD
 */
public class ManagerOfficer {
    private List<Officer> officers;

    public ManagerOfficer() {
        this.officers = new ArrayList<>();
    }
    
    public void addOfficer(Officer officer){
        this.officers.add(officer);
    }
    
    public List<Officer> searchOfficerByName(String name){
        return this.officers.stream().filter(o -> o.getName().contains(name)).collect(Collectors.toList());
    }
    
    public void showListInforOfficer(){
        this.officers.forEach(o -> System.out.println(o.toString()));
    }
}
