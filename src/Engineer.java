/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AD
 */
public class Engineer extends Officer{
    private String branch;

    public Engineer(String name, int age, String gender, String address, String branch) {
        super(name, age, gender, address);
        this.branch = branch;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "      Engineer: " + "\n Name : " + name + ' ' + "\n Age : " + age + "\n Gender : " + gender + ' ' + "\n Address : " + address + ' ' + "\n Branch : " + branch;
    }
    
    
    
}
